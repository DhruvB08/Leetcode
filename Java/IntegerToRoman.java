import java.util.*;

public class IntegerToRoman {
	private static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.println("Enter a number from 0-3999");
		int num = reader.nextInt();
		
		System.out.println(convert(num));
	}
	
	private static String convert(int num){
		String M[] = {"", "M", "MM", "MMM"};
		String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		
		return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
	}
}
