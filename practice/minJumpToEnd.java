package practice;

public class minJumpToEnd {

	public static void main(String[] args) {
		int a[] = {1,1,0,0,1};
		int arr[] = new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int ans =minJump(a);
		System.out.println(ans);
	}
	public static int minJump(int a[]) {
		if(a.length < 2)
			return 0;
		
		if(a[0] == 0 ) {
			return -1;
		}
		
		int maxDistance = a[0];
		int jumps = 1; 
		int steps = a[0];
		
		for(int i = 1 ; i<a.length ; i++) {
			
			if(i == a.length-1)
				return jumps;
			
			maxDistance = Math.max(maxDistance, i+ a[i]);
			steps--;
			
			if(steps ==0) // out of steps
			{
				jumps++; // need another jump
				
				if(i >= maxDistance) //we reach the max -> no more steps to do
					return -1;
				
				steps = maxDistance - i;
			}
		}
		return -1 ; 
	}

}
