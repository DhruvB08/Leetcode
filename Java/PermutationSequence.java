import java.util.*;

public class PermutationSequence{
	public static void main(String[] args){
		PermutationSequence ps = new PermutationSequence();
		System.out.println(ps.getPermutation(4, 13));
	}

	public String getPermutation(int n, int k){
		List<Integer> nums = new ArrayList<Integer>();
		int[] factorial = new int[n+1];
		StringBuilder sb = new StringBuilder();

		int sum = 1;
		factorial[0] = 1;
		for(int i=1; i<=n; i++){
			sum *= i;
			factorial[i] = sum;
			nums.add(i);
		}

		k--;
		for(int i=1; i<=n; i++){
			int index = k / factorial[n-i];
			sb.append(nums.get(index));
			nums.remove(index);
			k -= index * factorial[n-i];
		}

		return String.valueOf(sb);
	}
}