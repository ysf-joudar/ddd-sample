package fr.training.spring.shop.domain.order;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.training.spring.shop.domain.common.BaseEntity;
import fr.training.spring.shop.domain.customer.CustomerEntity;
import fr.training.spring.shop.domain.item.ItemEntity;

@Entity
@Table(name = "ORDERS")
public class OrderEntity extends BaseEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_ID", nullable = false)
	private CustomerEntity customer;

	@ManyToMany
	@JoinTable(name = "ITEM_ORDERS", inverseJoinColumns = @JoinColumn(name = "ITEMS_ID", referencedColumnName = "ID"), joinColumns = @JoinColumn(name = "ORDERS_ID", referencedColumnName = "ID"))
	private List<ItemEntity> items;

	public OrderEntity() {
		super();
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
