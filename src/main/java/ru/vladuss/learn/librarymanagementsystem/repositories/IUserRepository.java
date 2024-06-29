package ru.vladuss.learn.librarymanagementsystem.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vladuss.learn.librarymanagementsystem.models.User;

import java.util.UUID;

@Repository
public interface IUserRepository extends CrudRepository<User, UUID> {
}
