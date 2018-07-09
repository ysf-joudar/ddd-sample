package fr.training.spring.shop.application.customer;

import fr.training.spring.shop.domain.customer.CustomerEntity;

public interface CustomerManagement {

	CustomerEntity create(CustomerEntity customer);

	CustomerEntity findOne(String customerID);

}
