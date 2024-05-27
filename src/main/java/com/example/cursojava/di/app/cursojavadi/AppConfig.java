package com.example.cursojava.di.app.cursojavadi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

import com.example.cursojava.di.app.cursojavadi.repositories.ProductRepository;
import com.example.cursojava.di.app.cursojavadi.repositories.ProductRepositoryJson;

@Configuration
@PropertySource("classpath:config.properties")
public class AppConfig {

  @Value("classpath:json/products.json")
  private Resource resource;

  @Bean("productJson")
  ProductRepository productRepositoryJson() {
    return new ProductRepositoryJson(resource);
  }

}
