package com.example.silkroadsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AttachmentContent {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private byte[] content;

    @OneToOne(mappedBy = "attachmentContent")
    private Attachment attachment;
}
