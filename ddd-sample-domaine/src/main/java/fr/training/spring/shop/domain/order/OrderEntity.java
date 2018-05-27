package fr.training.spring.shop.domain.order;

import java.util.List;

import javax.validation.Valid;

import fr.training.spring.shop.domain.common.BaseEntity;
import fr.training.spring.shop.domain.customer.CustomerEntity;
import fr.training.spring.shop.domain.item.ItemEntity;

public class OrderEntity extends BaseEntity {

	@Valid
	private CustomerEntity customer;

	private List<ItemEntity> items;

	public OrderEntity() {
		super();
	}

	public OrderEntity(CustomerEntity customer, List<ItemEntity> items) {
		super();
		this.customer = customer;
		this.items = items;
	}

	public List<ItemEntity> getItems() {
		return items;
	}

	public void setItems(List<ItemEntity> items) {
		this.items = items;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}
}
