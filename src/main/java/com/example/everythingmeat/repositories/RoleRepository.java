package com.example.everythingmeat.repositories;

import com.example.everythingmeat.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}