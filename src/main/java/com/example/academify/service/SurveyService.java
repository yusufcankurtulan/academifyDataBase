package com.example.academify.service;


import com.example.academify.model.SurveyQuestion;
import com.example.academify.model.Teacher;
import com.example.academify.model.TeacherResponse;
import com.example.academify.repository.SurveyQuestionRepository;
import com.example.academify.repository.TeacherRepository;
import com.example.academify.repository.TeacherResponseRepository;
import com.example.academify.service.dto.SurveyResponseDto;
import com.example.academify.service.dto.SurveyResultDto;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SurveyService {
    @Autowired
    private TeacherResponseRepository responseRepository;

    @Autowired
    private SurveyQuestionRepository questionRepository;

    @Autowired
    private TeacherRepository teacherRepository;


    public void submitResponse(SurveyResponseDto responseDto) {
        TeacherResponse response = new TeacherResponse();

        // Fetching the full Teacher and SurveyQuestion objects from the database
        Teacher teacher = teacherRepository.findById(responseDto.getTeacherId())
                .orElseThrow(() -> new EntityNotFoundException("Teacher not found"));
        SurveyQuestion question = questionRepository.findById(responseDto.getQuestionId())
                .orElseThrow(() -> new EntityNotFoundException("Question not found"));

        response.setTeacher(teacher);
        response.setQuestion(question);
        response.setResponse(responseDto.getResponse());

        responseRepository.save(response);
    }

    public List<SurveyResultDto> calculateResults(Long teacherId) {
        List<TeacherResponse> responses = responseRepository.findByTeacherId(teacherId);
        return responses.stream()
                .collect(Collectors.groupingBy(
                        TeacherResponse::getQuestion,
                        Collectors.averagingDouble(r -> r.getResponse() ? 1.0 : 0.0)
                ))
                .entrySet().stream()
                .map(entry -> new SurveyResultDto(
                        entry.getKey().getQuestionText(),
                        entry.getValue().floatValue()
                ))
                .collect(Collectors.toList());
    }
}
