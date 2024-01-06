package com.qa.javaprograms;

public class StringFormatSpecifier {
	public static void main(String[] args) {
// 		1.20 -> "001.20%" // 1.21
//		11.20-> "011.20%"

//		% - Indicates that it's a formatted string.
//		0 - Pads with leading zeros.
//		6 - Total width of the output, including digits, decimal point, and percentage sign.
//		.2 - Specifies two decimal places.
//		f - Indicates it's a floating-point number.
//		%% - Adds a literal percentage sign.

		double number = 11.20;

		// Format the number with leading zeros and a percentage sign
		String formattedNumber = String.format("%06.2f%%", number);

		System.out.println(formattedNumber);
	}


}
