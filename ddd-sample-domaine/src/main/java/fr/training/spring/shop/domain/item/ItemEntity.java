package fr.training.spring.shop.domain.item;

import java.util.List;

import javax.validation.Valid;

import fr.training.spring.shop.domain.common.BaseEntity;
import fr.training.spring.shop.domain.order.OrderEntity;

public class ItemEntity extends BaseEntity {

	@Valid
	private ItemVO itemVO;

	private List<OrderEntity> orders;

	public ItemEntity() {
		super();
	}

	public ItemEntity(ItemVO itemVO) {
		this.itemVO = itemVO;
	}

	public ItemVO getItemVO() {
		return itemVO;
	}

	public void setItemVO(ItemVO itemVO) {
		this.itemVO = itemVO;
	}

	public List<OrderEntity> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}
}
