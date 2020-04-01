package com.xyz.product.catalogue.service;

import java.util.List;
import java.util.Map;

import com.xyz.product.catalogue.model.Order;
import com.xyz.product.catalogue.model.OrderDetails;
import com.xyz.product.catalogue.model.Product;

public interface ProductCatalogueService {

	List<Product> getAllProduct();

	Product addProduct(Product product);

	int deleteProduct(long id);
 
	Product updateProduct(Product product);
	
	List<Order> getAllOrders();
	
	List<OrderDetails> getAllOrderDetails();
	
	OrderDetails addOrderDetails(OrderDetails orderDetails);
}