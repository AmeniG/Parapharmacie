package com.exadev.test.repo;

import com.exadev.test.model.OrderedAmountPreProduct;
import com.exadev.test.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface AmountRepo extends JpaRepository<OrderedAmountPreProduct, Long> {
    OrderedAmountPreProduct getAmountByProductId (Long id);

}