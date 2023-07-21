package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.HoaDonChiTiet;
import com.spring.repository.HoaDonChiTietRepository;
import com.spring.service.HoaDonChiTietService;

@Service
public class IHoaDonChiTietService implements HoaDonChiTietService{
	@Autowired 
	private HoaDonChiTietRepository repo;

	@Override
	public List<HoaDonChiTiet> getbyId(Integer id) {
		// TODO Auto-generated method stub
		return repo.getAllById(id);
	}

	@Override
	public HoaDonChiTiet add(HoaDonChiTiet hoaDon) {
		// TODO Auto-generated method stub
		return repo.save(hoaDon);
	}

	
}
