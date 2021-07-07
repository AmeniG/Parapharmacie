package com.exadev.test.service;

import com.exadev.test.model.CustomerOrder;
import com.exadev.test.model.Destination;
import com.exadev.test.repo.OrderRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerOrderService {
    private final OrderRepo orderRepo;
    public CustomerOrder createOrder (CustomerOrder order){
        return orderRepo.save(order);
    }
    public CustomerOrder getOrderByCode (Long code){
        return orderRepo.getOrderByCode(code);
    }
    public List<CustomerOrder> getOrderByPrice (int price){
        return  orderRepo.getOrderByPrice(price);
    }
    public Optional<CustomerOrder> getOrderById (Long id){
        return orderRepo.findById(id);
    }
    public List<CustomerOrder> getAllCustomerOrder (){
        return orderRepo.findAll();
    }
    public void deleteById(Long id){
        orderRepo.deleteById(id);
    }
    public CustomerOrder update(CustomerOrder customerOrder){
        return orderRepo.save(customerOrder);
    }
    
}
