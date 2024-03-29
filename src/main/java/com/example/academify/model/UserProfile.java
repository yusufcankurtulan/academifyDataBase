package com.example.academify.model;


import jakarta.persistence.*;

@Entity
@Table(name = "user_profile2")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ad")
    private String ad;

    @Column(name = "soyad")
    private String soyad;

    @Column(name = "email")
    private String email;

    @Column(name = "sifre")
    private String sifre;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "department")
    private String department;

    @Column(name = "reset_code")
    private String resetCode;

    // Parametresiz constructor gereklidir.
    public UserProfile() {
    }

    // Constructor without id as it's generated by the database.
    public UserProfile(String ad, String soyad, String email, String sifre, String faculty, String department) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.sifre = sifre;
        this.faculty = faculty;
        this.department = department;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getResetCode() {
        return resetCode;
    }

    public void setResetCode(String resetCode) {
        this.resetCode = resetCode;
    }
}












