package com.fsl.eshop.repository;

import com.fsl.eshop.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, String> {
}
