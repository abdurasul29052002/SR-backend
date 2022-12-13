package com.example.silkroadsystem.repository;

import com.example.silkroadsystem.entity.Attachment;
import com.example.silkroadsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment,Long> {
}
