package com.spring.service;

import java.util.List;

import com.spring.entity.Account;
import com.spring.entity.Product;

public interface ProductService {
	public Product add(Product product);
	public List<Product> getAll();
	public Product getById(Integer id);
}
