package com.example.academify.model;


import jakarta.persistence.*;

@Entity
@Table(name = "survey_question")
public class SurveyQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "question_text")
    private String questionText;

    protected SurveyQuestion() {
    }
    public SurveyQuestion(Long id, String questionText) {
        this.id = id;
        this.questionText = questionText;
    }

    public String getQuestionText() {
        return questionText;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

}