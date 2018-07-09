package fr.training.spring.shop.presentation.customer.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.training.spring.shop.application.customer.CustomerManagement;
import fr.training.spring.shop.domain.customer.CustomerEntity;

@RestController
@RequestMapping("/api")
public class CustomerResource {

	@Autowired
	private CustomerMapper customeEntityMapper;

	@Autowired
	private CustomerManagement customerManagement;

	@PostMapping("/customers")
	public void addOrder(@Valid @RequestBody CustomerDTO customerDTO) {
		CustomerEntity customerEntity = customeEntityMapper.toEntity(customerDTO);
		customerManagement.create(customerEntity);
	}

	@GetMapping("/customers/{customerID}")
	public CustomerDTO getCustomer(@PathVariable String customerID) {
		CustomerEntity customerEntity = customerManagement.findOne(customerID);
		return customeEntityMapper.toDto(customerEntity);
	}
}
