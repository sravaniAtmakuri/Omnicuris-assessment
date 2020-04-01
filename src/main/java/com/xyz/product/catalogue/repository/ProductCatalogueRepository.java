package com.xyz.product.catalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.xyz.product.catalogue.model.Product;

import java.util.List;

import javax.transaction.Transactional;

public interface ProductCatalogueRepository extends JpaRepository<Product, Long> {

	@Modifying
	@Transactional
	@Query("delete from Product products where products.id = :id ")
	int deleteById(@Param("id") Long id);

}
