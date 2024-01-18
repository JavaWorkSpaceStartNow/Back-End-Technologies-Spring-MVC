package B_SpringConfiguration.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/calculation")
public class A_HomeController {

	// need a controller method to show the initial HTML form

	@RequestMapping("/add")
	public String homePage() {
		return "a_cal_page";
	}

	// need a controller method to show the initial HTML form

//	@RequestMapping("/getResult")
//	public ModelAndView getResult(HttpServletRequest request, HttpServletResponse response) {
//		// read the request parameter from the HTML form
//		String t1 = request.getParameter("t1");

//		// read the request parameter from the HTML form
//		String t2 = request.getParameter("t2");
//
//		// Create Model And View
//		ModelAndView mv = new ModelAndView();

//		// add message to the model
//		mv.setViewName("a_cal_page");
//
//		if (!StringUtils.isEmpty(t1) && !StringUtils.isEmpty(t2)) {
//			double t3 = Double.parseDouble(t1) + Double.parseDouble(t2);
//			mv.addObject("result", t3);
//		} else {
//			mv.addObject("result", "Please Enter Value Of T1 And T2");
//		}
//
//		return mv;
//	}

	// For Reading HTML Form Data with @RequestParam Annotation
	// need a controller method to show the initial HTML form

	@RequestMapping("/getResult")
	public ModelAndView getResult(@RequestParam("t1") String t1, @RequestParam("t2") String t2) {

		// Create Model And View
		ModelAndView mv = new ModelAndView();

		// add message to the model
		mv.setViewName("a_cal_page");

		// For Check value is empty or not
		if (!StringUtils.isEmpty(t1) && !StringUtils.isEmpty(t2)) {
			double t3 = Double.parseDouble(t1) + Double.parseDouble(t2);
			mv.addObject("result", t3);
		} else {
			mv.addObject("result", "Please Enter Value Of Number1 And Number2");
		}

		return mv;
	}
}
