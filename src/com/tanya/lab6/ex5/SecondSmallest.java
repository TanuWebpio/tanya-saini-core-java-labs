package com.tanya.lab6.ex5;

import java.util.ArrayList;
import java.util.Collections;

public class SecondSmallest {

    public static int getSecondSmallest(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        Collections.sort(list);

        return list.get(1);
    }

    public static void main(String[] args) {

        int[] arr = {7, 3, 9, 1, 5};

        int result = getSecondSmallest(arr);

        System.out.println("Second Smallest Element: " + result);
    }
}
