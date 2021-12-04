package com.solutions.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1313 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(decompressRLElist1(nums)));
		System.out.println(Arrays.toString(decompressRLElist2(nums)));
	}

	public static int[] decompressRLElist1(int[] nums) {
		List<Integer> ans = new ArrayList<>();

		for (int i = 0; i < nums.length; i += 2)
			for (int freq = 0; freq < nums[i]; ++freq)
				ans.add(nums[i + 1]);

		return ans.stream().mapToInt(i -> i).toArray();
	}

	public static int[] decompressRLElist2(int[] nums) {
		int arrSize = 0;
		int startIndex = 0;
		for (int i = 0; i < nums.length; i = i + 2) {
			arrSize = arrSize + nums[i];
		}
		int[] decompress = new int[arrSize];
		// we can also use system.arraycopy
		for (int k = 0; k < nums.length; k = k + 2) {
			for (int j = 0; j < nums[k]; j++) {
				decompress[startIndex++] = nums[k + 1];
			}
		}
		return decompress;
	}
}
