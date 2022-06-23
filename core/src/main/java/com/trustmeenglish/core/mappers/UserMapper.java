package com.trustmeenglish.core.mappers;


import com.trustmeenglish.core.dto.UserDTO;
import com.trustmeenglish.core.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserDTO toDTO(User user);
}
