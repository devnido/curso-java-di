package com.example.cursojava.di.app.cursojavadi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.cursojava.di.app.cursojavadi.models.Product;
import com.example.cursojava.di.app.cursojavadi.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  @Autowired
  private ProductService productService;

  @GetMapping
  public List<Product> findAll() {

    return productService.findAll();
  }

  @GetMapping("/{id}")
  public Product findById(@PathVariable Long id) {

    return productService.findById(id);
  }

}
