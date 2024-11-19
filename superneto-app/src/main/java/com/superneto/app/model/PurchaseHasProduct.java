package com.superneto.app.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.superneto.app.model.composite_key.PurchaseProductKey;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name="purchase_has_products")
public class PurchaseHasProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * La anotación @EmbeddedId en JPA se utiliza para definir 
	 * una clave primaria compuesta utilizando una clase embebida.
	 */
	@EmbeddedId
	private PurchaseProductKey id;
	
	/**
	 * @MapsId mapear una relación de entidad a una clave primaria 
	 * compuesta cuando una de las partes de la clave primaria es 
	 * también una clave foránea.
	 * 
	 * @JoinColumn se utiliza para especificar la columna de la 
	 * base de datos que se utilizará para la unión en una relación 
	 * de entidades. 
	 *   name: El nombre de la columna en la base de datos.
	 * Se utiliza en relaciones como @ManyToOne, @OneToMany, 
	 * @OneToOne, y @ManyToMany.
	 */
	@ManyToOne
	@MapsId("purchaseId")
    @JoinColumn(name = "purchase_id")
	private Purchase purchase;
	
	/**
	 * @JsonIgnoreProperties evitar la serialización o deserialización 
	 * de ciertas propiedades de un objeto cuando se trabaja con JSON.
	 * Es posible omitir varios campos ej. 
	 * 	@JsonIgnoreProperties({"description", "category"})
	 */
	@ManyToOne
	@MapsId("productId")
    @JoinColumn(name = "product_id")
	private Product product;
		
	@Column(name = "quantity")	
	private int quantity;
	
	@Column(name = "purchase_sold", precision=7, scale=2)	
	private BigDecimal purchaseSold;

	public PurchaseHasProduct() {}

	public PurchaseProductKey getId() {
		return id;
	}

	public void setId(PurchaseProductKey id) {
		this.id = id;
	}

	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPurchaseSold() {
		return purchaseSold;
	}

	public void setPurchaseSold(BigDecimal purchaseSold) {
		this.purchaseSold = purchaseSold;
	}
	
	

}
