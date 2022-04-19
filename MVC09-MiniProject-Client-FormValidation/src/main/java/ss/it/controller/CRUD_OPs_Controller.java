package ss.it.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ss.it.entity.Product;
import ss.it.service.ICRUDService;
import ss.it.validations.ProductValidator;

@Controller
public class CRUD_OPs_Controller {
	@Autowired
	private ICRUDService service;
	@Autowired
	private ProductValidator productValidator;

	@GetMapping("/")
	public String showHome() {
		System.out.println("home-GetMapping()");
		// return lvn
		return "home";
	}

	// using the HttpSession Attributes approach
	@GetMapping("/report")
	public String showReport(Map<String, Object> map) {
		System.out.println("report-getMapping()");
		// get the product report
		List<Product> list = service.getAll();
		// put the results to model attribute
		map.put("empReport", list);
		// return lvn
		return "product_report";
	}

	@GetMapping("/add")
	public String showAddProduct(@ModelAttribute("p") Product p) {
		System.out.println("add-getMapping()");
		p.setPname("pname");
		// return lvn
		return "product_register";
	}

	@PostMapping("/add")
	public String addProduct(RedirectAttributes attr, @ModelAttribute("p") Product prod, BindingResult errors) {
		System.out.println("add-PostMapping()");
		// enable serever side form validation errors only when client side form
		// validation are not done
		if (prod.getVflag().equalsIgnoreCase("no")) {
			// checking for type mismatch errors
			if (errors.hasFieldErrors())
				return "product_register";

			// checking form validation errors
			if (productValidator.supports(prod.getClass())) {
				productValidator.validate(prod, errors);// T
				if (errors.hasErrors())
					return "product_register";
			}
		}
		// application specific errors
		if (prod.getQty() < 2) {
			errors.rejectValue("qty", "qtyVal.required");
			return "product_register";
		}
		// use service
		String result = service.registerProduct(prod);
		// keep results in model attributes(Redirect Attributes)
		attr.addFlashAttribute("resultMsg", result);
		// return lvn
		return "redirect:report";
	}

	@GetMapping("/edit")
	public String showEditProduct(@RequestParam("id") Integer id, @ModelAttribute("p") Product product) {
		// get product details dynamically of given id
		Product product1 = service.getProductByNo(id);
		// always make sure that BeanUtils.copyProperties(Object source, Object target)
		BeanUtils.copyProperties(product1, product);
		// return LVN
		return "edit_product";
	}

	@PostMapping("/edit")
	public String editProduct(@ModelAttribute("p") Product product, Map<String, Object> map, BindingResult errors) {

		if (productValidator.supports(product.getClass())) {
			productValidator.validate(product, errors);// T

			if (errors.hasErrors())
				return "edit_product";

		}
		// get product details dynamically of given id
		String result = service.updateProduct(product);
		List<Product> list = service.getAll();
		// keep results in model attributes
		map.put("resultMsg", result);
		map.put("empReport", list);
		// return LVN
		return "product_report";
	}

	@GetMapping("/delete")
	public String deleteProduct(RedirectAttributes attr, @RequestParam("id") Integer id) {
		String result = service.remove(id);
		List<Product> list = service.getAll();

		// keep the results in model attributes
		attr.addFlashAttribute("resultMsg", result);

		// return lvn
		return "redirect:report";
	}

}
