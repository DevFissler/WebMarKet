package com.survival.data;

import java.util.Collections;
import java.util.List;
import com.survival.data.dao.ProductDao;
import com.survival.domain.model.Product;
import com.survival.domain.repository.ProductRepository;

public class ProductRepositoryDbImpl implements ProductRepository {
    private ProductDao dao;
    
    public ProductRepositoryDbImpl(ProductDao dao) {
       this.dao = dao;
    }

    @Override
    public List<Product> getAllProducts() {
        return dao.getAll();
    }

    @Override
    public Product getProductById(String id) {
        return getAllProducts().stream()
                .filter((product) -> product.getId().equals(id)) // 조건
                .findFirst() // 첫번째
                .get(); // 얻어
    }

    @Override
    public void addProduct(Product product) {
    	dao.insert(product);
        
    }
    
}