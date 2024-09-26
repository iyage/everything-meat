package com.example.everythingmeat.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import com.example.everythingmeat.utils.BaseClass;
@Entity
@Data
@Table(name = "products")
public class Product extends BaseClass {
}
