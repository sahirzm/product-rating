package in.ac.vit.productrating.controllers;

import in.ac.vit.productrating.model.Product;
import in.ac.vit.productrating.model.UserRoles;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Secured(value = { UserRoles.ADMIN })
	@RequestMapping(value = "/create.do", method = RequestMethod.GET)
	public String create(Model model) {
		model.addAttribute("product", new Product());
		return "product/form";
	}
}