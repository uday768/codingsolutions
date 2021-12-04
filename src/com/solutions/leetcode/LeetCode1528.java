package com.solutions.leetcode;

public class LeetCode1528 {
	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		System.out.println(restoreString1(s, indices));
		System.out.println(restoreString2(s, indices));
	}

	public static String restoreString1(String s, int[] indices) {
		char[] charArray = s.toCharArray();
		char[] newStringArray = new char[indices.length];
		for (int i = 0; i < indices.length; i++) {
			newStringArray[indices[i]] = charArray[i];
		}
		return new String(newStringArray);
	}

	public static String restoreString2(String s, int[] indices) {
		StringBuilder res = new StringBuilder(s);
		int l = s.length();
		for (int i = 0; i < l; i++) {
			res.setCharAt(indices[i], s.charAt(i));
		}
		return res.toString();
	}
}