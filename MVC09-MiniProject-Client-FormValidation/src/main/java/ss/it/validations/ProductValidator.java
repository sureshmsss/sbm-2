package ss.it.validations;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ss.it.entity.Product;

@Component
public class ProductValidator implements Validator {
	public ProductValidator() {
		System.out.println("ProductValidator.ProductValidator()");
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(Product.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("ProductValidator.validate()(server side form validations)");
		// type casting
		Product product = (Product) target;

		// form validation logics
		// required rule name
		if (product.getPname() == null || product.getPname().length() == 0 || product.getPname().equals(""))
			errors.rejectValue("pname", "pname.required");
		else if (product.getPname().length() > 10)
			errors.rejectValue("pname", "pname.required");

		// required price value
		if (product.getPrice() == null)
			errors.rejectValue("price", "price.required");
		else if (product.getPrice() < 1)
			errors.rejectValue("price", "price.required");
		// required qty value
		if (product.getQty() == null)
			errors.rejectValue("qty", "qty.required");
		else if (product.getQty() < 1)
			errors.rejectValue("qty", "qty.required");

	}

}
