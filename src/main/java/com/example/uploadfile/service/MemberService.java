package com.example.uploadfile.service;

import com.example.uploadfile.dto.request.SignUpRequestDto;
import com.example.uploadfile.dto.response.SignUpResponseDto;
import com.example.uploadfile.entity.Member;
import com.example.uploadfile.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public SignUpResponseDto signUp(SignUpRequestDto requestDto) {
        Member newMember = requestDto.toEntity();
        newMember.setPassword(passwordEncoder.encode(requestDto.getPassword()));
        memberRepository.save(newMember);

        return SignUpResponseDto.success();
    }
}
