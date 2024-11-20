package com.superneto.app.service;

import java.util.Set;

import com.superneto.app.model.PurchaseHasProduct;

public interface PurchaseHasProductService {
	
	PurchaseHasProduct createOrderHasProduct(PurchaseHasProduct purchaseHasProduct);
	Set<PurchaseHasProduct> getPurchaseHasProducts();	
	PurchaseHasProduct getPurchaseHasProductByCompositeId(Long purchaseId, Long productId);	
	Set<PurchaseHasProduct> getPurchaseHasProductsByPurchaseId(Long purchaseId);		
	PurchaseHasProduct updatePurchaseHasProductByCompositeId(PurchaseHasProduct purchaseHasProduct, long purchaseId, long productId);
	void deletePurchaseHasProductByCompositeId(Long purchaseId, Long productId);

}
