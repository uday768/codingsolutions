package com.solutions.leetcode;

import java.util.Scanner;

public class Leetcode2011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		String[] operations = new String[length];
		for(int i = 0;i<length;i++) {
			operations[i] = scanner.next();
		}
		scanner.close();
		System.out.println(finalValueAfterOperations(operations));
		

	}

	public static int finalValueAfterOperations(String[] operations) {
		int ans = 0;
		for (String operation : operations) {
			ans += operation.charAt(1) == '+' ? 1 : -1;
		}
		return ans;
	}

}
