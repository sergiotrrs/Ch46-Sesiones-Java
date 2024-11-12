package com.superneto.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.superneto.app.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	// Crear método que retorne todos los productos mayores a una cantidad
	List<Product> findByPriceGreaterThanEqual(Double price);
}
