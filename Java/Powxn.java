import java.util.*;

public class Powxn{
	public static void main(String[] args){
		Powxn pow = new Powxn();
		System.out.println(pow.solution(2.0, 5));
	}

	public double solution(double x, int n){
		if(n==0){
			return 1;
		}

		if(n<0){
			n = -n;
			x = 1/x;
		}

		return (n%2)==0 ? solution(x*x, n/2) : x*solution(x*x, n/2);
	}
}