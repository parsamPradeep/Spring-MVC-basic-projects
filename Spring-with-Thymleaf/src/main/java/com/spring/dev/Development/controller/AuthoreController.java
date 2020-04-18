package com.spring.dev.Development.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.dev.Development.repo.AuthorRepo;

@Controller
public class AuthoreController {
	
	private AuthorRepo authorRepo;

	public AuthoreController(AuthorRepo authorRepo) {
		super();
		this.authorRepo = authorRepo;
	}
	
	@RequestMapping("/author")
	public String getAuthors(Model model) {
		model.addAttribute("authors", authorRepo.findAll());
		return "authors";
	}

}
