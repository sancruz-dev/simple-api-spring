package com.sancruzdev.demo_api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sancruzdev.demo_api.entities.Product;
import com.sancruzdev.demo_api.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
  
  @Autowired
  private ProductRepository productRepository;

  @GetMapping
  public List<Product> getObjects() {
    List<Product> list = productRepository.findAll();
    return list;
  }
}
