package com.superneto.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.superneto.app.model.Product;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends CrudRepository<Product, Long> {
	// Crear método que retorne todos los productos mayores a una cantidad
	// localhost:8080/api/v3/products?price=600
	List<Product> findByPriceGreaterThanEqual(@Param("price")Double price);
}
