package ru.vladuss.learn.bookmicroservice.services;

import ru.vladuss.learn.bookmicroservice.models.Book;
import ru.vladuss.learn.bookmicroservice.services.dtos.CreateBookDTO;
import ru.vladuss.learn.bookmicroservice.services.dtos.EditBookDTO;
import ru.vladuss.learn.bookmicroservice.services.dtos.GetAllBooksDTO;
import ru.vladuss.learn.bookmicroservice.services.dtos.GetCurrentBookDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IBookService<String> {
    CreateBookDTO create(CreateBookDTO createBookDTO);

    List<GetAllBooksDTO> getAll();

    void deleteByUuid(UUID uuid);

    GetCurrentBookDTO getByName(String name);

    EditBookDTO editBook(EditBookDTO editBookDTO);

    Optional<Book> getBookByUuid(UUID uuid);
}
