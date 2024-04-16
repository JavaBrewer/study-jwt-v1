package com.example.uploadfile.common;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public enum APIResponse {
    SUCCESS(200, "SU");

    private int statusCode;
    private String message;

    APIResponse(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }
}
