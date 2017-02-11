import java.util.Arrays;
import java.util.*;

public class TwoSum{
	public static void main(String[] args){
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		//return [0, 1]
		//indices of the two numbers that add up to target

		System.out.println(Arrays.toString(solution(nums, target)));
	}

	public static int[] solution(int[] nums, int target){
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

		for(int i=0; i<nums.length; i++){
			int diff = target - nums[i];
			if(hash.containsKey(diff)){
				int toReturn[] = {hash.get(diff), i};
				return toReturn;
			}

			hash.put(nums[i], i);
		}

		return null;
	}
}

/*
time complexity: O(n)
space complexity: O(n)
*/