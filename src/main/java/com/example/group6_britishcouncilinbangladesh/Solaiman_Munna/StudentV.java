package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

public class StudentV {
    private String name;
    private String passportNumber;
    private String status;

    public StudentV(String name, String passportNumber, String status) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StudentV{" +
                "name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
