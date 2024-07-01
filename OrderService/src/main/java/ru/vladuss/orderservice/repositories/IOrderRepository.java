package ru.vladuss.orderservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vladuss.orderservice.constants.Status;
import ru.vladuss.orderservice.models.Order;
import ru.vladuss.orderservice.services.dtos.GetCurrentOrderDTO;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface IOrderRepository extends JpaRepository<Order, UUID> {
    Optional<GetCurrentOrderDTO> findByStatus(Status status);
}
