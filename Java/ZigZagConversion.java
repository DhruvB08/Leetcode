import java.util.*;

public class ZigZagConversion{
	public static void main(String[] args){
		String s = "Paypalishiring";

		System.out.println(convert(s, 3));
	}

	private static String convert(String s, int rows){
		char[] c = s.toCharArray();
		int len = c.length;

		StringBuffer[] sb = new StringBuffer[rows];
		for(int i=0; i<sb.length; i++){
			sb[i] = new StringBuffer();
		}

		int j=0;
		while(j<len){
			for(int index=0; index<rows && j<len; index++){
				sb[index].append(c[j++]);
			}

			for(int index=rows-2; index>=1 && j<len; index--){
				sb[index].append(c[j++]);
			}
		}

		for(int index=1; index<sb.length; index++){
			sb[0].append(sb[index]);
		}

		return sb[0].toString();
	}
}

/*
time: O(n)
space: O(n)
*/