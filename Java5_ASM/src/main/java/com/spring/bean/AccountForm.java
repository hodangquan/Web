package com.spring.bean;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;

public class AccountForm {
	@NotBlank
	@Length(min = 5, max =12)
	private String ten;
//	@NotBlank(message = "khong dc bo bo trong")
//	@Length(min=6, max=20 , message = "do dai tu 6 den 20 ki tu")
	@NotBlank
	@Length(min = 5, max =12)
    private String matKhau;
//	@NotBlank(message = "khong dc bo bo trong")
//	@Length(min=6, max=18, message = "do dai tu 6 den 18 ki tu")

    private String mail;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		
		this.ten = ten;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
    


}
