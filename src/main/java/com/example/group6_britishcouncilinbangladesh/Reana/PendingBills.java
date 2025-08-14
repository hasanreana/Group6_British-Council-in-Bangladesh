package com.example.group6_britishcouncilinbangladesh.Reana;

import java.io.Serializable;

public class PendingBills implements Serializable {
    private int id;
    private int payment;
    private String month;
    private int bill;

    public PendingBills() {
    }

    public PendingBills(int id, int payment, String month, int bill) {
        this.id = id;
        this.payment = payment;
        this.month = month;
        this.bill = bill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "PendingBills{" +
                "id=" + id +
                ", payment=" + payment +
                ", month='" + month + '\'' +
                ", bill=" + bill +
                '}';
    }
}
