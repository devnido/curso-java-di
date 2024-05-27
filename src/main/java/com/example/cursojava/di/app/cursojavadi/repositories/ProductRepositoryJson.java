package com.example.cursojava.di.app.cursojavadi.repositories;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.example.cursojava.di.app.cursojavadi.models.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProductRepositoryJson implements ProductRepository {

  private List<Product> products;

  public ProductRepositoryJson(Resource resource) {
    // Resource resource = new ClassPathResource("json/products.json");
    ObjectMapper mapper = new ObjectMapper();
    try {
      products = Arrays.asList(mapper.readValue(resource.getInputStream(), Product[].class));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public List<Product> findAll() {
    return products;
  }

  @Override
  public Product findById(Long id) {
    return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
  }

}
