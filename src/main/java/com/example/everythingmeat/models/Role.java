package com.example.everythingmeat.models;

import com.example.everythingmeat.utils.BaseClass;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "roles")
public class Role extends BaseClass {
    private String name;
}
