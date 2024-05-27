package com.example.cursojava.di.app.cursojavadi.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import com.example.cursojava.di.app.cursojavadi.models.Product;
import com.example.cursojava.di.app.cursojavadi.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

  // other way to get the value from the properties file
  // @Autowired
  // private Environment env;

  // other way to get the value from the properties file
  @Value("${config.price.tax}")
  private Double taxFromConfig;

  // Forma 1
  // @Autowired
  // @Qualifier("productList")
  // private ProductRepository productRepository;

  // Forma 2
  // private ProductRepository productRepository;
  // @Autowired
  // public void setRepository(ProductRepository productRepository) {
  // this.productRepository = productRepository;
  // }

  // Forma 3
  private ProductRepository productRepository;

  public ProductServiceImpl(@Qualifier("productJson") ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public List<Product> findAll() {

    return productRepository.findAll().stream().map(p -> {

      // other way to get the value from the properties file
      // Double tax = Double.parseDouble(env.getProperty("config.price.tax"));

      Double price = p.getPrice() * taxFromConfig;

      // Product newProduct = (Product) p.clone();

      // newProduct.setPrice(price);

      // return newProduct;

      p.setPrice(price);
      return p;

    }).collect(Collectors.toList());
  }

  public Product findById(Long id) {
    return productRepository.findById(id);
  }

}
