package com.spring.dev.Development.repo;

import org.springframework.data.repository.CrudRepository;

import com.spring.dev.Development.model.Book;
/**
 * 
 * @author pradeep
 *
 */
public interface BookRepo extends CrudRepository<Book, Long>{

}
