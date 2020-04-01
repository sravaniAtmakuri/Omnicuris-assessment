package com.xyz.product.catalogue.service;

import com.xyz.product.catalogue.model.Order;
import com.xyz.product.catalogue.model.OrderDetails;
import com.xyz.product.catalogue.model.Product;
import com.xyz.product.catalogue.repository.ProductCatalogueRepository;
import com.xyz.product.catalogue.repository.OrderDetailsRepository;
import com.xyz.product.catalogue.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

@Service
public class ProductCatalogueServiceImpl implements ProductCatalogueService {

	@Autowired
	ProductCatalogueRepository productCatalogueRepository;
	
	@Autowired
    OrderRepository orderRepository;
	
	@Autowired
    OrderDetailsRepository orderDetailsRepository;

	@Override
	public List<Product> getAllProduct() {
		return productCatalogueRepository.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		if (product != null)
			return productCatalogueRepository.save(product);
		return new Product();
	}

	@Override
	public int deleteProduct(long id) {
		int result = productCatalogueRepository.deleteById(id);
		return result;
	}

	@Override
	public Product updateProduct(Product product) {
		
		Product productDb = productCatalogueRepository.findOne(product.getId());
		if (productDb != null) {
			Product newpro = new Product();
			newpro.setId(product.getId());
			newpro.setName(product.getName());
			newpro.setUnitPrice(product.getUnitPrice());
		    productCatalogueRepository.save(newpro);
			return newpro;
		}
		return null;
	}

	@Override
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	@Override
	public List<OrderDetails> getAllOrderDetails() {
		return orderDetailsRepository.findAll();
	}

	@Override
	public OrderDetails addOrderDetails(OrderDetails orderDetails) {
		 return orderDetailsRepository.save(orderDetails);
	}

}
