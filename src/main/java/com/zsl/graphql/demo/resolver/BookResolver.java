package com.zsl.graphql.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.zsl.graphql.demo.model.Author;
import com.zsl.graphql.demo.model.Book;
import com.zsl.graphql.demo.repository.AuthorRepo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;


/**
 * @author hanliwei
 * @create 2019-02-12 17:36
 */
@Component
@AllArgsConstructor
public class BookResolver implements GraphQLResolver<Book> {

    private AuthorRepo authorRepo;

    public Author getAuthor(Book book) {
        return authorRepo.findAuthorById(book.getAuthorId());
    }
}
