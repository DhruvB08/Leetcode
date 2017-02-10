//import java.util.*;

public class Search {
	public static void main(String[] args){
		//rotated sorted array
		//1 3 4 5 6 7 8 9
		//5 6 7 8 9 1 3 4
	}
	
	public static int search(int[] A, int target){
		int lo = 0;
		int hi = A.length - 1;
		
		while(lo<hi){
			int mid = lo/2 + hi/2;
			if(A[mid] == target){
				return mid;
			}
			
			if(A[lo] <= A[mid]){
				if(target>=A[lo] && target<A[mid]){
					hi = mid-1;
				} else{
					lo = mid+1;
				}
			} else{
				if(target>A[mid] && target<=A[hi]){
					lo = mid+1;
				} else{
					hi = mid-1;
				}
			}
		}
		
		return A[lo]==target ? lo:-1;
	}
}
