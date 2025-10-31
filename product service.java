package com.example.electronicstore.service;

import com.example.electronicstore.model.Product;
import com.example.electronicstore.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product saveProduct(Product p) {
        return repo.save(p);
    }

    public void deleteProduct(Long id) {
        repo.deleteById(id);
    }
}