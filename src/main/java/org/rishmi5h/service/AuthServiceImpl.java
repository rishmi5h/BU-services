package org.rishmi5h.service;

import org.rishmi5h.dto.auth.LoginDto;
import org.rishmi5h.dto.auth.SignInDto;
import org.rishmi5h.model.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImpl implements AuthService{

    public List<Users> getUser() {
        return null;
    }

    public String loginUser(LoginDto loginDto) {

        return null;
    }

    public String SignupUser(SignInDto signInDto) {
        return null;
    }
}
