package com.tanya.lab6.ex6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise6 {

    public static List<String> votersList(Map<String, LocalDate> personMap) {
        List<String> voters = new ArrayList<>();

        for (Map.Entry<String, LocalDate> entry : personMap.entrySet()) {
            int age = Period.between(entry.getValue(), LocalDate.now()).getYears();

            if (age > 18) {
                voters.add(entry.getKey());
            }
        }

        return voters;
    }

    public static void main(String[] args) {
        Map<String, LocalDate> persons = new HashMap<>();

        persons.put("P101", LocalDate.of(2000, 5, 10));
        persons.put("P102", LocalDate.of(2010, 8, 15));
        persons.put("P103", LocalDate.of(1998, 3, 20));

        List<String> result = votersList(persons);

        System.out.println("Eligible Voters: " + result);
    }
}
