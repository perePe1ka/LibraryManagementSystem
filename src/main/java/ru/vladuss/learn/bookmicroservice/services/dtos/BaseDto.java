package ru.vladuss.learn.bookmicroservice.services.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseDto {
    private UUID uuid;

    private String name;

    private String cost;

    private String pages;

    private String author;

    private LocalDate dateOfManufacture;
}
