package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String index() {
		return "<h1>Hello! Spring Boot!!</h1>"
				+ "<a href='https://github.com/tatsuya828828'><button>github</button></a>"
				+ "<br>"
				+ "<a href='https://o-space.jp'><button>Our Space</button></a>";
	}
}
