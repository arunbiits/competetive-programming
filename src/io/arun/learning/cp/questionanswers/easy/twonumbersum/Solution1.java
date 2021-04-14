package io.arun.learning.cp.questionanswers.easy.twonumbersum;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Arun Kumar N
 * 
 * Time Complexity - O(n^2)
 * Space Complexity - O(1)
 *
 */
public class Solution1 {
	

	//logic is written here in this method...
	public static int[] twoNumberSum(int n, int[] arr, int targetSum) {
		for(int i=0;i<arr.length;i++) {
			int num1 = arr[i];
			for(int j=i+1;j<arr.length-1;j++) {
				int num2 = arr[j];
				if(num1+num2==targetSum) {
					return new int[] {num1, num2};
				}
			}
		}
		return new int[0];
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int targetSum = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.stream(twoNumberSum(n,arr,targetSum)).forEach(v -> System.out.print(v+" "));
		sc.close();
	}

}
