package com.sb.jpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DevController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String even() {
		int no=18;
		if (no%2==0) {
			System.out.println("this is even number");
		}
		return "this is even number go ahead!11..............";
	}

}
