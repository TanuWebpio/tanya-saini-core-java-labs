package com.tanya.lab6.ex3;
	import java.util.HashMap;
	import java.util.Map;

	public class NumberSquares {

	    public static Map<Integer, Integer> getSquares(int[] numbers) {

	        Map<Integer, Integer> squareMap = new HashMap<>();

	        for (int num : numbers) {
	            squareMap.put(num, num * num);
	        }

	        return squareMap;
	    }

	    public static void main(String[] args) {

	        int[] numbers = {2, 3, 4, 5};

	        Map<Integer, Integer> result = getSquares(numbers);

	        System.out.println(result);
	    }
	}

