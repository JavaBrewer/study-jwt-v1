package com.example.uploadfile.dto.response;

import com.example.uploadfile.common.APIResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class SignInResponseDto {
    private int code;
    private String message;
    private String token;

    public static SignInResponseDto success(String token) {
        SignInResponseDto result = new SignInResponseDtoBuilder()
                .code(APIResponse.SUCCESS.getStatusCode())
                .message(APIResponse.SUCCESS.getMessage())
                .token(token)
                .build();
        return result;
    }
}
