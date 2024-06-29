package ru.vladuss.learn.bookmicroservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vladuss.learn.bookmicroservice.models.Book;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface IBookRepository extends JpaRepository<Book, UUID> {

    Optional<Book> findByName(String name);
}
