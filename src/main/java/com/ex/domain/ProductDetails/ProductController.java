package com.ex.domain.ProductDetails;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProductController {
	
	public ProductController()
	{
		System.out.println("Create Controller");
	}
	@RequestMapping(value="/productForm")
	public String getProductForm(Model model)
	{
		model.addAttribute("product", new Product());
		return "productForm";
	}
	@RequestMapping("/processProductData")
	public ModelAndView displayProductDetails(@ModelAttribute("product") Product product)
	{
		System.out.println(product.getManufactur());
		System.out.println(product.getProductName());
//		ModelAndView("dispalyProduct","productObj",product);
		 return new ModelAndView("processProductData","productObj", product); 
	}
    
}
