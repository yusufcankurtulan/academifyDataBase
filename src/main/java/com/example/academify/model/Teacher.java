package com.example.academify.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TEACHER_NAME")
public class Teacher {
    @Id
    private Long id;
    @Column(name = "TEACHER_NAME")
    private String instructorName;
    @Column(name = "INFO")
    private String instructorInfo;

    @Column(name = "EMAIL")
    private String instructorEmail;

    @Column(name = "ABOUT")
    private String lessonDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorInfo() {
        return instructorInfo;
    }

    public void setInstructorInfo(String instructorInfo) {
        this.instructorInfo = instructorInfo;
    }

    public String getInstructorEmail() {
        return instructorEmail;
    }

    public void setInstructorEmail(String instructorEmail) {
        this.instructorEmail = instructorEmail;
    }

    public String getLessonDetails() {
        return lessonDetails;
    }

    public void setLessonDetails(String lessonDetails) {
        this.lessonDetails = lessonDetails;
    }
}


