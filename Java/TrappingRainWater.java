
public class TrappingRainWater {
	public static void main(String[] args){
		/*
		Given n non-negative integers
		representing an elevation map 
		where the width of each bar is 1, 
		compute how much water it is able to trap after raining.

		For example, 
		Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
		*/

	}
	
	public int trap(int[] A){
		int a = 0;
		int b = A.length;
		int max = 0;
		int leftMax = 0;
		int rightMax = 0;
		
		while(a<=b){
			leftMax = Math.max(leftMax, A[a]);
			rightMax = Math.max(rightMax, A[b]);
			
			if(rightMax > leftMax){
				max += (rightMax - A[b]);
				b--;
			} else{
				max += (leftMax - A[a]);
				a++;
			}
		}
		
		return max;
	}
}
