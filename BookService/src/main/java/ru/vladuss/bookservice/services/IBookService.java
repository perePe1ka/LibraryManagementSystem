package ru.vladuss.bookservice.services;

import ru.vladuss.bookservice.models.Book;
import ru.vladuss.bookservice.services.dtos.EditBookDTO;
import ru.vladuss.bookservice.services.dtos.GetAllBooksDTO;
import ru.vladuss.bookservice.services.dtos.GetCurrentBookDTO;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IBookService<String> {
    Book create(Book book);

    List<GetAllBooksDTO> getAll();

    void deleteByUuid(UUID uuid);

    GetCurrentBookDTO getByName(String name);

    EditBookDTO editBook(EditBookDTO editBookDTO);

    Optional<Book> getBookByUuid(UUID uuid);
}
