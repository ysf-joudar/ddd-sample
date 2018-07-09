package fr.training.spring.shop.presentation.customer.rest;

import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import fr.training.spring.shop.domain.customer.CustomerEntity;

/**
 * Mapper for the entity CustomeEntity and its DTO CustomeDTO.
 */
public interface CustomerMapper {

	@Mappings({ @Mapping(target = "customerVO.name", source = "name"), @Mapping(target = "id", source = "customerID"),
			@Mapping(target = "customerVO.password", source = "password") })
	CustomerEntity toEntity(CustomerDTO customerDTO);

	@Mappings({ @Mapping(target = "name", source = "customerVO.name"), @Mapping(target = "customerID", source = "id"),
			@Mapping(target = "password", source = "customerVO.password") })
	CustomerDTO toDto(CustomerEntity entity);

}