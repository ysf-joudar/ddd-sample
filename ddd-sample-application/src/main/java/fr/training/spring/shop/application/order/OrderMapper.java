package fr.training.spring.shop.application.order;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import fr.training.spring.shop.application.item.ItemDTO;
import fr.training.spring.shop.domain.item.ItemEntity;
import fr.training.spring.shop.domain.order.OrderEntity;

/**
 * Mapper for the entity CustomeEntity and its DTO CustomeDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface OrderMapper {

	@Mappings({ @Mapping(target = "customer.id", source = "customerID"), @Mapping(target = "id", source = "orderID") })
	OrderEntity toEntity(OrderDTO orderDTO);

	@Mappings({ @Mapping(target = "itemVO.description", source = "description"),
			@Mapping(target = "id", source = "itemID"), @Mapping(target = "orders", ignore = true),
			@Mapping(target = "itemVO.price", source = "price") })
	ItemEntity toEntity(ItemDTO itemDTO);

	@Mappings({ @Mapping(target = "customerID", source = "customer.id"), @Mapping(target = "orderID", source = "id") })
	OrderDTO toDto(OrderEntity orderEntity);

	@Mappings({ @Mapping(target = "description", source = "itemVO.description"),
			@Mapping(target = "itemID", source = "id"), @Mapping(target = "price", source = "itemVO.price") })
	ItemDTO toDto(ItemEntity itemEntity);

	List<OrderEntity> toEntity(List<OrderDTO> dtoList);

	List<OrderDTO> toDto(List<OrderEntity> entityList);

}