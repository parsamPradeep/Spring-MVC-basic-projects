package com.chuck.norris.service;


import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class CheckNorrisQuoteImpl implements ChuckNorrisQuote {
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public CheckNorrisQuoteImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
