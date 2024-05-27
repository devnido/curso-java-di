package com.example.cursojava.di.app.cursojavadi.services;

import java.util.List;

import com.example.cursojava.di.app.cursojavadi.models.Product;

public interface ProductService {

  public List<Product> findAll();

  public Product findById(Long id);

}
