package com.spring.controller;


import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.bean.ThanhToanForm;
import com.spring.entity.Account;
import com.spring.entity.Cart;
import com.spring.entity.HoaDon;
import com.spring.entity.HoaDonChiTiet;
import com.spring.service.CartService;
import com.spring.service.HoaDonChiTietService;
import com.spring.service.HoaDonService;
@Controller
@RequestMapping("/cart")
public class CartController {
	@Autowired
	CartService service;
	@Autowired
	HttpSession session;
	@Autowired
	HttpServletRequest request;
	@Autowired
	HoaDonService hdService;
	@Autowired
	HoaDonChiTietService hdctService;

	
	
	@GetMapping(value = {"","/","/index"})
	public String indexPage(Model model) {
		Account account = (Account) session.getAttribute("account");
		List<Cart> list = service.getCartbyUser(account.getTen());
		Double tongTien = 0.0;
		for (Cart cart : list) {
			String tien = String.valueOf(cart.getDonGia());
			 tongTien += (cart.getSoLuong() * Double.valueOf(tien));
		}
		model.addAttribute("tongTien", tongTien);
		model.addAttribute("listCart", list);
		model.addAttribute("data", new ThanhToanForm());
		return "cart";
	}
	@GetMapping("/thanhtoan")
	public String thanhtoanPage(Model model) {
		Account account = (Account) session.getAttribute("account");
		List<Cart> list = service.getCartbyUser(account.getTen());
		Double tongTien = 0.0;
		for (Cart cart : list) {
			String tien = String.valueOf(cart.getDonGia());
			 tongTien += (cart.getSoLuong() * Double.valueOf(tien));
		}
		model.addAttribute("tongTien", tongTien);
model.addAttribute("listCart", list);
		model.addAttribute("data", new ThanhToanForm());
		return "cart";
	}
//	@GetMapping("/giam")
//	public String giam(Model model , @RequestParam(name = "id") Integer id , @RequestParam(name = "kichThuoc") String kichThuoc , RedirectAttributes redirect) {
//		
//		Account account = (Account) session.getAttribute("account");
//		KichThuoc kt = kichThuocService.getKichThuocbyName(kichThuoc);
//		Product_KichThuoc p = productKichThuocService.getByIdProduct(id, kt.getIdKichThuoc());
//		Cart cart = service.getById(account.getUsername(), id, kichThuoc);
//		if (cart.getSoLuong()  == 1) {
//			service.delete(cart);
//			return "redirect:/cart";
//		}
//		cart.setSoLuong(cart.getSoLuong() - 1);
//		p.setSoLuong(p.getSoLuong() +1);
//		productKichThuocService.update(p);
//		
//		service.update(cart);
//		return "redirect:/cart";
//	}
//	@GetMapping("/them")
//	public String them(Model model , @RequestParam(name = "id") Integer id , @RequestParam(name = "kichThuoc") String kichThuoc,RedirectAttributes redirect) {
//		Locale locale = RequestContextUtils.getLocale(request);
//		Account account = (Account) session.getAttribute("account");
//		KichThuoc kt = kichThuocService.getKichThuocbyName(kichThuoc);
//		Product_KichThuoc p = productKichThuocService.getByIdProduct(id, kt.getIdKichThuoc());
//		Cart cart = service.getById(account.getUsername(), id, kichThuoc);
//		if (p.getSoLuong() == 0 ) {
//			redirect.addFlashAttribute("message", messageSource.getMessage("message.cart.them", null, locale));
//			redirect.addFlashAttribute("type", "error");
//			
//			return "redirect:/cart";
//		}
//		p.setSoLuong(p.getSoLuong() - 1);
//		productKichThuocService.update(p);
//		
//		cart.setSoLuong(cart.getSoLuong() + 1);
//		service.update(cart);
//		return "redirect:/cart";
//	}
	@GetMapping("/delete/{id}")
	public String delete(Model model , @PathVariable("id") Integer id ,RedirectAttributes redirect) {
		
		Account account = (Account) session.getAttribute("account");
		Cart cart = service.getById(account.getTen(), id);
		service.delete(cart);
		redirect.addFlashAttribute("message","Xoa thanh cong khoi gio hang");
		redirect.addFlashAttribute("type", "success");
		
		return "redirect:/cart";
	}

	@PostMapping("/thanhtoan")
	public String thanhToan(Model model , RedirectAttributes redirect , @Valid @ModelAttribute(name = "data") ThanhToanForm form , BindingResult result) {
		Account account = (Account) request.getSession().getAttribute("account");
		List<Cart> list = service.getCartbyUser(account.getTen());
		Double tongTien = 0.0;
for (Cart cart : list) {
			String tien = String.valueOf(cart.getDonGia());
			 tongTien += (cart.getSoLuong() * Double.valueOf(tien));
		}
		model.addAttribute("tongTien", tongTien);
		model.addAttribute("listCart", list);
		if (result.hasErrors()) {
			return "cart";
		}
		
		List<Cart> cart = service.getCartbyUser(account.getTen());
		if (cart.isEmpty()) {
			redirect.addFlashAttribute("message", "Gio hang rong");
			redirect.addFlashAttribute("type", "error");

			return "redirect:/cart";
		}
		if (!result.hasErrors()) {
			HoaDon hd = new HoaDon();
			hd.setUsername(account);
			hd.setNguoiNhan(form.getTen());
			hd.setDiaChi(form.getDiachi());
			hd.setSoDienThoai(form.getSdt());
			DateTimeFormatter f = DateTimeFormatter.ofPattern("MM-dd-yyyy");
			ZonedDateTime now = ZonedDateTime.now();
			String ngayTao =  f.format(now);
			hd.setTrangThai(0);
			hd.setNgayTao(ngayTao);
			hdService.add(hd);
			for (Cart c : cart) {
				HoaDonChiTiet hdct = new HoaDonChiTiet();
				hdct.setHoaDon(hd);
				hdct.setProduct(c.getProduct());
				hdct.setDonGia(c.getDonGia());
				hdct.setSoLuong(c.getSoLuong());
				hdct.setKichThuoc(c.getKichThuoc());
				hdctService.add(hdct);
				service.delete(c);
				
			}
			redirect.addFlashAttribute("message", "Dat hang thanh cong");
			redirect.addFlashAttribute("type", "success");

			return "redirect:/cart";
		}
		return "cart";
	}
}