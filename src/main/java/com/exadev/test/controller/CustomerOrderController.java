package com.exadev.test.controller;

import com.exadev.test.model.CustomerOrder;
import com.exadev.test.model.Destination;
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
    public Optional<CustomerOrder> getAllOrder(@PathVariable Long id){
        return customerOrderService.getOrderById(id);

    }
    @GetMapping("/{code}")
    public CustomerOrder getOrderByCode (@PathVariable Long code){
        return customerOrderService.getOrderByCode(code);
    }
    @GetMapping("/{price}")
    public List<CustomerOrder> getOrderByCode (@PathVariable int price){
        return customerOrderService.getOrderByPrice(price);
    }
    @GetMapping("")
    public List<CustomerOrder> getAllCustomerOrder (){
        return customerOrderService.getAllCustomerOrder();
    }
    @PostMapping("")
    public CustomerOrder createOrder (@RequestBody CustomerOrder order){
        return customerOrderService.createOrder(order);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id ){
        customerOrderService.deleteById(id);
    }
    @PutMapping(")")
    public CustomerOrder update(CustomerOrder customerOrder){
        return customerOrderService.update(customerOrder);
    }
}
