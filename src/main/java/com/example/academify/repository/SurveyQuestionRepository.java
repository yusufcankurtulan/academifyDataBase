package com.example.academify.repository;

import com.example.academify.model.SurveyQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyQuestionRepository extends JpaRepository<SurveyQuestion, Long> {
    // Gerekli metodlar burada tanımlanabilir
}
