package com.example.silkroadsystem.service;

import com.example.silkroadsystem.entity.Attachment;
import com.example.silkroadsystem.mapper.AttachmentMapper;
import com.example.silkroadsystem.model.AttachmentModel;
import com.example.silkroadsystem.repository.AttachmentRepository;
import com.example.silkroadsystem.service.template.GenericService;
import org.springframework.stereotype.Service;

@Service
public class AttachmentService extends GenericService<Attachment, AttachmentModel, AttachmentRepository, AttachmentMapper> {
    public AttachmentService(AttachmentRepository repository, AttachmentMapper mapper) {
        super(repository, mapper);
    }
}
