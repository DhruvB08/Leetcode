import java.util.*;

public class LengthLastWord{
	public static void main(String[] args){
		LengthLastWord llw = new LengthLastWord();
		String s = "Hello World";

		System.out.println(s);
		System.out.println(llw.lengthWord(s));
	}

	public int lengthWord(String s){
		s = s.trim();
		int lastIndex = s.lastIndexOf(' ') + 1;

		return s.length() - lastIndex;
	}
}