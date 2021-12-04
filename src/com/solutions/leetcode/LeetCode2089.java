package com.solutions.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// need to analyse another solution too
public class LeetCode2089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] array = new int[length];
		for(int i = 0; i<length;i++) {
			array[i]= scanner.nextInt();
		}
		int num = scanner.nextInt();
		scanner.close();
		List<Integer> list = new ArrayList<Integer>();
		
		Arrays.sort(array);
		for(int i = 0;i <array.length;i++) {
			if(array[i] == num) {
				list.add(i);
			}
		}
		System.out.println(list);
		
	}

}
