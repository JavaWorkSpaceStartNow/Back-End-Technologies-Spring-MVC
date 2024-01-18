package B_SpringConfiguration.Controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import C_SpringConfiguration.Entity.B_ValidateFields;

@Controller
@RequestMapping("/signUpValidation")
public class C_HomeController {

	// add an initbinder ... to convert trim input strings
	// remove leading and trailing whitespace
	// resolve issue for our validation
	// If We can use @Empty Than there are not need to write this

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	// need a controller method to show the initial HTML form

	@RequestMapping("/")
	public String homePage(Model model) {
		model.addAttribute("user", new B_ValidateFields());
		return "d_signup_with_validation";
	}

	@RequestMapping("/saveUser")
	public String saveUser(Model model, @Valid @ModelAttribute("user") B_ValidateFields user,
			BindingResult bindingResult) {
		//System.out.println("===>" + bindingResult);
		if (bindingResult.hasErrors()) {
			return "d_signup_with_validation";
		}
		model.addAttribute("user", user);
		return "c_user_list";
	}

}
