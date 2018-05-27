package fr.training.spring.shop.domain.customer;

import javax.validation.Valid;

import fr.training.spring.shop.domain.common.BaseEntity;

public class CustomerEntity extends BaseEntity {

	@Valid
	private CustomerVO customerVO;

	public CustomerEntity() {
		super();
	}

	public CustomerEntity(CustomerVO customerVO) {
		this.customerVO = customerVO;
	}

	public CustomerVO getCustomerVO() {
		return customerVO;
	}

	public void setCustomerVO(CustomerVO customerVO) {
		this.customerVO = customerVO;
	}

}