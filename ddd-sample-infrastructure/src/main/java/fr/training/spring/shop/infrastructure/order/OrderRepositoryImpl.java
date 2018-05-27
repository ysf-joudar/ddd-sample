package fr.training.spring.shop.infrastructure.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.training.spring.shop.domain.order.OrderEntity;
import fr.training.spring.shop.domain.order.OrderRepository;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

	@Autowired
	private OrderDataJpaRepository orderDataJpaRepository;

	@Override
	public List<OrderEntity> getOrdersForCustomer(String id) {
		return orderDataJpaRepository.getOrdersForCustomer(id);
	}

	@Override
	public OrderEntity addOrder(OrderEntity orderEntity) {
		return orderDataJpaRepository.save(orderEntity);
	}

	@Override
	public void addOrders(List<OrderEntity> orders) {
		orderDataJpaRepository.save(orders);
	}

	@Override
	public OrderEntity findOne(String orderID) {
		return orderDataJpaRepository.getOne(orderID);
	}

}
