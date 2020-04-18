package com.spring.dev.Development.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.dev.Development.repo.BookRepo;

@Controller
public class BookController {
	
	private BookRepo bookRepo;
	
	public BookController(BookRepo booRepo) {
		this.bookRepo = booRepo;
	}

	@RequestMapping("/book")
	public String getAllBookd(Model model) {
		model.addAttribute("books",bookRepo.findAll());
		return "books";
	}

}
