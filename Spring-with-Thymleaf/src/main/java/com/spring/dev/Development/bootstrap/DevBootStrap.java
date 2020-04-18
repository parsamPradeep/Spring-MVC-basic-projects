package com.spring.dev.Development.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.spring.dev.Development.model.Author;
import com.spring.dev.Development.model.Book;
import com.spring.dev.Development.model.Publisher;
import com.spring.dev.Development.repo.AuthorRepo;
import com.spring.dev.Development.repo.BookRepo;
import com.spring.dev.Development.repo.PublisherRepo;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {
	private AuthorRepo authorRepo;
	private BookRepo bookRepo;
	private PublisherRepo publisherRepo;
	
	public DevBootStrap(AuthorRepo authorRepo, BookRepo bookRepo, PublisherRepo publisherRepo) {
		super();
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
		this.publisherRepo=publisherRepo;
	}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		init();
		
	}
	private void init() {
		Author pradeep=new Author("pradeep","parsam");
		Publisher publisher=new Publisher("swapna book house","banglore");
		Book book=new Book("Spring","1234",publisher);
		pradeep.getBooks().add(book);
		book.getAuthors().add(pradeep);
		publisherRepo.save(publisher);
		authorRepo.save(pradeep);
		bookRepo.save(book);
		
	}

}
