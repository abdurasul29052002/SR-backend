package com.example.silkroadsystem.mapper;

import com.example.silkroadsystem.entity.Attachment;
import com.example.silkroadsystem.mapper.template.GenericMapper;
import com.example.silkroadsystem.model.AttachmentModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AttachmentMapper extends GenericMapper<Attachment, AttachmentModel> {
}
