package com.survival.data.dao;

import java.util.List;

import com.survival.domain.model.Product;

public interface ProductDao {
	
	List<Product> getAll();
	
	void insert(Product product);
	void update(Product product);
	void delete(Product product);
}
