package fr.training.spring.shop.application.order;

import java.util.List;

import fr.training.spring.shop.domain.order.OrderEntity;

public interface OrderManagement {

	List<OrderEntity> getOrdersForCustomer(String customerID);

	OrderEntity addOrder(OrderEntity order);

	OrderEntity findOne(String orderID);

}
