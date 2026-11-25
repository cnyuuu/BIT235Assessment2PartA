// Name: Yu Leiye | Student ID: S1580814
package com.bit235.yuleiye.wikiapp.service;

import com.bit235.yuleiye.wikiapp.model.User;
import com.bit235.yuleiye.wikiapp.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean authenticate(String username, String password) {
        if (username == null || password == null) return false;
        User user = userRepository.findByUsername(username.trim());
        return user != null && user.getPassword().equals(password);
    }
}