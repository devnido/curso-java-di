package com.example.cursojava.di.app.cursojavadi.repositories;

import java.util.List;

import com.example.cursojava.di.app.cursojavadi.models.Product;

public interface ProductRepository {

  List<Product> findAll();

  Product findById(Long id);

}
