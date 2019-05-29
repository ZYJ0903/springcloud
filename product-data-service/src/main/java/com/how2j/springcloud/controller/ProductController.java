package com.how2j.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.how2j.springcloud.pojo.Product;
import com.how2j.springcloud.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	public ProductService productService;
	
	@RequestMapping("/products")
    public Object products() {
        List<Product> ps = productService.listProducts();
        return ps;
    }
}
