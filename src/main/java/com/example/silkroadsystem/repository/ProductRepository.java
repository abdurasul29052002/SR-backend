package com.example.silkroadsystem.repository;

import com.example.silkroadsystem.entity.Product;
import com.example.silkroadsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
