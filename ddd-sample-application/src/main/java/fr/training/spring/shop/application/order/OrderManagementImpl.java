package fr.training.spring.shop.application.order;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.training.spring.shop.domain.customer.CustomerEntity;
import fr.training.spring.shop.domain.customer.CustomerRepository;
import fr.training.spring.shop.domain.item.ItemEntity;
import fr.training.spring.shop.domain.item.ItemRepository;
import fr.training.spring.shop.domain.order.OrderEntity;
import fr.training.spring.shop.domain.order.OrderRepository;

@Service
@Transactional
public class OrderManagementImpl implements OrderManagement {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ItemRepository itemRepository;

	@Override
	public List<OrderEntity> getOrdersForCustomer(String customerID) {
		return orderRepository.getOrdersForCustomer(customerID);
	}

	@Override
	public OrderEntity addOrder(OrderEntity orderEntity) {
		CustomerEntity customerEntity = customerRepository.findOne(orderEntity.getCustomer().getId());
		List<ItemEntity> items = itemRepository
				.getAllItems(orderEntity.getItems().stream().map(ItemEntity::getId).collect(Collectors.toList()));
		orderEntity.setCustomer(customerEntity);
		orderEntity.setItems(items);
		return orderRepository.addOrder(orderEntity);
	}

	@Override
	public OrderEntity findOne(String orderID) {
		return orderRepository.findOne(orderID);
	}

}
