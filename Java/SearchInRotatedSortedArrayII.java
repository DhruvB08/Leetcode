import java.util.*;

public class SearchInRotatedSortedArrayII{
	public static void main(String[] args){
		/*
		Suppose an array sorted in ascending order is rotated at 
		some pivot unknown to you beforehand.
		(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

		Write a function to determine if a given target is in the array.
		The array may contain duplicates.
		*/
	}

	public boolean search(int[] nums, int target){
		int start = 0, end = nums.length - 1, mid = -1;
		while(start <= end){
			mid = start + (end - start)/2;;
			if(nums[mid] == target){
				return true;
			}

			//right side is sorted, or left side is unsorted
			if(nums[mid] < nums[end] || nums[mid] < nums[start]){
				if(target > nums[mid] && target <= nums[end]){
					start = mid + 1;
				} else{
					end = mid - 1;
				}
			}

			//left side is sorted, or right side is unsorted
			else if(nums[mid] > nums[start] || nums[mid] > nums[end]){
				if(target < nums[mid] && target >= nums[start]){
					end = mid - 1;
				} else{
					start = mid + 1;
				}
			}

			//there are duplicates among nums[mid], nums[start], and nums[end]
			else{
				end--;
			}
		}

		return false;
	}
}