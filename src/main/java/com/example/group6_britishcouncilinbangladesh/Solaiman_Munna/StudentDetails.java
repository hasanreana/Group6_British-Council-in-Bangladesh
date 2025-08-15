package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

public class StudentDetails {
    private String name;
    private String passportNumber;
    private String paymentStatus;
    private String score;
    private String identityVerified;

    public StudentDetails(String score, String name, String passportNumber, String paymentStatus, String identityVerified) {
        this.score = score;
        this.name = name;
        this.passportNumber = passportNumber;
        this.paymentStatus = paymentStatus;
        this.identityVerified = identityVerified;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getIdentityVerified() {
        return identityVerified;
    }

    public void setIdentityVerified(String identityVerified) {
        this.identityVerified = identityVerified;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", score='" + score + '\'' +
                ", identityVerified='" + identityVerified + '\'' +
                '}';
    }
}
