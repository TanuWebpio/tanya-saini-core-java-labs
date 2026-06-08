package com.tanya.lab6.ex4;

import java.util.HashMap;
import java.util.Map;

public class MedalAward {

    public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> marksMap) {

        HashMap<Integer, String> medalMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : marksMap.entrySet()) {

            int regNo = entry.getKey();
            int marks = entry.getValue();

            if (marks >= 90) {
                medalMap.put(regNo, "Gold");
            } else if (marks >= 80) {
                medalMap.put(regNo, "Silver");
            } else if (marks >= 70) {
                medalMap.put(regNo, "Bronze");
            }
        }

        return medalMap;
    }

    public static void main(String[] args) {

        HashMap<Integer, Integer> studentMarks = new HashMap<>();

        studentMarks.put(1001, 95);
        studentMarks.put(1002, 85);
        studentMarks.put(1003, 75);
        studentMarks.put(1004, 65);

        HashMap<Integer, String> result = getStudents(studentMarks);

        System.out.println(result);
    }
}
