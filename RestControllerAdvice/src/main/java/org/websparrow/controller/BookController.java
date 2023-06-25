package org.websparrow.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.websparrow.dto.BookDTO;
import org.websparrow.exception.BookNotFoundException;
import org.websparrow.service.BookService;

@RestController
@AllArgsConstructor
@RequestMapping("/book")
public class BookController {

    @Autowired
    private final BookService bookService;

    @GetMapping("/test")
    public String testing(){
        return "Hello Testing";
    }

    @GetMapping("/{id}")
    public BookDTO getBook(@PathVariable("id") long id) {

        // Retrieve the book from the database
        BookDTO book = bookService.getBook(id);

        // If the book does not exist, throw BookNotFoundException
        if (null == book) {
            throw new BookNotFoundException("Book with ID " + id + " not found");
        }

        return book;

    }

    // Other controller methods
}