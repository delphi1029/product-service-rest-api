package com.deepak.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.deepak.domain.Product;

public class ProductServiceImpl implements ProductService {

	private  static Map<Long,Product> productList = new HashMap<>();
	

	public ProductServiceImpl() {
		super();
		productList.put(new Long(23),new Product("P1",new Long(23),5.4));
		productList.put(new Long(43),new Product("P2",new Long(43),3.4));
		productList.put(new Long(63),new Product("P3",new Long(63),7.4));
	}

	@Override
	public Collection<Product> getAllProducts() {
		return productList.values();
	}

	@Override
	public Product getProduct(Long id) {
		return productList.get(id);
	}

	@Override
	public void addProduct(Product product) {
		productList.put(product.getId(),product);
		
	}

	@Override
	public Product deleteProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}
