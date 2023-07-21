package com.spring.service;

import org.springframework.data.repository.query.Param;

import com.spring.entity.Account;

public interface AccountService {
	public Account add(Account account);
	public Account getByUsername(String ten);
}
