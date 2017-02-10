import java.util.*;

public class ReverseInteger {
	private static Scanner reader;

	public static void main(String[] args){
		reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = reader.nextInt();

		System.out.println(reverse(x));
	}
	
	private static int reverse(int x){
		int result = 0;

		while(x!=0){
			int tail = x%10;
			int newRes = result*10 + tail;

			if((newRes-tail)/10 != result){
				return 0;
			}

			result = newRes;
			x = x/10;
		}

		return result;
	}
}

/*
time: O(n)
space: O(n)
 */
