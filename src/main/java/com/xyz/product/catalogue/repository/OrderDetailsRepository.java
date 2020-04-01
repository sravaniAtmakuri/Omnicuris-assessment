package com.xyz.product.catalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xyz.product.catalogue.model.Order;
import com.xyz.product.catalogue.model.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {

}
