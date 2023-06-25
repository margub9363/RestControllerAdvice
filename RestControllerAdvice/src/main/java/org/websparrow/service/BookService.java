package org.websparrow.service;

import org.springframework.stereotype.Service;
import org.websparrow.dto.BookDTO;

import java.util.List;
import java.util.Objects;

@Service
public class BookService {

    // Simulate the actual database call here
    public BookDTO getBook(long id) {

        return bookRepo().stream()
                .filter(e -> Objects.equals(e.getId(), id))
                .findFirst()
                .orElse(null);
    }

    private List<BookDTO> bookRepo() {

        return List.of(
                new BookDTO(1L, "My Life History", "Rahman"),
                new BookDTO(2L, "Your Life History Gita", "Tannu"),
                new BookDTO(3L, "Sampoorna Sarvanash", "Ethan Hunt"),
                new BookDTO(4L, "Rich Dad Poor Dad", "Hunter")
        );
    }
}