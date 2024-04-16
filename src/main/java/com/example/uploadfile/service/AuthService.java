package com.example.uploadfile.service;

import com.example.uploadfile.dto.request.SignInRequestDto;
import com.example.uploadfile.dto.response.SignInResponseDto;
import com.example.uploadfile.entity.Member;
import com.example.uploadfile.repository.MemberRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final MemberRepository memberRepository;

    public SignInResponseDto signIn(SignInRequestDto requestDto) {
        Member member = memberRepository.findByEmail(requestDto.getEmail())
                .orElseThrow(() -> new EntityNotFoundException("member not found with email" + requestDto.getEmail()));
        if (!member.getPassword().equals(requestDto.getPassword())) {
            throw new RuntimeException("비밀번호가 일치하지 않습니다.");
        }

        SignInResponseDto result = SignInResponseDto.success("test token");

        return result;
    }
}
