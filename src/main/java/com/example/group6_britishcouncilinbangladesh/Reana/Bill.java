package com.example.group6_britishcouncilinbangladesh.Reana;

import java.time.LocalDate;

public class Bill {
    private int trainnerId;
    private String name;
    private int salary;
    private int vanueId;// 0 = Unlimited
    private int payment;
    private LocalDate date;

    public Bill(int trainnerId, String name, int salary, int vanueId, int payment, LocalDate date) {
        this.trainnerId = trainnerId;
        this.name = name;
        this.salary = salary;
        this.vanueId = vanueId;
        this.payment = payment;
        this.date = date;
    }

    public int getTrainnerId() {
        return trainnerId;
    }

    public void setTrainnerId(int trainnerId) {
        this.trainnerId = trainnerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getVanueId() {
        return vanueId;
    }

    public void setVanueId(int vanueId) {
        this.vanueId = vanueId;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "trainnerId=" + trainnerId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", vanueId=" + vanueId +
                ", payment=" + payment +
                ", date=" + date +
                '}';
    }
}
