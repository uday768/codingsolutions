package com.solutions.leetcode;

import java.util.Arrays;

public class LeetCode1720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] encoded = { 1, 2, 3 };
		int first = 1;
		System.out.println(Arrays.toString(decode(encoded, first)));

	}

	public static int[] decode(int[] encoded, int first) {
		int decodedArrayLength = encoded.length + 1;
		int[] decodedArray = new int[decodedArrayLength];
		decodedArray[0] = first;
		for (int i = 1; i < decodedArrayLength; i++) {
			decodedArray[i] = decodedArray[i - 1] ^ encoded[i - 1];
		}
		return decodedArray;
	}
}