import java.util.*;

public class ValidNumber{
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		System.out.println("Enter a string, to be verified as a number or not:");
		String str = scanner.nextLine();

		ValidNumber vn = new ValidNumber();
		System.out.println(vn.isNum(str));
	}

	public boolean isNum(String s){
		s = s.trim();

		boolean pointSeen = false;
		boolean eSeen = false;
		boolean numSeen = false;

		for(int i=0; i<s.length(); i++){
			if('0'<=s.charAt(i) && s.charAt(i)<='9'){
				numSeen = true;
			} 
			else if(s.charAt(i)=='.'){
				if(eSeen || pointSeen){
					return false;
				}
				pointSeen = true;
			} 
			else if(s.charAt(i)=='e'){
				if(eSeen || !numSeen){
					return false;
				}
				eSeen = true;
				numSeen = false;
			} 
			else if(s.charAt(i)=='-' || s.charAt(i)=='+'){
				if(i!=0 && s.charAt(i-1)!='e'){
					return false;
				}
			} 
			else{
				return false;
			}
		}

		return numSeen;
	}
}