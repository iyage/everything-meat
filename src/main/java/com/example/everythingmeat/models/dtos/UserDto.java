package com.example.everythingmeat.models.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private  String email;
    private String firstName;
    private String  lastName;
    private String phoneNumber;
    private String  AltPhoneNumber;
    private String password;
}
