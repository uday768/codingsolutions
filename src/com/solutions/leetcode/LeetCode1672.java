package com.solutions.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LeetCode1672 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 }, { 10, 20, 30, 40 } };
		System.out.println(maximumWealth(accounts));
		System.out.println(maximumWealthUsingStreams(accounts));
	}

	public static int maximumWealth(int[][] accounts) {
		int maxWealth = 0;
		for (int i = 0; i < accounts.length; i++) {
			int tempWealth = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				tempWealth += accounts[i][j];
			}
			if (tempWealth > maxWealth) {
				maxWealth = tempWealth;
			}
		}

		return maxWealth;
	}
	
	
	public static int maximumWealthUsingStreams(int[][] accounts) {
		
		int sum = (int)Arrays.stream(accounts).map(a -> IntStream.of(a).sum()).max(Integer::compare).get();
		return sum;
	}
}
