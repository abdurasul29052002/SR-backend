package com.example.silkroadsystem.model;

import lombok.Builder;

@Builder
public class BaseResult<D> {
    private boolean success = false;

    private String message;

    private String error;

    private D data;
}
