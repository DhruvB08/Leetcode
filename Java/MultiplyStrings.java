import java.util.*;

public class MultiplyStrings{
	/*
	Given two non-negative integers num1 and num2 represented as strings,
	return the product of num1 and num2.

	Note:
	The length of both num1 and num2 is < 110.
	Both num1 and num2 contains only digits 0-9.
	Both num1 and num2 does not contain any leading zero.
	You must not use any built-in BigInteger library or convert the inputs to integer directly.
	*/

	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		MultiplyStrings mult = new MultiplyStrings();

		mult.printDescript();
		System.out.println("Enter the first number:");
		String num1 = mult.scanner.nextLine();
		System.out.println("Enter the second number:");
		String num2 = mult.scanner.nextLine();

		System.out.println(mult.multiply(num1, num2));
	}

	public String multiply(String num1, String num2){
		int m = num1.length();
		int n = num2.length();
		int[] pos = new int[m + n];

		for(int i=m-1; i>=0; i--){
			for(int j=n-1; j>=0; j--){
				int mul = (num1.charAt(i) - '0') * (num2.charAt(i) - '0');
				int p1 = i+j;
				int p2 = i+j+1;
				int sum = mul + pos[p2];

				pos[p1] += sum/10;
				pos[p2] = sum%10;
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int p : pos){
			if(!(sb.length()==0 && p==0)){
				sb.append(p);
			}
		}

		return sb.length()==0 ? "0":sb.toString();
	}

	private void printDescript(){
		System.out.println("Given two non-negative integers num1 and num2 represented as strings,");
		System.out.println("return the product of num1 and num2.");
		System.out.println(" ");
		System.out.println("Note:");
		System.out.println("The length of both num1 and num2 is < 110.");
		System.out.println("Both num1 and num2 contains only digits 0-9.");
		System.out.println("Both num1 and num2 does not contain any leading zero.");
		System.out.println("You must not use any built-in BigInteger library");
		System.out.println("or convert the inputs to integer directly");
		System.out.println(" ");
	}
}