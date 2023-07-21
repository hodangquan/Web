package com.spring.entity;

import java.io.Serializable;
import java.math.BigDecimal;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name= "Product")
public class Product implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="Id" )
	private Integer id;
	@Column(name="Anh")
	private String anh;
	@Column(name = "Ten")
	private String ten;
	@Column(name = "Gia")
	private BigDecimal gia;
	@Column(name = "SoLuong")
	private Integer soLuong;
	@Column(name = "KichCo")
	private String kichCo;
	@Column(name = "MoTa")
	private String moTa;
	@Column(name = "TrangThai")
	private Integer trangThai;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	
	public Integer getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(Integer trangThai) {
		this.trangThai = trangThai;
	}
	public Product(Integer id, String ten, BigDecimal gia, Integer soLuong, String kichCo, String moTa) {
		super();
		this.id = id;
		this.ten = ten;
		this.gia = gia;
		this.soLuong = soLuong;
		this.kichCo = kichCo;
		this.moTa = moTa;
	}
	public Product() {
		super();
	}
	
	

}
