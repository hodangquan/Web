package com.spring.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "HoaDon")

public class HoaDon implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idHoaDon")
	private Integer idHoaDon ;
	@ManyToOne()
	@JoinColumn(name = "Ten" , nullable = false)
	private Account username ;
	@Column(name = "ngayTao")
	private String ngayTao;
	@Column(name = "ngayThanhToan")
	private String ngayThanhToan ;
	@Column(name = "trangThai")
	private Integer trangThai ;
	@Column(name = "nguoiNhan")
	private String nguoiNhan ;
	@Column(name = "soDienThoai")
	private String soDienThoai ;
	@Column(name = "diaChi")
	private String diaChi ;
	@OneToMany(mappedBy = "hoaDon" ,fetch = FetchType.LAZY)
	private List<HoaDonChiTiet> hdcts;
	public Integer getIdHoaDon() {
		return idHoaDon;
	}
	public void setIdHoaDon(Integer idHoaDon) {
		this.idHoaDon = idHoaDon;
	}
	public Account getUsername() {
		return username;
	}
	public void setUsername(Account username) {
		this.username = username;
	}
	public String getNgayTao() {
		return ngayTao;
	}
	public void setNgayTao(String ngayTao) {
		this.ngayTao = ngayTao;
	}
	public String getNgayThanhToan() {
		return ngayThanhToan;
	}
	public void setNgayThanhToan(String ngayThanhToan) {
		this.ngayThanhToan = ngayThanhToan;
	}
	public Integer getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(Integer trangThai) {
		this.trangThai = trangThai;
	}
	public String getNguoiNhan() {
		return nguoiNhan;
	}
	public void setNguoiNhan(String nguoiNhan) {
		this.nguoiNhan = nguoiNhan;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public List<HoaDonChiTiet> getHdcts() {
		return hdcts;
	}
	public void setHdcts(List<HoaDonChiTiet> hdcts) {
		this.hdcts = hdcts;
	}

}
