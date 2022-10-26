package jpabook.jpashop;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
public class HelloController {

	@GetMapping("hello")
	public String hello(Model model) {
		model.addAttribute("data","hello!");
		return "hello";
	}
}
