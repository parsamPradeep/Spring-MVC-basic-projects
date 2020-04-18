package com.spring.dev.Development.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.dev.Development.repo.PublisherRepo;

@Controller
public class PublisherController {
	private PublisherRepo publisherRepo;
	
	public PublisherController(PublisherRepo publisherRepo) {
		this.publisherRepo = publisherRepo;
	}

	@RequestMapping("/publisher")
	public String getPublishers(Model model) {
		model.addAttribute("publishers", publisherRepo.findAll());
		return "publishers";
	}

}
