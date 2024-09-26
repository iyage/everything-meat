package com.example.everythingmeat.services.UserService;

import com.example.everythingmeat.models.UserEntity;
import com.example.everythingmeat.models.dtos.ResponseDto;
import com.example.everythingmeat.models.dtos.UserDto;

public interface UserService {
    public UserEntity create(UserDto userDto) throws Exception;
}
