package fr.training.spring.shop.application.customer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.training.spring.shop.domain.customer.CustomerEntity;
import fr.training.spring.shop.domain.customer.CustomerRepository;
import fr.training.spring.shop.domain.customer.CustomerVO;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CustomerManagementImplTest {

	@Autowired
	private CustomerManagement customerManagement;

	@MockBean
	private CustomerRepository customerRepository;

	@Test
	public void testCreate() {
		CustomerVO customerVO = new CustomerVO("NAME1", "PASS1");
		CustomerEntity customerEntity = new CustomerEntity(customerVO);
		when(customerRepository.create(customerEntity)).thenReturn(customerEntity);
		CustomerEntity customerResultEntity = customerManagement.create(customerEntity);
		assertNotNull(customerResultEntity);
		assertEquals("NAME1", customerResultEntity.getCustomerVO().getName());
	}

	@Test
	public void testFindOne() {
		CustomerVO customerVO = new CustomerVO("NAME1", "PASS1");
		CustomerEntity customerEntity = new CustomerEntity(customerVO);
		customerEntity.setId("123e4567-e89b-42d3-a456-556642440000");
		when(customerRepository.findOne("123e4567-e89b-42d3-a456-556642440000")).thenReturn(customerEntity);
		CustomerEntity customerResultEntity = customerManagement.findOne("123e4567-e89b-42d3-a456-556642440000");
		assertEquals("NAME1", customerResultEntity.getCustomerVO().getName());
	}

}
