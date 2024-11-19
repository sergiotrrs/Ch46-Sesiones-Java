package com.superneto.app.model.composite_key;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 *  La anotación @Embeddable en JPA se utiliza para marcar 
 *  una clase como un objeto embebido. Esto significa que la 
 *  clase no tiene su propia tabla en la base de datos, sino 
 *  que sus campos se incorporan como columnas en la tabla de 
 *  la entidad que lo contiene. 
 *  
 *  La clase embebida debe tener un constructor sin argumentos
 *  e implementar la interfaz Serializable.
 */

@Component
@Embeddable
public class PurchaseProductKey implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column( name = "purchase_id" )
	Long purchaseId;
	@Column( name = "product_id" )
	Long productId;
	
	public PurchaseProductKey() {}
	
	public PurchaseProductKey(Long purchaseId, Long productId) {
		this.purchaseId = purchaseId;
		this.productId = productId;
	}

	public Long getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Long purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}	

}
