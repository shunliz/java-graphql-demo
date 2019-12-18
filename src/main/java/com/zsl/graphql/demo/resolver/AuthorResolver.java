package com.zsl.graphql.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.zsl.graphql.demo.model.Author;
import com.zsl.graphql.demo.model.Book;
import com.zsl.graphql.demo.repository.BookRepo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author hanliwei
 * @create 2019-02-12 17:33
 */
@Component
@AllArgsConstructor
public class AuthorResolver implements GraphQLResolver<Author> {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private BookRepo bookRepo;

    public String getCreatedTime(Author author) {
        return sdf.format(author.getCreatedTime());
    }

    public List<Book> getBooks(Author author) {
        return bookRepo.findByAuthorId(author.getId());
    }
}
