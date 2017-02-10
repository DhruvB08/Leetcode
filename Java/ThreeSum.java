import java.util.Arrays;
import java.util.*;

public class ThreeSum {
	public static void main(String[] args){
		int[] nums = {4, -2, 3, -2, 1, -1, -1, 2, 0};
		System.out.println(threeSum(nums));
	}
	
	static List<List<Integer>> threeSum(int[] num){
		Arrays.sort(num);
		List<List<Integer>> res = new LinkedList<>();
		
		for(int i=0; i<num.length-2; i++){
			if(i==0 || (i>0 && num[i]!=num[i-1])){
				int lo = i+1;
				int hi = num.length-1;
				int sum = 0 - num[i];
				
				while(lo < hi){
					if(num[lo]+num[hi] == sum){
						res.add(Arrays.asList(num[i], num[lo], num[hi]));
						
						while(lo<hi && num[lo]==num[lo+1]){
							lo++;
						}
						while(lo<hi && num[hi]==num[hi-1]){
							hi--;
						}
						
						lo++;
						hi--;
					} else if(num[lo]+num[hi] < sum){
						while(lo<hi && num[lo]==num[lo+1]){
							lo++;
						}
						lo++;
					} else{
						while(lo<hi && num[hi]==num[hi-1]){
							hi--;
						}
						hi--;
					}
				}
			}
		}
		
		return res;
	}
}
