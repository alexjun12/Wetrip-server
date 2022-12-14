package com.wetrip.wetrip.controller.member;

import com.wetrip.wetrip.dto.member.request.MemberJoinRequestDto;
import com.wetrip.wetrip.dto.member.request.MemberLoginRequestDto;
import com.wetrip.wetrip.dto.member.response.MemberJoinResponseDto;
import com.wetrip.wetrip.dto.member.response.MemberLoginResponseDto;
import org.springframework.stereotype.Controller;

@Controller
public interface MemberController {
    MemberJoinResponseDto signIn(MemberJoinRequestDto memberJoinRequestDto);
    MemberLoginResponseDto logIn(MemberLoginRequestDto memberLoginRequestDto);
}
