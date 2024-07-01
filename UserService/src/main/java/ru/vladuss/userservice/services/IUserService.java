package ru.vladuss.userservice.services;


import ru.vladuss.userservice.models.User;
import ru.vladuss.userservice.services.dtos.EditUserDTO;
import ru.vladuss.userservice.services.dtos.GetAllUserDTO;

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
