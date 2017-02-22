import java.util.*;

public class MaximumSubarray{
	public static void main(String[] args){
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		MaximumSubarray msa = new MaximumSubarray();

		System.out.println(Arrays.toString(nums));
		System.out.println(msa.maxSubArray(nums)+ " is the highest possible sum.");
	}

	public int maxSubArray(int[] nums){
		int currMax = nums[0];
		int prevMax = nums[0];

		for(int i=1; i<nums.length; i++){
			prevMax = Math.max(prevMax + nums[i], nums[i]);
			currMax = Math.max(prevMax, currMax);
		}

		return currMax;
	}
}