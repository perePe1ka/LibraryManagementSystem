package ru.vladuss.bookservice.controllers;

import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vladuss.bookservice.models.Book;
import ru.vladuss.bookservice.services.dtos.GetAllBooksDTO;
import ru.vladuss.bookservice.services.impl.BookService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/books")
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/getAllBooks")
    ResponseEntity<List<GetAllBooksDTO>> getAllBooks() {
        List<GetAllBooksDTO> getAllBooksDTOList = bookService.getAll();
        return ResponseEntity.ok(getAllBooksDTOList);
    }

    @PostMapping("/createBook")
    ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book newBook = bookService.create(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(newBook);
    }

    @GetMapping("/{id}")
    ResponseEntity<Book> getBookByUuid(@PathVariable String uuid) {
        return ResponseEntity.ok(bookService.getBookByUuid(uuid));
    }
}
