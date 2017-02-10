import java.util.*;

public class ImplementStrStr {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		System.out.println("Enter the big string");
		String haystack = scanner.nextLine();
		
		System.out.println("enter the smaller string");
		String needle = scanner.nextLine();
		
		System.out.println(strStr(haystack, needle));
	}
	
	static int strStr(String haystack, String needle){
		for(int i=0; ; i++){
			for(int j=0; ; j++){
				if(j == needle.length()){
					return i;
				}
				
				if(i+j == haystack.length()){
					return -1;
				}
				
				if(needle.charAt(j) != haystack.charAt(i+j)){
					break;
				}
			}
		}
	}
}
