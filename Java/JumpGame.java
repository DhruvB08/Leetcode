import java.util.*;

public class JumpGame{
	public static void main(String[] args){
		int[] nums1 = {2,3,1,1,4};
		int[] nums2 = {3,2,1,0,4};
		JumpGame jg = new JumpGame();

		System.out.println(Arrays.toString(nums1) + "\t" + jg.canJump(nums1));
		System.out.println(Arrays.toString(nums2) + "\t" + jg.canJump(nums2));
	}

	public boolean canJump(int[] nums){
		int n = nums.length;
		int last = n - 1;
		for(int i=n-2; i>=0; i--){
			if(i+nums[i] >= last){
				last = i;
			}
		}

		return last<=0;
	}
}