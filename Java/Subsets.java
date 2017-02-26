import java.util.*;

public class Subsets{
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		System.out.println("Given an array of numbers, this returns the power set.");
		System.out.println("How many numbers are in your array?");
		int n = scanner.nextInt();
		
		System.out.println("Start entering the numbers.");
		int[] nums = new int[n];
		for(int i = 0; i < n; i++){
			nums[i] = scanner.nextInt();
		}

		Subsets s = new Subsets();
		System.out.println("");
		System.out.println("[");
		for(List<Integer> list : s.subsets(nums)){
			System.out.println("\t" + list);
		}
		System.out.println("]");
	}

	public List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<Integer>(), nums, 0);
		return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start){
		list.add(new ArrayList<>(tempList));
		for(int i = start; i < nums.length; i++){
			tempList.add(nums[i]);
			backtrack(list, tempList, nums, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}
}