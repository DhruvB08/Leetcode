import java.util.*;

public class RegularExpressionMatching {
	public static Scanner reader;
	
	public static void main(String[] args){
		reader = new Scanner(System.in);
		
		System.out.print("Enter a string, then an expression or another string");
		String s1 = reader.nextLine();
		String s2 = reader.nextLine();
		
		System.out.println(isMatch(s1, s2));	
	}
	
	private static boolean isMatch(String s, String p){
		if (s == null || p == null){
			return false;
		}
		
		boolean[][] state = new boolean[s.length() + 1][p.length() + 1];
		state[0][0] = true;
		
		//any time there is a * in the expression,
		//set the state to the same state as either the previous 
		//or two previous states ago
		for (int j = 1; j < state[0].length; j++) {
			if (p.charAt(j - 1) == '*') {
				if (state[0][j - 1] || (j > 1 && state[0][j - 2])) {
					state[0][j] = true;
				}
			}
		}
		
		
		for (int i = 1; i < state.length; i++) {
			for (int j = 1; j < state[0].length; j++) {
				
				//checking if the character at the expression is a ., or equal
				//to the character at the substring
				if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
					state[i][j] = state[i - 1][j - 1];
				}
				
				//if the character at the substring is a *
				if (p.charAt(j - 1) == '*') {
					
					//character before * is not . and not same character
					//as character in string
					if (s.charAt(i - 1) != p.charAt(j - 2) && p.charAt(j - 2) != '.') {
						state[i][j] = state[i][j - 2];
					} 
					
					//character before * matches character in string
					else {
						state[i][j] = state[i - 1][j] || state[i][j - 1] || state[i][j - 2];
					}
				}
			}
		}
		
		return state[s.length()][p.length()];
	}
}


/*
time: O(n^2)
space: O(n^2)
*/
