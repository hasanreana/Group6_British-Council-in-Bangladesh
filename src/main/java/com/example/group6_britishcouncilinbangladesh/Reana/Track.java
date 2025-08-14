package com.example.group6_britishcouncilinbangladesh.Reana;

import java.time.LocalDate;

public class Track {
    private LocalDate date;
    private String expenseAmount;
    private String category;

    public Track(LocalDate date, String expenseAmount, String category) {
        this.date = date;
        this.expenseAmount = expenseAmount;
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(String expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Track{" +
                "date=" + date +
                ", expenseAmount=" + expenseAmount +
                ", category='" + category + '\'' +
                '}';
    }
}
