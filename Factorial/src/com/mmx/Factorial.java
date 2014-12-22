package com.mmx;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args == null) {
			return;
		}
		for (String arg : args) {
			int input = Integer.parseInt(arg);
			double result = factorial(input);
			System.out.println(result);
		}

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
