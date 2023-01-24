package org.lessons.java;

import java.util.Arrays;

public class BonusVariables {

	static Integer[] range = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	static Integer[] square_range = {};

	public static void main(String[] args) {
		for (Integer n : range) {
			square_range = Arrays.copyOf(square_range, square_range.length + 1);
			square_range[square_range.length - 1] = n*n;
		};
		for (int i = 0; i < square_range.length; i++)
		System.out.println(square_range[i]);
	}
}
