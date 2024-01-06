package com.qa.javaprograms;

public class FormatSpecifiers {

	public static void main(String[] args) {
		// using more than one format specifiers
		// in a format string
		int n1 = 46, n2 = -46;
		String result;

		// padding number with spaces
		// the length of the string will be 5
		result = String.format("|%5d|", n1); // | 46|

		System.out.println(result);

		// padding number with numbers 0
		// the length of the string will be 5
		result = String.format("|%05d|", n1); // |00046|

		System.out.println(result);

		// using signs before numbers
		result = String.format("%+d", n1); // +46

		System.out.println(result);

		result = String.format("%+d", n2); // -46

		System.out.println(result);

		// enclose negative number within parenthesis
		// and removing the sign
		result = String.format("%(d", n2); // (46)

		System.out.println(result);
	}
}