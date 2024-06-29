package ru.vladuss.learn.librarymanagementsystem.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vladuss.learn.librarymanagementsystem.models.User;
import ru.vladuss.learn.librarymanagementsystem.repositories.IUserRepository;
import ru.vladuss.learn.librarymanagementsystem.services.IUserService;
import ru.vladuss.learn.librarymanagementsystem.services.dtos.EditUserDTO;
import ru.vladuss.learn.librarymanagementsystem.services.dtos.GetAllUserDTO;
import ru.vladuss.learn.librarymanagementsystem.services.dtos.RegisterUserDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService<String> {
    private IUserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserService(IUserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }


    @Autowired
    public void setUserRepository(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public void deleteByUuid(UUID userUuid) {
        userRepository.deleteById(userUuid);
    }

    @Override
    public List<GetAllUserDTO> getAll() {
        return userRepository.findAll().stream().map(user -> modelMapper.map(user, GetAllUserDTO.class)).collect(Collectors.toList());
    }

    @Override
    public User getUserByName(String name) {
        return userRepository.findByFirstName(name).orElseThrow();
//                (() -> new UsernameNotFoundException(name + "was not found!!!"));
    }

    @Override
    public EditUserDTO editUser(EditUserDTO editUser) {
        return null;
    }

    @Override
    public Optional<User> findUserByUUID(UUID uuid) {
        return Optional.ofNullable(modelMapper.map(userRepository.findById(uuid), User.class));
    }
}
