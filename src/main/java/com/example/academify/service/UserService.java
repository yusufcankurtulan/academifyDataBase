package com.example.academify.service;

import com.example.academify.model.UserProfile;
import com.example.academify.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    public boolean resetUserPassword(String email, String resetCode, String newPassword) {
        Optional<UserProfile> user = userProfileRepository.findByEmail(email);

        if (user.isPresent() && user.get().getResetCode().equals(resetCode)) {
            // Şifre sıfırlama kodu doğruysa şifreyi güncelle
            user.get().setSifre(newPassword);
            user.get().setResetCode(null);
            userProfileRepository.save(user.get());
            return true;
        } else {
            return false;
        }
    }
}




