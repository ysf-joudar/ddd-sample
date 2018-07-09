package fr.training.spring.shop.presentation.item.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.training.spring.shop.application.item.ItemManagement;
import fr.training.spring.shop.domain.item.ItemEntity;

@RestController
@RequestMapping("/api")
public class ItemResource {

	@Autowired
	private ItemManagement itemManagement;

	@Autowired
	private ItemMapper itemMapper;

	@GetMapping("/items")
	public List<ItemDTO> showItems() {
		List<ItemEntity> itemEntities = itemManagement.getAllItems();
		return itemMapper.toDto(itemEntities);
	}

}
