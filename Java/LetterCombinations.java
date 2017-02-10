import java.util.*;

public class LetterCombinations {
	public static void main(String[] args){
		String digits = "23";
		LetterCombinations letter = new LetterCombinations();
		
		System.out.println(letter.letterCombinations(digits));
	}
	
	List<String> letterCombinations(String digits){
		LinkedList<String> ans = new LinkedList<String>();
		String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ans.add("");
		
		for(int i=0; i<digits.length(); i++){
			int x = Character.getNumericValue(digits.charAt(i));
			while(ans.peek().length()==i){
				String t = ans.remove();
				for(char s : mapping[x].toCharArray()){
					ans.add(t+s);
				}
			}
		}
		
		return ans;
	}
}
