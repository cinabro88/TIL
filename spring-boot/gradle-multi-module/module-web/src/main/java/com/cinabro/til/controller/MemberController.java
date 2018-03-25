package com.cinabro.til.controller;

import com.cinabro.til.domain.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {


    @GetMapping("/members")
    public Member get() {
        return new Member("cinabro");
    }
}
