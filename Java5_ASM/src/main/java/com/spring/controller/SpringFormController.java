package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.bean.AccountForm;
import com.spring.entity.Account;
import com.spring.service.AccountService;

@Controller
@RequestMapping("/user")
public class SpringFormController {
	
	@Autowired
    AccountService accountService;
    @GetMapping("/addUser")
    public String showAddUserForm(Model model) {
        model.addAttribute("user", new AccountForm());
        return "add";
    }
   
    
    @PostMapping("/saveUser")
    public String saveUser(RedirectAttributes redirect,@Validated @ModelAttribute("user") AccountForm account , BindingResult result) {

        // in ra được thông tin user thì đúng  :)))
        // spring form phải đảm bảo path phải là thuôộc tính của đối tượng
        // ModelAttribute của jsp và controller phải là 1
    
       if (!result.hasErrors()){
           Account acc = new Account();
           acc.setMail(account.getMail());
           acc.setTen(account.getTen());
           acc.setMatKhau(account.getMatKhau());
           if (accountService.add(acc) != null){
               System.out.println("Them thanh cong");
           }
           else{
               System.out.println("Them that bai");
           }
           return "redirect:/user/addUser";
       }
       return "add";
     
    }
    
   
    
}
