package com.xyz.product.catalogue.controller;

import com.xyz.product.catalogue.model.Order;
import com.xyz.product.catalogue.model.OrderDetails;
import com.xyz.product.catalogue.model.Product;
import com.xyz.product.catalogue.service.ProductCatalogueService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/")
public class CatalogueController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CatalogueController.class);
	
	@Autowired
	ProductCatalogueService productCatalogueService;
	
	@GetMapping(value="/product/all")
	public List<Product> getAllProduct(){
		return productCatalogueService.getAllProduct();
	}
	
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product){
		return productCatalogueService.addProduct(product);
	}
	
	@DeleteMapping("/product/{id}")
	public int deleteProduct(@PathVariable("id") long id){
		return productCatalogueService.deleteProduct(id);
	}
	
	
	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product product) {
		
		return productCatalogueService.updateProduct(product);
		
	}
	
	
	@GetMapping("/order")
	public List<Order> getAllOrders(){
		return productCatalogueService.getAllOrders();
	}
	
	@GetMapping("/orderDetails")
	public List<OrderDetails> getAllOrderDetails(){
		return productCatalogueService.getAllOrderDetails();
	}
	
	@PostMapping("/orderDetails")
	public OrderDetails saveOrderDetails(@RequestBody OrderDetails orderDetails){
		return productCatalogueService.addOrderDetails(orderDetails);
	}
	

}
