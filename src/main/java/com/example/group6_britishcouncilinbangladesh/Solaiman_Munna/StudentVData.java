package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import java.util.ArrayList;

public class StudentVData {

    private static ArrayList<StudentV> STUDENTS = new ArrayList<>();

    static {
        STUDENTS.add(new StudentV("Toriqul Islam","T1234I", "Unconfirmed"));
        STUDENTS.add(new StudentV("Asaduzzaman Asad","A1234A", "Verified"));
        STUDENTS.add(new StudentV("Asif Ahmed Nijhum","A1234N", "Unconfirmed"));
        STUDENTS.add(new StudentV("Maidul Islam","M1234I", "Verified"));
        STUDENTS.add(new StudentV("Samayra Ahmed","S1234A", "Unconfirmed"));
        STUDENTS.add(new StudentV("Tasnim Mohin","T1234M", "Verified"));
    }
    public static ArrayList<StudentV> getStudents() {
        return STUDENTS;
    }
    public static void updateStatus(String passportNumber, String newStatus) {
        for (StudentV s : STUDENTS) {
            if (s.getPassportNumber().equals(passportNumber)) {
                s.setStatus(newStatus);
                return;
            }
        }
    }
}
