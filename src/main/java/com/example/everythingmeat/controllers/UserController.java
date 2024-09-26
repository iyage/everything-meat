package com.example.everythingmeat.controllers;

import com.example.everythingmeat.models.UserEntity;
import com.example.everythingmeat.models.dtos.ResponseDto;
import com.example.everythingmeat.models.dtos.UserDto;
import com.example.everythingmeat.services.UserServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @GetMapping
    private ResponseEntity<ResponseDto> get(){
        return new ResponseEntity<ResponseDto>(new ResponseDto(), HttpStatus.OK);
    }
    @PostMapping
    private ResponseEntity<ResponseDto> create(@RequestBody @Valid UserDto userDto){
        try{
            System.out.println(userDto.getEmail());
            UserEntity user = userService.create(userDto);
            return new ResponseEntity<ResponseDto>(new ResponseDto("User created successfully",201,user), HttpStatus.CREATED);
        }
        catch (Exception exp){
        exp.printStackTrace();
            return  new ResponseEntity<ResponseDto>(new ResponseDto(exp.getMessage(),400,null),HttpStatus.BAD_REQUEST);
        }

    }
    @DeleteMapping
    private ResponseEntity<ResponseDto> delete(){
        return new ResponseEntity<ResponseDto>(new ResponseDto(), HttpStatus.NO_CONTENT);
    }
    @PutMapping
    private  ResponseEntity<ResponseDto> update(){
        return new ResponseEntity<ResponseDto>(new ResponseDto(), HttpStatus.OK);
    }
}
