import java.util.*;

public class LongestCommonPrefix {
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.println("How many strings?");
		int num = reader.nextInt();
		
		System.out.println("Start Entering strings");
		String[] strs = new String[num];
		for(int j=0; j<num; ++j){
			strs[j] = reader.nextLine();
		}
		
		System.out.println(prefix(strs));
	}
	
	static String prefix(String[] strs){
		if(strs==null || strs.length==0){
			return "";
		}
		
		String pre = strs[0];
		int i=1;
		while(i < strs.length){
			while(strs[i].indexOf(pre) != 0){
				pre = pre.substring(0, pre.length()-1);
			}
			
			i++;
		}
		
		return pre;
	}
}
