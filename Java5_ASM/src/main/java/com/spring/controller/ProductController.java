package com.spring.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.bean.AccountForm;
import com.spring.bean.ProductForm;
import com.spring.entity.Account;
import com.spring.entity.Product;
import com.spring.service.AccountService;
import com.spring.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
    ProductService productService;
	@Value("${upload.path}")
	private String pathFolder;
	@GetMapping(value = {"","/","/index"})
	public String index(Model model) {
		List<Product> list = productService.getAll();
		model.addAttribute("list", list);
		return "product/index";
	}
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("product", new ProductForm());
        return "product/add";
    }
    @GetMapping("/update/{id}")
    public String showUpdateForm(Model model, @PathVariable("id") Integer id) {
        model.addAttribute("product", new ProductForm());
        Product p = productService.getById(id);
        model.addAttribute("p", p);
        return "product/update";
    }
    @PostMapping("/add")
    public String saveProduct(RedirectAttributes redirect,@Validated @ModelAttribute("product") ProductForm product , @RequestParam("file") MultipartFile file, BindingResult result) {

    
       if (!result.hasErrors()){
    	   try {
    	   byte[] bytes;
			
				bytes = file.getBytes();
			
			Path path = Paths.get(pathFolder + file.getOriginalFilename());
			Files.write(path, bytes);
           Product pro = new Product();
           pro.setTen(product.getTen());
           pro.setAnh(file.getOriginalFilename());
           pro.setGia(product.getGia());
           pro.setSoLuong(product.getSoLuong());
           pro.setKichCo(product.getKichCo());    
           pro.setMoTa(product.getMoTa());
           pro.setTrangThai(0);
           
           if (productService.add(pro) != null){
               System.out.println("Them thanh cong");
           }
           else{
               System.out.println("Them that bai");
           }
           return "redirect:/product";
    	   } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
       }
       return "product/add";
     
    }
    @PostMapping("/update")
    public String updateProduct(RedirectAttributes redirect,@Validated @ModelAttribute("product") ProductForm product , @RequestParam("file") MultipartFile file, BindingResult result) {

    
       if (!result.hasErrors()){
    	   try {
    	   byte[] bytes;
			
				bytes = file.getBytes();
			
			Path path = Paths.get(pathFolder + file.getOriginalFilename());
			Files.write(path, bytes);
           Product pro = productService.getById(product.getId());
           pro.setTen(product.getTen());
           pro.setAnh(file.getOriginalFilename());
           pro.setGia(product.getGia());
           pro.setSoLuong(product.getSoLuong());
           pro.setKichCo(product.getKichCo());    
           pro.setMoTa(product.getMoTa());
           pro.setTrangThai(0);
           
           if (productService.add(pro) != null){
               System.out.println("Sua thanh cong");
           }
           else{
               System.out.println("Sua that bai");
           }
           return "redirect:/product";
    	   } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
       }
       return "product/update";
    }
    @GetMapping("/delete/{id}")
    public String delete(Model model, @PathVariable("id") Integer id) {
        
        Product p = productService.getById(id);
        p.setTrangThai(1);
        productService.add(p);
        
        return "redirect:/product";
    }
    
}
