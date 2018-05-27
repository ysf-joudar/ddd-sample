package fr.training.spring.shop.infrastructure.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.training.spring.shop.domain.customer.CustomerEntity;
import fr.training.spring.shop.domain.customer.CustomerRepository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	@Autowired
	private CustomerDataJpaRepository customerDataJpaRepository;

	@Override
	public CustomerEntity create(CustomerEntity customer) {
		return customerDataJpaRepository.save(customer);
	}

	@Override
	public CustomerEntity findOne(String customerID) {
		return customerDataJpaRepository.findOne(customerID);
	}

}
