package com.example.group6_britishcouncilinbangladesh.Solaiman_Munna;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Results {
    private static final String FILE_PATH = "results.bin";
    private static final ArrayList<TestResult> data = new ArrayList<>();

    public static void addOrUpdate(String passportNo, String score) {
        for (TestResult r : data) {
            if (r.getPassportNo().equals(passportNo)) {
                r.setResult(score);
                saveToFile();
                return;
            }
        }
        data.add(new TestResult(passportNo, score));
        saveToFile();
    }

    public static String getScore(String passportNo) {
        for (TestResult r : data) {
            if (r.getPassportNo().equals(passportNo)) {
                return r.getResult();
            }
        }
        return null;
    }

    public static List<TestResult> loadAll() {
        loadFromFile();
        return new ArrayList<>(data);
    }

    public static void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (TestResult r : data) {
                bw.write(r.getPassportNo() + "," + r.getResult());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadFromFile() {
        data.clear();
        File file = new File(FILE_PATH);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",", 2);
                if (parts.length == 2) {
                    data.add(new TestResult(parts[0], parts[1]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
