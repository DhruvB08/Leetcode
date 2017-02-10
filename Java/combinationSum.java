package combinationSum;
import java.util.*;

public class combinationSum {
	public static void main(String[] args){
		
	}
	
	public List<List<Integer>> combinationSumI(int[] num, int target){
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(num);
		backtrack(list, new ArrayList<>(), num, target, 0);		
		return list;
	}
	
	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start){
		if(remain<0){
			return;
		} else if(remain==0){
			list.add(new ArrayList<>(tempList));
		} else{
			for(int i=start; i<nums.length; i++){
				tempList.add(nums[i]);
				backtrack(list, tempList, nums, remain - nums[i], i);
				tempList.remove(tempList.size()-1);
			}
		}
	}
}
