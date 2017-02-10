import java.util.*;

public class ContainerWithMostWater {
	public static Scanner reader;
	
	public static void main(String[] args){
		reader = new Scanner(System.in);
		
		System.out.println("How many different heights?");
		int num = reader.nextInt();
		
		System.out.println("Enter the heights");
		int[] heights = new int[num];
		for(int i=0; i<num; i++){
			heights[i] = reader.nextInt();
		}
		
		System.out.println(solution(heights));
	}
	
	private static int solution(int[] h){
		int l=0, r=h.length-1;
		int maxArea=0;
		
		while(l<r){
			maxArea = Math.max(maxArea, Math.min(h[l], h[r]) * (r-l));
			
			if(h[r]>h[l]){
				l++;
			} else{
				r--;
			}
		}
		
		return maxArea;
	}
}

/*
time: O(n)
space: O(n)
*/
