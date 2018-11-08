package com.tsr.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePage {
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}

}
