package com.example.everythingmeat.services;

import com.example.everythingmeat.models.UserEntity;
import com.example.everythingmeat.models.dtos.ResponseDto;
import com.example.everythingmeat.models.dtos.UserDto;
import com.example.everythingmeat.repositories.UserEntityRepository;
import com.example.everythingmeat.services.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;
@Autowired
    UserEntityRepository userEntityRepository;
    @Override
    public UserEntity create(UserDto userDto) throws Exception {
      //check if email exit
        Optional<UserEntity> optionalUser = userEntityRepository.findByEmail(userDto.getEmail());
        if(optionalUser.isPresent()){
            throw new Exception("Email is taken");
        }
        String hashPassword = passwordEncoder.encode(userDto.getPassword());
          UserEntity user = new UserEntity().builder()
                  .email(userDto.getEmail())
                  .firstName(userDto.getFirstName())
                  .lastName(userDto.getLastName())
                  .password(hashPassword)
                  .phoneNumber(userDto.getPhoneNumber())
                  .build();
        return  userEntityRepository.save(user);
    }
}
