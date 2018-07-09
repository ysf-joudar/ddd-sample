package fr.training.spring.shop.application.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.training.spring.shop.domain.customer.CustomerEntity;
import fr.training.spring.shop.domain.customer.CustomerRepository;

@Service
@Transactional
public class CustomerManagementImpl implements CustomerManagement {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public CustomerEntity create(CustomerEntity customerEntity) {
		return customerRepository.create(customerEntity);
	}

	@Override
	public CustomerEntity findOne(String customerID) {
		return customerRepository.findOne(customerID);
	}

}
