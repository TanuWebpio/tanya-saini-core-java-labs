package com.tanya.lab3.ex3;

public class AlterString {
	public static String alterString(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is a consonant
            if (Character.isLetter(ch) &&
                "AEIOUaeiou".indexOf(ch) == -1) {
                ch = (char) (ch + 1);
            }

            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "JAVA";
        System.out.println("Output: " + alterString(input));
    }

}
