package ru.vladuss.learn.librarymanagementsystem.services;

import ru.vladuss.learn.librarymanagementsystem.models.User;
import ru.vladuss.learn.librarymanagementsystem.services.dtos.EditUserDTO;
import ru.vladuss.learn.librarymanagementsystem.services.dtos.GetAllUserDTO;
import ru.vladuss.learn.librarymanagementsystem.services.dtos.RegisterUserDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IUserService<String> {

    User create(User user);

    void deleteByUuid(UUID userUuid);

    List<GetAllUserDTO> getAll();

    User getUserByName(String name);

    EditUserDTO editUser(EditUserDTO editUser);

    Optional<User> findUserByUUID(UUID uuid);

}
