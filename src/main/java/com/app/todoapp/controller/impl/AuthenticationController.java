package com.app.todoapp.controller.impl;

import com.app.todoapp.controller.framework.IAuthenticationController;
import com.app.todoapp.models.request.LoginRequestBody;
import com.app.todoapp.models.request.RegisterRequestBody;
import com.app.todoapp.security.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController implements IAuthenticationController {

    @Autowired
    private AuthenticationService service;

    @Override
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequestBody registerRequestBody) {
        return ResponseEntity.ok(service.register(registerRequestBody));
    }

    @Override
    @PostMapping("/login")
    public ResponseEntity<?> authenticate(@RequestBody LoginRequestBody loginRequestBody) {
        return ResponseEntity.ok(service.authenticate(loginRequestBody));
    }


}
