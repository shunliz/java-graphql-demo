package com.zsl.graphql.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.zsl.graphql.demo.model.Author;
import com.zsl.graphql.demo.model.Book;
import com.zsl.graphql.demo.repository.AuthorRepo;
import com.zsl.graphql.demo.repository.BookRepo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hanliwei
 * @create 2019-02-12 18:00
 */
@Component
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {

    private AuthorRepo authorRepo;

    private BookRepo bookRepo;

    public Author findAuthorById(Long id) {
        return authorRepo.findAuthorById(id);
    }

    public List<Author> findAllAuthors() {
        return authorRepo.findAll();
    }

    public Long countAuthors() {
        return authorRepo.count();
    }

    public List<Book> findAllBooks() {
        return bookRepo.findAll();
    }

    public Long countBooks() {
        return bookRepo.count();
    }
}