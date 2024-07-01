package ru.vladuss.userservice.services.dtos;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseDTO {
    private UUID uuid;
}
