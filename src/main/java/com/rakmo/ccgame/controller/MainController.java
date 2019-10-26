package com.rakmo.ccgame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@GetMapping(value = "/start")
	public String startGame() {

		return "color-code-start";
	}
	
	@GetMapping(value = "/game")
	public String game(@RequestParam("level") String level,ModelMap model) {
		System.out.println("level is "+level);
		model.addAttribute("level", level);
		return  "color-code";
	}

}
