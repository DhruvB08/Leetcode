import java.util.*;

public class SearchForRange {
	public static void main(String[] args){
		int[] nums = {5, 7, 7, 8, 8, 10};
		int target = 8;
		
		System.out.println(Arrays.toString(searchRange(nums, target)));
	}
	
	public static int[] searchRange(int[] A, int target){
		int start = search(A, target);
		if(start==A.length || A[start]!=target){
			return new int[]{-1, 1};
		}
		return new int[] {start, search(A, target+1) -1};
	}
	
	private static int search(int[] A, int target){
		int lo=0, hi=A.length;
		while(lo<hi){
			int mid = (lo>>1) + (hi>>1);
			if(A[mid] < target){
				lo = mid+1;
			} else{
				hi = mid;
			}
		}
		
		return lo;
	}
}
