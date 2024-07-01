package ru.vladuss.orderservice.services.dtos;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.vladuss.orderservice.constants.Status;

import java.time.LocalDate;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseDto {

    private LocalDate orderDate;

    private LocalDate returnDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    private Integer price;

    private Boolean isInStock;
}
