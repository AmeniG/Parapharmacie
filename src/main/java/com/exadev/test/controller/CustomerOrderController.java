package com.exadev.test.controller;

import com.exadev.test.dto.CustomerOrderRequest;
import com.exadev.test.model.CustomerOrder;
import com.exadev.test.model.OrderedAmountPreProduct;
import com.exadev.test.model.Product;
import com.exadev.test.service.CustomerOrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/customerOrder")
@AllArgsConstructor
public class CustomerOrderController {
    private final CustomerOrderService customerOrderService;

    @GetMapping("/{id}")
    public Optional<CustomerOrder> getAllOrder(@PathVariable Long id) {
        return customerOrderService.getOrderById(id);

    }

    @GetMapping("/{code}")
    public CustomerOrder getOrderByCode(@PathVariable Long code) {
        return customerOrderService.getOrderByCode(code);
    }

    @GetMapping("/{price}")
    public List<CustomerOrder> getOrderByCode(@PathVariable int price) {
        return customerOrderService.getOrderByPrice(price);
    }

    @GetMapping("")
    public List<CustomerOrder> getAllCustomerOrder() {
        return customerOrderService.getAllCustomerOrder();
    }
    @GetMapping("/user")
    public List<CustomerOrder> getOrdersByUserById(@PathVariable Long id ){return customerOrderService.getOrdersByUserById(id);}



    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        customerOrderService.deleteById(id);
    }

    @PutMapping("")
    public CustomerOrder update(@RequestBody CustomerOrder customerOrder) {
        return customerOrderService.update(customerOrder);
    }

    @PostMapping("/customerOrder")
    public CustomerOrder create(@RequestBody CustomerOrderRequest customerOrder) {
        return customerOrderService.create(customerOrder);
    }
    @PostMapping("/customerOrder1")
    public int purchase(@RequestBody CustomerOrder customerOrder) {
        return customerOrderService.purchase(customerOrder);
        }
}
