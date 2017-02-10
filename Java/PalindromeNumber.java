import java.util.*;

public class PalindromeNumber {
	public static Scanner reader;
	
	public static void main(String[] args){
		reader = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int x = reader.nextInt();
		
		System.out.println(solution(x));
	}
	
	private static boolean solution(int x){
		if(x>=0 && x<=9)
			return true;
		
		if(x<0)
			return false;
		
		if(x%10 == 0)
			return false;
		
		int r=0;
		int e;
		while(r<x){
			e = x%10;
			x /= 10;
			
			if(r==x)
				return true;
			
			r *= 10;
			r += e;
		}
		
		return r==x;
	}
}

/*
time: O(n)
space: O(n)
*/