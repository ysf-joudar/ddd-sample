package fr.training.spring.shop.infrastructure.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.training.spring.shop.domain.customer.CustomerEntity;

public interface CustomerDataJpaRepository extends JpaRepository<CustomerEntity, String> {

}
