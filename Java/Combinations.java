import java.util.*;

public class Combinations{
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		Combinations combo = new Combinations();
		System.out.println("What's the highest number to go to?");
		int n = scanner.nextInt();
		System.out.println("How many numbers in each combination?");
		int k = scanner.nextInt();

		for(List<Integer> list : combo.combine(n, k)){
			System.out.println(list);
		}
	}

	public List<List<Integer>> combine(int n, int k){
		List<List<Integer>> combs = new ArrayList<List<Integer>>();
		combine(combs, new ArrayList<Integer>(), 1, n, k);
		return combs;
	}

	private void combine(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k){
		if(k == 0){
			combs.add(new ArrayList<Integer>(comb));
			return;
		}

		for(int i = start; i <= n; i++){
			comb.add(i);
			combine(combs, comb, i + 1, n, k - 1);
			comb.remove(comb.size() - 1);
		}
	}
}