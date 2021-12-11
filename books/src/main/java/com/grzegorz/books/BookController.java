package com.grzegorz.books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @GetMapping
    public List<Book> getBooks() {
        return getBooksFromMemory();
    }

    private List<Book> getBooksFromMemory() {
        return Arrays.asList(new Book(1L, "traktor"), new Book(2L, "Stodoła"));
    }
}
