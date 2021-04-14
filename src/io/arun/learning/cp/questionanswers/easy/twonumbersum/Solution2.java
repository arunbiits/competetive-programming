package io.arun.learning.cp.questionanswers.easy.twonumbersum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * @author Arun Kumar N
 * 
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 *
 */
public class Solution2 {

	//logic is written here in this method...
	public static int[] twoNumberSum(int n, int[] arr, int targetSum) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i:arr) {
			if(set.contains(targetSum-i)) {
				return new int[] {targetSum-i, i};
			}
			set.add(i);
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

