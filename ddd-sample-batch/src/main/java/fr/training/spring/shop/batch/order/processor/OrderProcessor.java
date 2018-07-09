package fr.training.spring.shop.batch.order.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.training.spring.shop.application.order.OrderManagement;
import fr.training.spring.shop.domain.order.OrderEntity;

@Component
public class OrderProcessor implements ItemProcessor<String, OrderEntity> {

	@Autowired
	private OrderManagement orderManagement;

	@Override
	public OrderEntity process(String orderID) throws Exception {

		return orderManagement.findOne(orderID);
	}

}
