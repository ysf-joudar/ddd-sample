package fr.training.spring.shop.infrastructure.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.training.spring.shop.domain.item.ItemEntity;
import fr.training.spring.shop.domain.item.ItemRepository;

@Repository
public class ItemRepositoryImpl implements ItemRepository {

	@Autowired
	private ItemDataJpaRepository itemDataJpaRepository;

	@Override
	public List<ItemEntity> getAllItems() {
		return itemDataJpaRepository.findAll();
	}

	@Override
	public ItemEntity addItem(ItemEntity item) {
		return itemDataJpaRepository.save(item);
	}

	@Override
	public List<ItemEntity> getAllItems(List<String> itemsId) {
		return itemDataJpaRepository.findByIdIn(itemsId);
	}

	@Override
	public ItemEntity findOne(String itemId) {
		return itemDataJpaRepository.findOne(itemId);
	}

}
