package com.example.everythingmeat.services.AuthService;

import com.example.everythingmeat.models.dtos.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
