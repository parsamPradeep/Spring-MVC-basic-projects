package com.chuck.norris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chuck.norris.service.ChuckNorrisQuote;
@Controller
public class ChuckNorrisController {
	private ChuckNorrisQuote chuckNorrisQuote;
	
	public ChuckNorrisController(ChuckNorrisQuote chuckNorrisQuote) {
		this.chuckNorrisQuote = chuckNorrisQuote;
	}
	
	@RequestMapping({"/",""})
	public String showJoke(Model model) {
		model.addAttribute("joke", chuckNorrisQuote.getJoke());
		return "chucknorris";
	}
}
