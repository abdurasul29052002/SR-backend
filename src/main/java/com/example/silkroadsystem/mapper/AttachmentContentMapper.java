package com.example.silkroadsystem.mapper;

import com.example.silkroadsystem.entity.AttachmentContent;
import com.example.silkroadsystem.mapper.template.GenericMapper;
import com.example.silkroadsystem.model.AttachmentContentModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AttachmentContentMapper extends GenericMapper<AttachmentContent, AttachmentContentModel> {
}
