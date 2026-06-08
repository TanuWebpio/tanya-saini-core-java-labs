package com.tanya.lab6.ex7;

import java.util.Arrays;

public class Exercise7 {

    public static int[] getSorted(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            String reversed = new StringBuilder(String.valueOf(arr[i]))
                    .reverse()
                    .toString();

            arr[i] = Integer.parseInt(reversed);
        }

        Arrays.sort(arr);

        return arr;
    }

    public static void main(String[] args) {

        int[] numbers = {12, 45, 98, 23};

        int[] result = getSorted(numbers);

        System.out.println(Arrays.toString(result));
    }
}
