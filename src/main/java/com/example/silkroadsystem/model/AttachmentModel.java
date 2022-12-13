package com.example.silkroadsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttachmentModel {

    private Long id;

    private String name;

    private String originalFileName;

    private Long size;

    private String contentType;
}
