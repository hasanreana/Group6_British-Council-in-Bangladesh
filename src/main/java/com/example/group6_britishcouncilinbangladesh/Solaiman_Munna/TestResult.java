package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

public class TestResult {
    private String passportNo;
    private String result;

    public TestResult(String passportNo, String result) {
        this.passportNo = passportNo;
        this.result = result;
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "passportNo='" + passportNo + '\'' +
                ", result='" + result + '\'' +
                '}';
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
