package com.example.demo.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.example.demo.entities.Order;
import com.example.demo.entities.Products;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	private Products products;
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Products getProduct() {
		return products;
	}
	public void setProduct(Products product) {
		this.products = product;
	}
	@Override
	public int hashCode() {
		return Objects.hash(order, products);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPK other = (OrderItemPK) obj;
		return Objects.equals(order, other.order) && Objects.equals(products, other.products);
	}

	
}
