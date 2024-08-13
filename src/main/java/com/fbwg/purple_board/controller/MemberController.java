package com.fbwg.purple_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Member;


@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/login")
    public String loginView() {
        System.out.println("======== 로그인 ========");
        return "member/login";
    }

    @GetMapping("/join")
    public String joinView() {
        System.out.println("======== 회원가입 ========");
        return "member/join";
    }

    @PostMapping("/join")
    public String join(Member member) {
        System.out.println(member.toString());;
        return "member/join";
    }

    @PostMapping("/login")
    public String login(String memberId, String memberPw) {
        System.out.println(memberId + memberPw);
        return "member/login";
    }

}
