package com.example.cursojava.di.app.cursojavadi.repositories;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.example.cursojava.di.app.cursojavadi.models.Product;

@Repository("productFoo")
public class ProductRepositoryFoo implements ProductRepository {

  @Override
  public List<Product> findAll() {
    return Collections.singletonList(new Product(1L, "Product from ProductRepositoryFoo", 100.0));
  }

  @Override
  public Product findById(Long id) {
    return new Product(id, "Product from ProductRepositoryFoo", 100.0);
  }

}
