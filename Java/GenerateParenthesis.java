import java.util.*;

public class GenerateParenthesis {
	public static void main(String[] args){
		int n = 3;
		System.out.println(generate(n));
	}
	
	public static List<String> generate(int n){
		List<String> list = new ArrayList<String>();
		backtrack(list, "", 0, 0, n);
		return list;
	}
	
	private static void backtrack(List<String> list, String str, int open, int close, int max){
		
		if(str.length() == 2*max){
			list.add(str);
			return;
		}
		
		if(open<max){
			backtrack(list, str+'(', open+1, close, max);
		}
		if(close<open){
			backtrack(list, str+')', open, close+1, max);
		}
	}
}
