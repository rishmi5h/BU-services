package org.rishmi5h.service;

import org.antlr.v4.runtime.misc.NotNull;
import org.rishmi5h.dto.auth.LoginDto;
import org.rishmi5h.dto.auth.SignInDto;
import org.rishmi5h.model.Product;
import org.rishmi5h.model.Users;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
public interface AuthService {

     List<Users> getUser();

     String loginUser(LoginDto loginDto);

     String SignupUser(SignInDto signInDto);
}
