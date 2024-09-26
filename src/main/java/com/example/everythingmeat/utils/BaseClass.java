package com.example.everythingmeat.utils;
import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
@MappedSuperclass
public class BaseClass {
    public BaseClass(Long id) {
        this.id = id;
    }
    public BaseClass(){
    }
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(nullable = false,unique = true)
   private  Long id;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;


}
