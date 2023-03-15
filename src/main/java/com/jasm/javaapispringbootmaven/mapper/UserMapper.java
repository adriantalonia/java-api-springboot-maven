package com.jasm.javaapispringbootmaven.mapper;

import com.jasm.javaapispringbootmaven.model.dto.request.UserCreateRequest;
import com.jasm.javaapispringbootmaven.model.dto.response.UserResponse;
import com.jasm.javaapispringbootmaven.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {RoleMapper.class})
public interface UserMapper {

    UserMapper MAPPER = Mappers.getMapper( UserMapper.class );

    User toEntity(UserCreateRequest user);
    UserResponse toResponse(User user);
}
