package com.superneto.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.superneto.app.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
