package com.example.uploadfile.controller;

import com.example.uploadfile.dto.request.SignInRequestDto;
import com.example.uploadfile.dto.response.SignInResponseDto;
import com.example.uploadfile.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/signin")
    public ResponseEntity<SignInResponseDto> signIn(@RequestBody SignInRequestDto requestDto) {
        SignInResponseDto result = authService.signIn(requestDto);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
