package com.exadev.test.repo;

import com.exadev.test.model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<CustomerOrder,Long> {
    CustomerOrder getOrderByCode (Long code);
    List<CustomerOrder> getOrderByPrice(int Price);
}
