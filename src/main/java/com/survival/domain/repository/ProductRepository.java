package com.survival.domain.repository;

import java.util.List;

import com.survival.data.ProductRepositoryDbImpl;
import com.survival.data.dao.MySqlProductDaoImpl;
import com.survival.domain.model.Product;

public interface ProductRepository {
    
    public static ProductRepository getInstance() {
        return new ProductRepositoryDbImpl(new MySqlProductDaoImpl());
    }
    
    public List<Product> getAllProducts();
    
    public Product getProductById(String id);
    
    public void addProduct(Product product);
}