package com.example.academify.service;

import com.example.academify.model.UserProfile;
import com.example.academify.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean resetUserPassword(String email, String resetCode, String newPassword) {
        Optional<UserProfile> user = userProfileRepository.findByEmail(email);

        if (user.isPresent() && user.get().getResetCode().equals(resetCode)) {
            // Şifre sıfırlama kodu doğruysa şifreyi güncelle
            user.get().setSifre(passwordEncoder.encode(newPassword));
            user.get().setResetCode(null);
            userProfileRepository.save(user.get());
            return true;
        } else {
            return false;
        }
    }

    public UserProfile registerUser(UserProfile user) {
        user.setSifre(passwordEncoder.encode(user.getSifre()));
        return userProfileRepository.save(user);
    }

    public boolean authenticateUser(String email, String password) {
        Optional<UserProfile> user = userProfileRepository.findByEmail(email);
        return user.isPresent() && passwordEncoder.matches(password, user.get().getSifre());
    }

    public Optional<UserProfile> findByEmail(String email) {
        return userProfileRepository.findByEmail(email);
    }
}




