package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Product;
import com.spring.repository.ProductRepository;
import com.spring.service.ProductService;

@Service
public class IProductService implements ProductService {
	@Autowired
    ProductRepository repo;

	

	@Override
	public Product add(Product product) {
		return repo.save(product);
	
	}



	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}



	@Override
	public Product getById(Integer id) {
		// TODO Auto-generated method stub
		return repo.getById(id);
	}

}
