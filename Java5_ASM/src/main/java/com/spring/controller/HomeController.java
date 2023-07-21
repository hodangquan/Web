package com.spring.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.bean.CartForm;
import com.spring.entity.Account;
import com.spring.entity.Cart;
import com.spring.entity.Product;
import com.spring.service.AccountService;
import com.spring.service.CartService;
import com.spring.service.ProductService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@Autowired
    ProductService productService;
	@Autowired
	HttpServletRequest req;
	@Autowired
	CartService cartService;
	@Autowired
	AccountService accountService;
	@RequestMapping(value = {"", "/", "/index", "/home"}, method = RequestMethod.GET)
	public String homePage(Model model) {
		List<Product> list = productService.getAll();
		model.addAttribute("list", list);
		return "index";
	}
	@RequestMapping("/shop")
	public String shopPage(Model model) {
		List<Product> list = productService.getAll();
		model.addAttribute("list", list);
		return "shop";
	}
	@RequestMapping("/about")
	public String aboutPage(Model model) {
		List<Product> list = productService.getAll();
		model.addAttribute("list", list);
		return "about";
	}
	@GetMapping("/detail/{id}")
	public String detailPage(@PathVariable Integer id, Model model) {
    	Product p = productService.getById(id);
		model.addAttribute("product", p);
		model.addAttribute("data", new CartForm());
		return "detail";
	}
	@PostMapping("/detail/{id}")
	public  String detail(Model model , RedirectAttributes redirect , @ModelAttribute(name = "data") CartForm form , BindingResult result) {	
		Product product = productService.getById(form.getIdProduct());
		Account user =  accountService.getByUsername(form.getUsername());
		if (user == null) {
			req.setAttribute("message", "Vui lòng đăng nhập trước khi vào giỏ hàng!");
			req.setAttribute("type", "error");
			
			return"detail";
		}
		

		if (!result.hasErrors()) {
//			Account account2 = accountRepository.getByUsername(form.getUsername());
			Product p = productService.getById(form.getIdProduct());
			BigDecimal donGia = p.getGia();
			Cart cart = cartService.getById(user.getTen(), form.getIdProduct());
			if (cart == null) {
				Cart cart2 = new Cart();
				cart2.setUsername(user);
				cart2.setProduct(p);
				cart2.setDonGia(donGia);
				cart2.setSoLuong(1);
			if (cartService.add(cart2) != null) {
				redirect.addFlashAttribute("message", "Thêm thành công !");
				redirect.addFlashAttribute("type", "success");
				return"redirect:/cart";
			}
		}
			else {
				cart.setSoLuong(cart.getSoLuong() + 1);
				if (cartService.update(cart) != null) {
					redirect.addFlashAttribute("message", "Thêm thành công !");
					redirect.addFlashAttribute("type", "success");
					return"redirect:/cart";
				}
			}
		}
	
		return"detail";
		
		
	}
}
