import java.util.*;

public class StringToInteger {
	private static Scanner reader;
	
	public static void main(String[] args){
		reader = new Scanner(System.in);
		
		System.out.println("Enter a string integer");
		String s = reader.nextLine();
		
		System.out.println(myAtoI(s));
	}
	
	private static int myAtoI(String str){
		int i=0;
		str = str.trim();
		char[] c = str.toCharArray();
		
		int sign=1;
		if(i<c.length && (c[i]=='-' || c[i]=='+')){
			if(c[i]=='-'){
				sign = -1;
			}
			
			i++;
		}
		
		int num=0;
		int bound = Integer.MAX_VALUE / 10;
		
		while(i<c.length && c[i]>='0' && c[i]<='9'){
			int digit = c[i] - '0';
			if(num>bound || (num==bound && digit>7)){
				return sign==1 ? Integer.MAX_VALUE:Integer.MIN_VALUE;
			}
			
			num = num*10 + digit;
			i++;
		}
		
		return sign*num;
	}
}

/*
time: O(n)
space: O(n)
*/