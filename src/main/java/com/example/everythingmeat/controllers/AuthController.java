package com.example.everythingmeat.controllers;

import com.example.everythingmeat.models.dtos.LoginDto;
import com.example.everythingmeat.models.dtos.ResponseDto;
import com.example.everythingmeat.services.AuthService.AuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    @Autowired
    AuthServiceImpl authService;
    @PostMapping()
    private ResponseEntity<ResponseDto> Auth(@RequestBody LoginDto loginDto){
        try{
            String token = authService.login(loginDto);
            return  new ResponseEntity<ResponseDto>(new ResponseDto("Success",200,token), HttpStatus.OK);
        }
        catch (Exception exp){
            exp.printStackTrace();
            return  new ResponseEntity<ResponseDto>(new ResponseDto(exp.getMessage(),400,null), HttpStatus.BAD_REQUEST);

        }

    }
}
