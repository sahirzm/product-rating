package in.ac.vit.productrating.validators;

import in.ac.vit.productrating.model.Product;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ProductValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Product.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Product p = (Product) target;

		if (p.getCreatedon() == null) {
			errors.rejectValue("createdOn", "product.createdOn.empty");
		}
	}

}
name",
				"product.name.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "keywords",
				"product.keywords.empty");
		if (p.getCreatedon() == null) {
			errors.rejectValue("createdOn", "product.createdOn.empty");
		}
	}

}
