package fr.training.spring.shop.application.item;

import java.util.List;

import fr.training.spring.shop.domain.item.ItemEntity;

public interface ItemManagement {

	List<ItemEntity> getAllItems();

	ItemEntity addItem(ItemEntity itemEntity);

}
