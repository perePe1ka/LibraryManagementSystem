package ru.vladuss.learn.ordermicroservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vladuss.learn.ordermicroservice.constants.Status;
import ru.vladuss.learn.ordermicroservice.models.Order;

import java.util.Optional;
import java.util.UUID;

public interface IOrderRepository extends JpaRepository<Order, UUID> {
    Optional<Order> findByStatus(Status status);
}
