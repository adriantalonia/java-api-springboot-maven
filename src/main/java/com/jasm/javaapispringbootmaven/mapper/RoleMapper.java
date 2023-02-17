package com.jasm.javaapispringbootmaven.mapper;

import com.jasm.javaapispringbootmaven.model.dto.request.RoleRequest;
import com.jasm.javaapispringbootmaven.model.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoleMapper {

    RoleMapper MAPPER = Mappers.getMapper( RoleMapper.class );

    Role toEntity(RoleRequest user);
    RoleRequest toResponse(Role user);
}
