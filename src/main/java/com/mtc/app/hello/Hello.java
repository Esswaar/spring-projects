package com.mtc.app.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "hi";
	}
	
	@RequestMapping("/sum")
	public String sum() {
		return "hi this is eswar";
	}

}
