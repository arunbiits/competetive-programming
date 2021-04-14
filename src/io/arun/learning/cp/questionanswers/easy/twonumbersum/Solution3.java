package io.arun.learning.cp.questionanswers.easy.twonumbersum;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Arun Kumar N
 * 
 * Time Complexity - O(nlog(n))
 * Space Complexity - O(1)
 *
 */
public class Solution3 {

	//logic is written here in this method...
	public static int[] twoNumberSum(int n, int[] arr, int targetSum) {
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length-1;
		while(low<high) {
			int sum = arr[low]+arr[high];
			if(sum==targetSum) {
				return new int[] {arr[low],arr[high]};
			}else if(sum>targetSum) {
				high--;
			}else {
				low++;
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

