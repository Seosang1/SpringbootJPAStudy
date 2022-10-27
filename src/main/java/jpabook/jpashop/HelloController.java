package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	/*
	 * @RequestMapping("/")
	 * 
	 * @ResponseBody public String home() { System.out.println("home in"); return
	 * "index"; }
	 */
	
	@GetMapping("/hello")
	public String hello(Model model) {
		System.out.println("hello in ");
		model.addAttribute("data","hello!");
		System.out.println("model >>> "+ model.toString());
		return "hello";
	}
}
