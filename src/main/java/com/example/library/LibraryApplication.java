package com.example.library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LibraryApplication {

    private static final Logger log = LoggerFactory.getLogger(LibraryApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(LibraryApplication.class, args);

        // Extra: ask the container for a bean (we do NOT use new)
        BookService service = context.getBean(BookService.class);
        log.info("From main: {}", service.getSummary());
        log.info("Beans in the container: {}", context.getBeanDefinitionCount());
    }
}
