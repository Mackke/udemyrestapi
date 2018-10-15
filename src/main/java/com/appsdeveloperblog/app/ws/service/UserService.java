package com.appsdeveloperblog.app.ws.service;

import com.appsdeveloperblog.app.ws.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
    UserDto createUser(UserDto user);
}