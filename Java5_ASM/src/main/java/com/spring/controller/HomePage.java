package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.bean.AccountForm;
import com.spring.entity.Account;
import com.spring.entity.Product;
import com.spring.repository.AccountRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
@Controller
public class HomePage {
	
	@Autowired
	HttpServletRequest request;
	
	@Autowired
	private AccountRepository accountRepository;

	
	 @GetMapping("/login")
	    public String showLogin(Model model) {
	        model.addAttribute("user", new AccountForm());
	        return "login";
	    }
	 @PostMapping("/login")
	 public String checkLogin(
			 Model model,
			 RedirectAttributes redirect,
			   @Validated @ModelAttribute("user") AccountForm user,
				BindingResult result
			
				
		) {
			//validate
			if(!result.hasErrors()) {

				Account userFromDB = accountRepository.findByTenAndMatKhau(user.getTen(), user.getMatKhau());
				if(userFromDB != null) {
					request.getSession().setAttribute("account", userFromDB);
					
//					request.setAttribute("mess","mess");
					return "redirect:/index";
				}
				model.addAttribute("message", "Username or password incorrect");
			}
			
			
			//login failed
			
			
			return "login";
		}
	 @GetMapping("/logout")
	    public String logout(Model model,RedirectAttributes redirect) {
	        request.getSession().removeAttribute("account");
	        return "redirect:/index";
	    }
	 
	 

	 
}
