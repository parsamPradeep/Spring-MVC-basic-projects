package com.spring.dev.Development.repo;

import org.springframework.data.repository.CrudRepository;

import com.spring.dev.Development.model.Author;
/**
 * 
 * @author pradeep
 *
 */

public interface AuthorRepo extends CrudRepository<Author, Long> {

}
