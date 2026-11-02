package com.example.library;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private static final Logger log = LoggerFactory.getLogger(BookService.class);

    private final BookRepository repository;

    // Constructor injection: Spring gives us the BookRepository bean
    public BookService(BookRepository repository) {
        this.repository = repository;
        log.info("BookService created");
    }

    public List<String> getAllBooks() {
        return repository.findAll();
    }

    public String getSummary() {
        return "The library has " + repository.count() + " books";
    }
}
