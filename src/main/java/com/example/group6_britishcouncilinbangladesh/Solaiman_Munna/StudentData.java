package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import java.util.ArrayList;

public class StudentData {
    public static final ArrayList<StudentDetails> studentList = new ArrayList<>();

    public static void addStudent(StudentDetails student) {
        studentList.add(student);
    }

    public static ArrayList<StudentDetails> getAllStudents() {
        return studentList;
    }
}
