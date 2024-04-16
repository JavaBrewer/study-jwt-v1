package com.example.uploadfile.controller;

import com.example.uploadfile.dto.request.SignUpRequestDto;
import com.example.uploadfile.dto.response.SignUpResponseDto;
import com.example.uploadfile.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity<SignUpResponseDto> signUp(@RequestBody SignUpRequestDto requestDto) {
        SignUpResponseDto result = memberService.signUp(requestDto);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
