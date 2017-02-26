import java.util.*;

public class Sqrtx{
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		System.out.println("Enter a number you want the (int) square root of:");
		int num = scanner.nextInt();

		Sqrtx s = new Sqrtx();
		System.out.println(" ");
		System.out.println(s.mySqrt(num));
	}

	public int mySqrt(int x){
		long r = x;
		while(r*r > x){
			r = (r + x/r) / 2;
		}

		return (int) r;
	}
}