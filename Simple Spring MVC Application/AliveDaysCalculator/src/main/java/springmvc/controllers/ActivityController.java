package springmvc.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;

@Controller
public class ActivityController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String viewRegistration(Model model) {
		User user = new User();
		model.addAttribute("userForm", user);
		return "home";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String processReg(@ModelAttribute("userForm") User user, BindingResult result, ModelMap model) {

		if (user.getBirthDate() != null && !user.getUserName().isEmpty()) {
			model.addAttribute("name", user.getUserName());
			model.addAttribute("date", user.getAliveDays());
			return "result";
		} else {
			user = new User();
			model.addAttribute("userForm", user);			
			return "home";

		}

	}

}
