package practice;

import java.util.Arrays;

public class findPairSum {

	public static void main(String[] args) {
		int a[] = {1,4,3,2,7,9,0}; //after sort  = {0,1,2,3,5,7,9}
		findPairSum(a , 1);
		findPairSum(a , 10);
		findPairSum(a , 18);
		findPairSum(a , 7);
		int b[] = {};
		findPairSum(b , 8);
	}
	
	public static boolean findPairSum(int a[] , int sum) {
		if(a==null || a.length <2)
			return false ;
		
		int start = 0;
		int end = a.length -1 ;
		
		Arrays.sort(a);
		
		while(start < end) {
			if(a[start] + a[end] == sum) {
				System.out.println("The pair is " + a[start] +" " + a[end]);
				return true;
			}
			if(a[start] + a[end] < sum) 
				start++;
			else
				end--;
		}
		System.out.println("sum " +sum+ " not found ");
		return false;
	}

}
