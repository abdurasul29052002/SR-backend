package com.example.silkroadsystem.model;

import com.example.silkroadsystem.entity.Attachment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttachmentContentModel {
    private Long id;

    private byte[] content;

    private AttachmentModel attachment;
}
