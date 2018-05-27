package fr.training.spring.shop.domain.customer;

public interface CustomerRepository {

	CustomerEntity create(CustomerEntity customer);

	CustomerEntity findOne(String id);
}
