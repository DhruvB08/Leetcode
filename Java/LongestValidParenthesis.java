import java.util.*;

public class LongestValidParenthesis {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.println("Enter a string with only ('s and )'s");
		String str = scanner.nextLine();
		
		System.out.println(longestValidParenthesis(str));
	}
	
	public static int longestValidParenthesis(String s){
		if(s==null || s.length()==0){
			return 0;
		}
		
		Stack<Integer> stack = new Stack<Integer>();	//store indices of '('
		int[] result = new int[s.length()];				//store length of current longest valid sequence
		Arrays.fill(result, 0);
		int max = 0;
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == '('){
				stack.push(i);
			}
			
			else if(s.charAt(i) == ')'){
				if(stack.isEmpty()){
					continue;
				} else if(stack.peek() > 0){
					result[i] = 2 + result[stack.pop() -1] + result[i-1];
				} else{
					result[i] = 2 + result[i-1];
					stack.pop();
				}
			}
			
			max = Math.max(result[i], max);
		}
		
		return max;
	}
}
