package ru.vladuss.learn.bookmicroservice.services.impl;

import org.springframework.stereotype.Service;
import ru.vladuss.learn.bookmicroservice.models.Book;
import ru.vladuss.learn.bookmicroservice.services.IBookService;
import ru.vladuss.learn.bookmicroservice.services.dtos.CreateBookDTO;
import ru.vladuss.learn.bookmicroservice.services.dtos.EditBookDTO;
import ru.vladuss.learn.bookmicroservice.services.dtos.GetAllBooksDTO;
import ru.vladuss.learn.bookmicroservice.services.dtos.GetCurrentBookDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookService implements IBookService {
    @Override
    public CreateBookDTO create(CreateBookDTO createBookDTO) {
        return null;
    }

    @Override
    public List<GetAllBooksDTO> getAll() {
        return null;
    }

    @Override
    public void deleteByUuid(UUID uuid) {

    }

    @Override
    public GetCurrentBookDTO getByName(Object name) {
        return null;
    }

    @Override
    public EditBookDTO editBook(EditBookDTO editBookDTO) {
        return null;
    }

    @Override
    public Optional<Book> getBookByUuid(UUID uuid) {
        return Optional.empty();
    }
}
