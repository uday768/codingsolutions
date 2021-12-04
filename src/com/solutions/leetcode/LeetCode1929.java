package com.solutions.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] array = new int[length];
		for(int i = 0; i<length;i++) {
			array[i]= scanner.nextInt();
		}
		scanner.close();
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(getConcatenation(array)));
		System.arraycopy(scanner, length, array, length, length);

	}
	
	
	public static int[] getConcatenation(int[] nums) {
		int length = nums.length;
		int[] concate = new int[length*2];
		for(int i = 0;i<length;++i) {
			concate[i] = nums[i];
			concate[i+length] = nums[i];
		}
		return concate;
		
	}

}
