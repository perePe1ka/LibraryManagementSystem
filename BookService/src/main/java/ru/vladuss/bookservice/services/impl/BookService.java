package ru.vladuss.bookservice.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vladuss.bookservice.models.Book;
import ru.vladuss.bookservice.repositories.IBookRepository;
import ru.vladuss.bookservice.services.IBookService;
import ru.vladuss.bookservice.services.dtos.EditBookDTO;
import ru.vladuss.bookservice.services.dtos.GetAllBooksDTO;
import ru.vladuss.bookservice.services.dtos.GetCurrentBookDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class BookService implements IBookService<String> {
    private final ModelMapper modelMapper;

    private IBookRepository bookRepository;

    @Autowired
    public BookService(ModelMapper modelMapper, IBookRepository bookRepository) {
        this.modelMapper = modelMapper;
        this.bookRepository = bookRepository;
    }

    @Autowired
    public void setBookRepository(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public Book create(Book book) {
        return bookRepository.saveAndFlush(book);
    }

    @Override
    public List<GetAllBooksDTO> getAll() {
        return bookRepository.findAll().stream().map(book -> modelMapper.map(book, GetAllBooksDTO.class)).collect(Collectors.toList());
    }

    @Override
    public void deleteByUuid(UUID uuid) {
        bookRepository.deleteById(uuid);
    }

    @Override
    public GetCurrentBookDTO getByName(String name) {
        return bookRepository.findByName(name).orElseThrow();
    }

    @Override
    public EditBookDTO editBook(EditBookDTO editBookDTO) {
        return null;
    }

    @Override
    public Optional<Book> getBookByUuid(UUID uuid) {
        return Optional.ofNullable(modelMapper.map(bookRepository.findById(uuid), Book.class));
    }
}
