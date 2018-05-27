package fr.training.spring.shop.domain.order;

import java.util.List;

public interface OrderRepository {

	List<OrderEntity> getOrdersForCustomer(String customerID);

	OrderEntity addOrder(OrderEntity order);

	void addOrders(List<OrderEntity> orders);

	OrderEntity findOne(String orderID);

}
