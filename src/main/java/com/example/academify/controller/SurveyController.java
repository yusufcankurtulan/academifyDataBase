package com.example.academify.controller;

import com.example.academify.service.SurveyService;
import com.example.academify.service.dto.SurveyResponseDto;
import com.example.academify.service.dto.SurveyResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/surveys")
public class SurveyController {
    @Autowired
    private SurveyService surveyService;

    @PostMapping("/submit")
    public ResponseEntity<?> submitResponse(@RequestBody SurveyResponseDto responseDto) {
        // Logic to handle response submission
        return ResponseEntity.ok().build();
    }

    @GetMapping("/results/{teacherId}")
    public ResponseEntity<List<SurveyResultDto>> getSurveyResults(@PathVariable Long teacherId) {
        // Logic to fetch and calculate results
        return ResponseEntity.ok(surveyService.calculateResults(teacherId));
    }
}
