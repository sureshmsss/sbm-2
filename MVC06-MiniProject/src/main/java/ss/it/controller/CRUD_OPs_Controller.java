package ss.it.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ss.it.entity.Product;
import ss.it.service.ICRUDService;

@Controller
public class CRUD_OPs_Controller {
	@Autowired
	private ICRUDService service;

	@GetMapping("/")
	public String showHome() {
		// return lvn
		return "home";
	}

	@GetMapping("/report")
	public String showReport(Map<String, Object> map) {
		// get the product report
		List<Product> list = service.getAll();

		// put the results to model attribute
		map.put("empReport", list);
		// return lvn
		return "product_report";
	}

	@GetMapping("/add")
	public String showAddProduct(@ModelAttribute("p") Product p) {
		p.setPname("pname");
		// return lvn
		return "product_register";
	}

	@PostMapping("/add")
	public String addProduct(Map<String, Object> map, @ModelAttribute("prod") Product prod) {

		String result = service.registerProduct(prod);
		List<Product> list = service.getAll();

		// keep results in model attributes
		map.put("resultMsg", result);
		map.put("empReport", list);

		// return lvn
		return "product_report";
	}

	@GetMapping("/edit")
	public String showEditProduct(@RequestParam("id") Integer id, @ModelAttribute("p") Product product) {
		// get product details dynamically of given id
		Product product1= service.getProductByNo(id);
		//always make sure that BeanUtils.copyProperties(Object source, Object target)
		BeanUtils.copyProperties(product1, product);
		// return LVN
		return "edit_product";
	}

	@PostMapping("/edit")
	public String editProduct(@ModelAttribute("p") Product product, Map<String, Object> map) {
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
	public String deleteProduct(Map<String, Object> map, @RequestParam("id") Integer id) {
		String result = service.remove(id);
		List<Product> list = service.getAll();

		// keep the results in model attributes
		map.put("resultMsg", result);
		map.put("empReport", list);

		// return lvn
		return "product_report";
	}

}
