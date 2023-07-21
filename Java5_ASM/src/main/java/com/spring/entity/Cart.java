package com.spring.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.catalina.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCart")
	private Integer idCart ;
	@ManyToOne
	@JoinColumn(name = "Ten" , nullable = false)
	private Account username ;
	@ManyToOne
	@JoinColumn(name = "idProduct" , nullable =  false)
	private Product product ;
	@Column(name = "soLuong")
	private Integer soLuong ;
	@Column(name = "donGia")
	private BigDecimal donGia ;
	@Column(name = "kichThuoc" , length = 50)
	private String kichThuoc ;
	public Integer getIdCart() {
		return idCart;
	}
	public void setIdCart(Integer idCart) {
		this.idCart = idCart;
	}
	public Account getUsername() {
		return username;
	}
	public void setUsername(Account username) {
		this.username = username;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}
	public BigDecimal getDonGia() {
		return donGia;
	}
	public void setDonGia(BigDecimal donGia) {
		this.donGia = donGia;
	}
	public String getKichThuoc() {
		return kichThuoc;
	}
	public void setKichThuoc(String kichThuoc) {
		this.kichThuoc = kichThuoc;
	}
	

}
