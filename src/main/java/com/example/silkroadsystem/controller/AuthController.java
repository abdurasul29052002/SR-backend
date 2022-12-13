package com.example.silkroadsystem.controller;

import com.example.silkroadsystem.model.ApiResponse;
import com.example.silkroadsystem.model.BaseResult;
import com.example.silkroadsystem.model.UserModel;
import com.example.silkroadsystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/register")
    public UserModel register(@RequestBody UserModel userModel){
        return userService.register(userModel);
    }

    @PostMapping("/login")
    public ApiResponse login(@RequestBody UserModel userModel){
        return userService.login(userModel);
    }
}
