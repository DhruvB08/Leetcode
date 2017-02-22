import java.util.*;

public class PlusOne{
	public static void main(String[] args){
		PlusOne po = new PlusOne();
		int[] num = {1, 2, 3, 4, 5};

		System.out.println(Arrays.toString(po.plus(num)));
	}

	public int[] plus(int[] digits){
		int n = digits.length;

		for(int i=n-1; i>=0; i--){
			if(digits[i] < 9){
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		int[] newNum = new int[n+1];
		newNum[0] = 1;

		return newNum;
	}
}