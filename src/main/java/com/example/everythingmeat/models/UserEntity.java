package com.example.everythingmeat.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import com.example.everythingmeat.utils.BaseClass;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "users")
public class UserEntity extends BaseClass {
  @Email(message = "A proper email is required")
  @NotBlank(message = "Email is required")
  private  String email;
  @NotBlank(message = "Firstname is required")
  private String firstName;
  @NotBlank(message = "lastname is required")
  private String  lastName;
  @NotBlank(message = "Phone number is required")
  private String phoneNumber;
  private String  AltPhoneNumber;
  @NotBlank(message = "Password is required")
  private String password;
  @OneToMany(cascade = CascadeType.ALL)
  private Set<Order> orders;
  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "users_roles",
          joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
          inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
  )
  private Set<Role> roles;

}
