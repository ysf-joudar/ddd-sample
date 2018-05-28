package fr.training.spring.shop.domain.item;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import fr.training.spring.shop.domain.common.BaseEntity;
import fr.training.spring.shop.domain.order.OrderEntity;

@Entity
@Table(name = "ITEM")
public class ItemEntity extends BaseEntity {

	@Column
	private String description;

	@Column
	private int price;

	@ManyToMany(mappedBy = "items")
	private List<OrderEntity> orders;

	public ItemEntity() {
		super();
	}

	public ItemEntity(String description, int price) {
		this.description = description;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<OrderEntity> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}

}
