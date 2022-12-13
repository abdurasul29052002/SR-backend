package com.example.silkroadsystem.repository;

import com.example.silkroadsystem.entity.Category;
import com.example.silkroadsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
