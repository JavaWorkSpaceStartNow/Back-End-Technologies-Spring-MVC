package B_SpringConfiguration.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import C_SpringConfiguration.Entity.A_User;

@Controller
@RequestMapping("/signUp")
public class B_HomeController {

	// need a controller method to show the initial HTML form

	@RequestMapping("/")
	public String homePage(Model model) {
		// We Can Also Create Only Model And Add Message To The Model
		model.addAttribute("user", new A_User());

		// Return Html Page
		return "b_sign_up";
	}

	@RequestMapping("/saveUser")
	public String saveUser(Model model, @ModelAttribute("user") A_User user) {
		// Here @ModelAttribute Is Used For Get The Value From Object By Using Form
		// We Can Also Create Only Model And Add Message To The Model
		model.addAttribute("user", user);

		// Return Html Page
		return "c_user_list";
	}

}
