package ru.vladuss.orderservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vladuss.orderservice.models.Order;
import ru.vladuss.orderservice.services.dtos.BookDTO;
import ru.vladuss.orderservice.services.dtos.GetAllOrdersDTO;
import ru.vladuss.orderservice.services.dtos.UserDTO;
import ru.vladuss.orderservice.services.impl.OrderService;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/getAllOrders")
    ResponseEntity<List<GetAllOrdersDTO>> getAll() {
        List<GetAllOrdersDTO> getAllOrdersDTOS = orderService.getAll();
        return ResponseEntity.ok(getAllOrdersDTOS);
    }

    @PostMapping("/createOrder")
    ResponseEntity<Order> createOrder(@RequestBody Order order) {
        Order order1 = orderService.create(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(order1);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<BookDTO>> getAllBooks() {
        BookDTO bookDTO = (BookDTO) orderService.getAllBooks();
        return ResponseEntity.ok((List<BookDTO>) bookDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        UserDTO userDTO = (UserDTO) orderService.getAllBooks();
        return ResponseEntity.ok((List<UserDTO>) userDTO);
    }

}
