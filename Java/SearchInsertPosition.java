//import java.util.*;

public class SearchInsertPosition {
	public static void main(String[] args){
		/*
		 Given a sorted array and a target value, 
		 return the index if the target is found. 
		 If not, return the index where it would be if it were inserted in order.
		 You may assume no duplicates in the array.
		 */
	}
	
	public int search(int[] A, int target){
		int lo=0, hi=A.length-1;
		while(lo<=hi){
			int mid = (lo>>1) + (hi>>1);
			if(A[mid] == target){
				return mid;
			} else if(A[mid] > target){
				hi = mid-1;
			} else{
				lo = mid+1;
			}
		}
		return lo;
	}
}
