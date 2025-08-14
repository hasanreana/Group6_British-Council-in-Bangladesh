package com.example.group6_britishcouncilinbangladesh.Reana;

import java.time.LocalDate;

public class Employee {
    private String name;
    private int Id;
    private int salary;
    private LocalDate date;

    public Employee(String name, int id, int salary, LocalDate date) {
        this.name = name;
        Id = id;
        this.salary = salary;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", salary=" + salary +
                ", date=" + date +
                '}';
    }
}
