package fr.training.spring.shop.domain.customer;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.training.spring.shop.domain.common.BaseEntity;
import fr.training.spring.shop.domain.order.OrderEntity;

@Entity
@Table(name = "CUSTOMER")
public class CustomerEntity extends BaseEntity {

	@Column
	private String name;

	@Column
	private String password;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
	private List<OrderEntity> orders;

	public CustomerEntity() {
		super();
	}

	public CustomerEntity(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
