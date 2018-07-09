package fr.training.spring.shop.application.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.training.spring.shop.domain.item.ItemEntity;
import fr.training.spring.shop.domain.item.ItemRepository;

@Service
@Transactional
public class ItemManagementImpl implements ItemManagement {

	@Autowired
	private ItemRepository itemRepository;

	@Override
	@Cacheable("itemCache")
	public List<ItemEntity> getAllItems() {
		return itemRepository.getAllItems();
	}

	@Override
	@CacheEvict(value = "itemCache", allEntries = true)
	public ItemEntity addItem(ItemEntity itemEntity) {
		return itemRepository.addItem(itemEntity);
	}

}
