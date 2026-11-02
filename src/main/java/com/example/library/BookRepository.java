package com.example.library;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    private static final Logger log = LoggerFactory.getLogger(BookRepository.class);

    // For now the "database" is a list in memory (JPA and H2 in session 11)
    private final List<String> books = new ArrayList<>(List.of(
            "Clean Code",
            "The Pragmatic Programmer",
            "Head First Java"));

    public BookRepository() {
        log.info("BookRepository created");
    }

    public List<String> findAll() {
        return books;
    }

    public int count() {
        return books.size();
    }
}
