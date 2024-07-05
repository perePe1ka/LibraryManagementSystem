package ru.vladuss.orderservice.services;

import ru.vladuss.orderservice.constants.Status;
import ru.vladuss.orderservice.models.Order;
import ru.vladuss.orderservice.services.dtos.EditOrderDTO;
import ru.vladuss.orderservice.services.dtos.GetAllOrdersDTO;
import ru.vladuss.orderservice.services.dtos.GetCurrentOrderDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IOrderService<String> {
    Order create(Order order);

    List<GetAllOrdersDTO> getAll();

    GetCurrentOrderDTO getByStatus(Status status);

    EditOrderDTO editBook(EditOrderDTO editOrderDTO);

    Optional<Order> getOrderById(UUID uuid);

    void deleteByUuid(UUID uuid);


}
