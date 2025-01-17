package ru.vladuss.orderservice.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.vladuss.orderservice.constants.Status;
import ru.vladuss.orderservice.models.Order;
import ru.vladuss.orderservice.repositories.IOrderRepository;
import ru.vladuss.orderservice.services.IOrderService;
import ru.vladuss.orderservice.services.dtos.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class OrderService implements IOrderService<String> {
    private final ModelMapper modelMapper;

    private IOrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    public OrderService(ModelMapper modelMapper, IOrderRepository orderRepository, RestTemplate restTemplate) {
        this.modelMapper = modelMapper;
        this.orderRepository = orderRepository;
        this.restTemplate = restTemplate;
    }

    @Autowired
    public void setOrderRepository(IOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Override
    public Order create(Order order) {
        return orderRepository.saveAndFlush(order);
    }

    @Override
    public List<GetAllOrdersDTO> getAll() {
        return orderRepository.findAll().stream().map(order -> modelMapper.map(order, GetAllOrdersDTO.class)).collect(Collectors.toList());
    }

    @Override
    public GetCurrentOrderDTO getByStatus(Status status) {
        return orderRepository.findByStatus(status).orElseThrow();
    }

    @Override
    public EditOrderDTO editBook(EditOrderDTO editOrderDTO) {
        return null;
    }

    @Override
    public Optional<Order> getOrderById(UUID uuid) {
        return Optional.ofNullable(modelMapper.map(orderRepository.findById(uuid), Order.class));
    }

    @Override
    public void deleteByUuid(UUID uuid) {
        orderRepository.deleteById(uuid);
    }

    public List<BookDTO> getAllBooks() {
        return (List<BookDTO>) restTemplate.getForObject("http://localhost:8082/bclient/books/getAllBooks", BookDTO.class);
    }

    public List<UserDTO> getAllUser() {
        return (List<UserDTO>) restTemplate.getForObject("http://localhost:8082/uclient/users/getAllUsers", UserDTO.class);
    }

}
