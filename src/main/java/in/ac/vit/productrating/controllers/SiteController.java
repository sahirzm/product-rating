package in.ac.vit.productrating.controllers;

import in.ac.vit.productrating.model.UserRoles;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {

	@Secured({ UserRoles.ADMIN, UserRoles.EMPLOYEE, UserRoles.CUSTOMER,
			UserRoles.OWNER })
	@RequestMapping(value = { "/index.html", "/", "index.jsp", "welcome.jsp" })
	public String index(Model model) {
		return "home";
	}

	@RequestMapping(value = "/resourceNotFound")
	public String resourceNotFound() {
		return "404";
	}
}
