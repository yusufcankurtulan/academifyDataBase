package com.example.academify.service.dto;

public class SurveyResultDto {
    private String questionText;
    private float averageResponse;

    public SurveyResultDto(String questionText, float averageResponse) {
        this.questionText = questionText;
        this.averageResponse = averageResponse;
    }
}
