package com.example.library;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private static final Logger log = LoggerFactory.getLogger(BookController.class);

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
        log.info("BookController created");
    }

    @GetMapping("/books")
    public List<String> books() {
        return service.getAllBooks();
    }

    @GetMapping("/books/summary")
    public String summary() {
        return service.getSummary();
    }
}
