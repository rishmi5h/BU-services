package org.rishmi5h.controller;

import org.rishmi5h.dto.auth.LoginDto;
import org.rishmi5h.dto.auth.SignInDto;
import org.rishmi5h.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {

    private AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping("/users/login")
    public ResponseEntity<String> login(@RequestBody LoginDto loginDto){
        String token = authService.loginUser(loginDto);
        return  null;
    }


    @PostMapping("/users/signup")
    public ResponseEntity<String> signup(@RequestBody SignInDto signInDto){
        String token = authService.SignupUser(signInDto);
        return  null;
    }

}
