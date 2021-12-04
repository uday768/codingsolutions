package com.solutions.leetcode;

import java.util.Arrays;

public class LeetCode1920 {
	public static void main(String[] args) {
		int[] nums = { 0, 2, 1, 5, 3, 4 };
		System.out.println(Arrays.toString(buildArray(nums)));
	}
	
	//O(n) time complexity O(n) space complexity
	public static int[] buildArray(int[] nums) {
		int[] array = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			array[i] = nums[nums[i]];
		}
		return array;
	}
}