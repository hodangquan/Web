package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Cart;
import com.spring.repository.CartRepository;
import com.spring.service.CartService;

@Service
public class ICartService implements CartService{

	@Autowired
	private CartRepository repo;

	@Override
	public Cart add(Cart cart) {
		// TODO Auto-generated method stub
		return repo.save(cart);
	}

	@Override
	public Cart update(Cart cart) {
		// TODO Auto-generated method stub
		Cart c = repo.getByID(cart.getUsername().getTen(), cart.getProduct().getId());
		c.setSoLuong(cart.getSoLuong());
		c.setDonGia(cart.getDonGia());
		return repo.save(c);
	}

	@Override
	public void delete(Cart cart) {
		// TODO Auto-generated method stub
		Cart c = repo.getByID(cart.getUsername().getTen(), cart.getProduct().getId());
		 repo.delete(c);;
	}

	@Override
	public List<Cart> getCartbyUser(String username) {
		// TODO Auto-generated method stub
		return repo.giohang(username);
	}

	@Override
	public Cart getById(String username, Integer id) {
		// TODO Auto-generated method stub
		return repo.getByID(username, id);
	}

	@Override
	public void deleteCartByUsername(String username) {
		// TODO Auto-generated method stub
		repo.deleteCartbyUsername(username);
		
	}
}
