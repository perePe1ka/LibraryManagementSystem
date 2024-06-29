package ru.vladuss.learn.bookmicroservice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "books")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "cost")
    private String cost;

    @Column(name = "pages")
    private String pages;

    @Column(name = "author")
    private String author;

    @Column(name = "dateOfManufacture")
    private LocalDate dateOfManufacture;
}
