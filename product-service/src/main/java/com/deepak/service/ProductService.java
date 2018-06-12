package com.deepak.service;

import java.util.Collection;

import com.deepak.domain.Product;

public interface ProductService {
	
	public Collection<Product> getAllProducts();
	public Product getProduct(Long id);
	public void addProduct(Product product);
	public Product deleteProduct(Product product);

}
