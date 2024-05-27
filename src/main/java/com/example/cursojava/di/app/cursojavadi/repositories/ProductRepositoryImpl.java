package com.example.cursojava.di.app.cursojavadi.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.example.cursojava.di.app.cursojavadi.models.Product;

@Primary
@RequestScope // ya no es singleton, se crea una instancia por cada request
// @SessionScope // se crea una instancia por cada sesión de usuario en el
// navegador web
@Repository("productList")
public class ProductRepositoryImpl implements ProductRepository {

  List<Product> data;

  public ProductRepositoryImpl() {
    this.data = Arrays.asList(
        new Product(1L, "Computer", 2500.0),
        new Product(2L, "Mouse", 100.0),
        new Product(3L, "Keyboard", 200.0),
        new Product(4L, "Monitor", 500.0),
        new Product(5L, "Headphones", 300.0),
        new Product(6L, "Microphone", 150.0),
        new Product(7L, "Webcam", 200.0),
        new Product(8L, "Printer", 300.0),
        new Product(9L, "Scanner", 200.0),
        new Product(10L, "Smartphone", 1500.0),
        new Product(11L, "Tablet", 1000.0),
        new Product(12L, "Smartwatch", 500.0),
        new Product(13L, "Smartband", 300.0),
        new Product(14L, "Notebook", 3500.0),
        new Product(15L, "Ultrabook", 4500.0),
        new Product(16L, "Netbook", 2500.0),
        new Product(17L, "Chromebook", 2000.0),
        new Product(18L, "Laptop", 3000.0),
        new Product(19L, "Desktop", 4000.0),
        new Product(20L, "Server", 5000.0),
        new Product(21L, "Router", 200.0),
        new Product(22L, "Switch", 300.0),
        new Product(23L, "Hub", 100.0),
        new Product(24L, "Access Point", 200.0),
        new Product(25L, "Firewall", 300.0),
        new Product(26L, "Modem", 100.0),
        new Product(27L, "Network Card", 200.0),
        new Product(28L, "Power Supply", 300.0),
        new Product(29L, "Motherboard", 200.0),
        new Product(30L, "Processor", 300.0),
        new Product(31L, "Memory", 100.0),
        new Product(32L, "Hard Drive", 200.0),
        new Product(33L, "Solid State Drive", 300.0),
        new Product(34L, "Optical Drive", 100.0),
        new Product(35L, "Video Card", 200.0),
        new Product(36L, "Sound Card", 300.0),
        new Product(37L, "Cooler", 100.0),
        new Product(38L, "Case", 200.0),
        new Product(39L, "Monitor Stand", 300.0),
        new Product(40L, "Keyboard Stand", 100.0),
        new Product(41L, "Mouse Pad", 200.0),
        new Product(42L, "Headphone Stand", 300.0),
        new Product(43L, "Microphone Stand", 100.0),
        new Product(44L, "Webcam Stand", 200.0),
        new Product(45L, "Printer Stand", 300.0),
        new Product(46L, "Scanner Stand", 100.0),
        new Product(47L, "Smartphone Stand", 200.0),
        new Product(48L, "Tablet Stand", 300.0),
        new Product(49L, "Smartwatch Stand", 100.0),
        new Product(50L, "Smartband Stand", 200.0),
        new Product(51L, "Notebook Stand", 300.0),
        new Product(52L, "Ultrabook Stand", 100.0),
        new Product(53L, "Netbook Stand", 200.0),
        new Product(54L, "Chromebook Stand", 300.0));
    // create 100 products

  }

  @Override
  public List<Product> findAll() {
    return this.data;
  }

  @Override
  public Product findById(Long id) {
    return this.data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
  }
}
