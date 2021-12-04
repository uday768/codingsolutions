package com.solutions.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode1365 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(array)));
		scanner.close();
	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] result = new int[nums.length];
		for(int i =0;i<nums.length;i++) {
			int count =0;
			for(int j = 0;j<nums.length;j++) {
				if(i!=j && nums[j]<nums[i]) {
					count++;
				}
			}
			result[i]=count;
		}
		return result;
	}

}
