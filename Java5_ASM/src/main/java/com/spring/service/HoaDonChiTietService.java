package com.spring.service;

import java.util.List;

import com.spring.entity.HoaDonChiTiet;

public interface HoaDonChiTietService {
	public List<HoaDonChiTiet> getbyId(Integer id);
	public HoaDonChiTiet add(HoaDonChiTiet hoaDon);
}