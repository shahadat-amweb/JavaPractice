package com.qa.javaprograms;

public class PrimeNum {
	public static void main(String[] args) {
		int num = 10;
		int flag = 0, m;
		m = num / 2;
		if (num == 1 || num == 0) {
			System.out.println("Not prime");
			flag = 1;
		} else {
			for (int i = 2; i <= m; i++) {
				if ((num % i == 0)) {
					System.out.println("Not prime");
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0) {
			System.out.println("Prime");
		}
	}
}