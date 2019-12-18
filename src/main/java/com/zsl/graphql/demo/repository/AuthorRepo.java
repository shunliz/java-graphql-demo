package com.zsl.graphql.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zsl.graphql.demo.model.Author;


/**
 * @author hanliwei
 * @create 2019-02-12 17:29
 */
public interface AuthorRepo extends JpaRepository<Author,Long> {

    Author findAuthorById(Long id);
}
