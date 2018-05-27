package fr.training.spring.shop.domain.item;

import java.util.List;

public interface ItemRepository {

	List<ItemEntity> getAllItems();

	ItemEntity addItem(ItemEntity itemEntity);

	List<ItemEntity> getAllItems(List<String> itemsId);

	ItemEntity findOne(String itemId);

}
