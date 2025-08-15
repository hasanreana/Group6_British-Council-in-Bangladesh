package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

public class StudentDetails {
    private String name;
    private String passportNumber;
    private String session;
    private String venue;

    public StudentDetails(String name, String passportNumber, String session, String venue) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.session = session;
        this.venue = venue;
    }

    public String getName() {
        return name;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
    public String getSession() {
        return session;
    }
    public String getVenue() {
        return venue;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
    public void setSession(String session) {
        this.session = session;
    }
    public void setVenue(String venue) {
        this.venue = venue;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", session='" + session + '\'' +
                ", venue='" + venue + '\'' +
                '}';
    }
}
