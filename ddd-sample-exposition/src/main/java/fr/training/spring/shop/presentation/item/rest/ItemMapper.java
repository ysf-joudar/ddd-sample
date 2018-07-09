package fr.training.spring.shop.presentation.item.rest;

import java.util.List;

import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import fr.training.spring.shop.domain.item.ItemEntity;

/**
 * Mapper for the entity CustomeEntity and its DTO CustomeDTO.
 */
public interface ItemMapper {

	@Mappings({ @Mapping(target = "itemVO.description", source = "description"),
			@Mapping(target = "id", source = "itemID"), @Mapping(target = "orders", ignore = true),
			@Mapping(target = "itemVO.price", source = "price") })
	ItemEntity toEntity(ItemDTO itemDTO);

	@Mappings({ @Mapping(target = "description", source = "itemVO.description"),
			@Mapping(target = "itemID", source = "id"), @Mapping(target = "price", source = "itemVO.price") })
	ItemDTO toDto(ItemEntity itemEntity);

	List<ItemEntity> toEntity(List<ItemDTO> dtoList);

	List<ItemDTO> toDto(List<ItemEntity> entityList);

}