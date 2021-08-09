package com.exadev.test.service;

import com.exadev.test.dto.CustomerOrderRequest;
import com.exadev.test.dto.OrderedAmountPreProductRequest;
import com.exadev.test.model.OrderedAmountPreProduct;
import com.exadev.test.model.CustomerOrder;
import com.exadev.test.repo.CustomerOrderRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerOrderService {
    private final CustomerOrderRepo customerOrderRepo;
    private final AmountService amountService;


    public CustomerOrder getOrderByCode(Long code) {
        return customerOrderRepo.getOrderByCode(code);
    }
    public List<CustomerOrder> getOrdersByUserById(Long id ){return customerOrderRepo.getCustomerOrdersByUserId(id);}

    public List<CustomerOrder> getOrderByPrice(int price) {
        return customerOrderRepo.getOrderByPrice(price);
    }

    public Optional<CustomerOrder> getOrderById(Long id) {
        return customerOrderRepo.findById(id);
    }

    public List<CustomerOrder> getAllCustomerOrder() {
        return customerOrderRepo.findAll();
    }

    public void deleteById(Long id) {
        customerOrderRepo.deleteById(id);
    }

    public CustomerOrder update(CustomerOrder customerOrder) {
        return customerOrderRepo.save(customerOrder);
    }


    public CustomerOrder create(CustomerOrderRequest customerOrderRequest) {
        CustomerOrder customerOrder = new CustomerOrder(null, null, 0, customerOrderRequest.getUser(), null, customerOrderRequest.getDestination());
        customerOrder = customerOrderRepo.save(customerOrder);
        for (OrderedAmountPreProductRequest orderedAmountPreProductRequest : customerOrderRequest.getOrderedAmountPreProductRequestList()) { // type d'objet son nom dans quelle liste
            OrderedAmountPreProduct orderedAmountPreProduct =
                    new OrderedAmountPreProduct(null, orderedAmountPreProductRequest.getQte(), orderedAmountPreProductRequest.getProduct(), customerOrder);
             amountService.createAmount(orderedAmountPreProduct);

            orderedAmountPreProduct.getProduct().setStock(orderedAmountPreProduct.getQte());

        }
        return customerOrder;

    }


        public int purchase (CustomerOrder customerOrder){ // fonction qui calcule le prix de la commande
            int price = 0;
            for (OrderedAmountPreProduct orderedAmountPreProduct : customerOrder.getOrderedAmountPreProducts()) {
                price += orderedAmountPreProduct.getProduct().getPrice() * orderedAmountPreProduct.getQte();
            }
            return price;


        }


    }



