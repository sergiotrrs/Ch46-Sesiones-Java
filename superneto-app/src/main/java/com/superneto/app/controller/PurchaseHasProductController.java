package com.superneto.app.controller;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.superneto.app.model.PurchaseHasProduct;
import com.superneto.app.service.PurchaseHasProductService;

@RestController
@RequestMapping("api/v1/purchases-has-products")
@CrossOrigin(origins = "*")
public class PurchaseHasProductController {

	PurchaseHasProductService puHprService;

	public PurchaseHasProductController(PurchaseHasProductService puHprService) {
		this.puHprService = puHprService;
	}
	
	
	@PostMapping
	public ResponseEntity<PurchaseHasProduct> createOrderHasProduct(@RequestBody PurchaseHasProduct purchaseHasProducts) {
		PurchaseHasProduct savedOrderHasProduct = puHprService.createOrderHasProduct(purchaseHasProducts);
		return ResponseEntity.status(201).body(savedOrderHasProduct);
	}
		
	@GetMapping
	public ResponseEntity< Iterable<PurchaseHasProduct>> getAllPurchaseHasProducts() {
		Iterable<PurchaseHasProduct> orderHasProducts = puHprService.getPurchaseHasProducts();
		return ResponseEntity.ok(orderHasProducts);
	}
	
	@GetMapping("/query") // localhost:8080/api/v1/purchases-has-products/query?purchaseId=1&productId=3 
	public ResponseEntity< PurchaseHasProduct> getPurchaseHasProductByCompositeId(
			@RequestParam(name = "purchaseId") Long purchaseId,
			@RequestParam(name = "productId") Long productId
			) {
		PurchaseHasProduct orderHasProduct = puHprService.getPurchaseHasProductByCompositeId(purchaseId, productId);
		return ResponseEntity.ok(orderHasProduct);
	}
	
	@GetMapping("/purchase/{id}") // localhost:8080/api/v1/purchases-has-products/purchase/1
	public ResponseEntity< Set<PurchaseHasProduct>> getPurchaseHasProductsByPurchaseId(
			@PathVariable("id") Long purchaseId
			) {
		Set<PurchaseHasProduct> orderHasProduct = puHprService.getPurchaseHasProductsByPurchaseId(purchaseId);
		return ResponseEntity.ok(orderHasProduct);
	}
}
