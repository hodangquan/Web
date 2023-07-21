package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Account;
import com.spring.repository.AccountRepository;
import com.spring.service.AccountService;

@Service
public class IAccountService implements AccountService {
	@Autowired
    AccountRepository repo;


    @Override
    public Account add(Account account) {
        return repo.save(account);
    }


	@Override
	public Account getByUsername(String ten) {
		// TODO Auto-generated method stub
		return repo.getByUsername(ten);
	}



}
