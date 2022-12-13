package com.example.silkroadsystem.service;

import com.example.silkroadsystem.component.JwtProvider;
import com.example.silkroadsystem.entity.User;
import com.example.silkroadsystem.mapper.UserMapper;
import com.example.silkroadsystem.model.ApiResponse;
import com.example.silkroadsystem.model.UserModel;
import com.example.silkroadsystem.repository.UserRepository;
import com.example.silkroadsystem.service.template.GenericService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService extends GenericService<User, UserModel, UserRepository, UserMapper> {
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtProvider jwtProvider;

    public UserService(UserRepository repository, UserMapper mapper, PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager, JwtProvider jwtProvider) {
        super(repository, mapper);
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
        this.jwtProvider = jwtProvider;
    }

    public UserModel register(UserModel userModel) {
        userModel.setPassword(passwordEncoder.encode(userModel.getPassword()));
        return save(userModel);
    }

    public ApiResponse login(UserModel userModel) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                userModel.getUsername(),
                userModel.getPassword()
        ));

        String token = jwtProvider.generateToken(userModel.getUsername());
        return new ApiResponse("Login success",true,token);
    }
}
