package ru.vladuss.learn.ordermicroservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.vladuss.learn.ordermicroservice.constants.Status;

import java.time.LocalDate;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order extends BaseEntity {

    @Column(name = "orderDate")
    private LocalDate orderDate;

    @Column(name = "returnDate")
    private LocalDate returnDate;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "price")
    private Integer price;

    @Column(name = "isInStock")
    private Boolean isInStock;
}
