package com.xyz.product.catalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xyz.product.catalogue.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
