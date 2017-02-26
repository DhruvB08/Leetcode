import java.util.*;

public class AddBinary{
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		System.out.println("Enter the first binary number:");
		String a = scanner.nextLine();
		System.out.println("Enter the second binary number:");
		String b = scanner.nextLine();

		AddBinary ab = new AddBinary();
		System.out.println(" ");
		System.out.println("Their sum is: " + ab.addBin(a, b));
	}

	public String addBin(String a, String b){
		StringBuilder sb = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;

		while(i>=0 || j>=0){
			int sum = carry;
			if(j >= 0){
				sum += b.charAt(j--) - '0';
			}
			if(i >= 0){
				sum += a.charAt(i--) - '0';
			}
			sb.append(sum % 2);
			carry = sum / 2;
		}

		if(carry != 0){
			sb.append(carry);
		}

		return sb.reverse().toString();
	}
}