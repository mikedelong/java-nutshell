package com.mmx;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input = Integer.parseInt(args[0]);
		double result = factorial(input);
		System.out.println(result);

	}
	
	public static double factorial(int arg) {
		if (arg < 0) {
			return (double) 0;
		}
		double result = 1;
		while (arg > 1) {
			result = result * arg;
			arg--;
		}
		return result;
	}

}
