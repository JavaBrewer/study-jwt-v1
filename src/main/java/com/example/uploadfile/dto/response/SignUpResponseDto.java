package com.example.uploadfile.dto.response;

import com.example.uploadfile.common.APIResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SignUpResponseDto {
    private int code;
    private String message;

    public static SignUpResponseDto success() {
        return new SignUpResponseDto(APIResponse.SUCCESS.getStatusCode(), APIResponse.SUCCESS.getMessage());
    }
}
