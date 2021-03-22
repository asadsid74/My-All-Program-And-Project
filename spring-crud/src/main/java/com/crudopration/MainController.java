package com.crudopration;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.crudopration.dao.ProductDao;
import com.crudopration.model.Product;

@Controller
public class MainController {
	@Autowired
	private ProductDao dao;
	//get all data
	@RequestMapping("/")
    public String home(Model m) {
		List<Product> products = dao.getAllProduct();
		m.addAttribute("products",products);
	return "index";
	
}
	
//show add product form
  @RequestMapping("/product_form") 
  public String addProduct(Model m) {
  m.addAttribute("title","add product"); 
  //dao.createProduct(product);
  return "producform";
  
  }
 
//handler add product	
	  @RequestMapping("/productform1") 
	  public  RedirectView handleForm(@ModelAttribute Product product,HttpServletRequest request) {
		  System.out.println(product); 
		  dao.createProduct(product);
	  RedirectView r= new RedirectView(); 
	 r.setUrl(request.getContextPath()+"/");
	  return r;
	  
	  }
	 	//delete handler
	  @RequestMapping("/delete/{productId}")
	  public RedirectView deleteProduct(@PathVariable("productId")int productId ,HttpServletRequest request) {
		  this.dao.deleteProduct(productId);
		  RedirectView r= new RedirectView(); 
		  r.setUrl(request.getContextPath()+"/");
		  return r;
		  
	  }
	  
	  @RequestMapping("/update/{productId}")
	  public String updateForm(@PathVariable ("productId") int pid,Model m) {
		  Product product = this.dao.getSingle(pid);
		  m.addAttribute("product",product);
		return "updateform";
		  
	  }
	
}
