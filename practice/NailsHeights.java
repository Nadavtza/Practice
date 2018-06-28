package practice;

import java.util.Arrays;

public class NailsHeights {
	public static void main(String[] args) {
		int a[] = {1,1,0,0,1};
		int arr[] = new int[] {1,1 , 3, 3 ,3 , 4 ,5,5,5,5};
		int ans =nailsHeights(arr ,2);
		System.out.println(ans);
		
		int ar[] = new int[] {1,1};
		int ans2 =nailsHeights(ar ,5);
		System.out.println(ans2);
	}
	
	
	public static int nailsHeights(int[] a , int k) {
		int max = 0;
		int counter = 0;
		if(a.length <1)
			return 0;
		
		int value = a[0];
		Arrays.sort(a);
	
		for(int i = 0 ; i< a.length -k ; i++) {
			if(value == a[i])
				counter++;
			else {
				counter = 1; 
				value = a[i];
			}
			max = Math.max(max, counter);
		}
		
		return Math.min(max+k, a.length);
	}
}
