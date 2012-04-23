package com.fdm.springMVCIntro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;


@Controller
public class HomeController {

	@RequestMapping("/")
	public String homeHandler(Model model){
		model.addAttribute("user", new User());
		return "home";
	}

	@RequestMapping(value="/submit", method=POST)
	public String submitHandler(User user, Model model){
		model.addAttribute("user",user);
		return "view";
	}

}
