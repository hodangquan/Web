package com.spring.bean;

import java.math.BigDecimal;

public class ProductForm {
	
			private Integer id;
			private String anh;
			private String ten;
			
			
		
			private BigDecimal gia;
			
			private Integer soLuong;
			
			private String kichCo;
			
			private String moTa;

			public Integer getId() {
				return id;
			}

			public void setId(Integer id) {
				this.id = id;
			}
			public String getAnh() {
				return anh;
			}

			public void setAnh(String anh) {
				this.anh = anh;
			}

			public String getTen() {
				return ten;
			}

			public void setTen(String ten) {
				this.ten = ten;
			}

			public BigDecimal getGia() {
				return gia;
			}

			public void setGia(BigDecimal gia) {
				this.gia = gia;
			}

			public Integer getSoLuong() {
				return soLuong;
			}

			public void setSoLuong(Integer soLuong) {
				this.soLuong = soLuong;
			}

			public String getKichCo() {
				return kichCo;
			}

			public void setKichCo(String kichCo) {
				this.kichCo = kichCo;
			}

			public String getMoTa() {
				return moTa;
			}

			public void setMoTa(String moTa) {
				this.moTa = moTa;
			}
			
		
}
