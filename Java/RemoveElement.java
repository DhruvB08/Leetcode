import java.util.*;

public class RemoveElement {
	public static void main(String[] args){
		int[] A = {2, 3, 3, 2, 4, 5};
		int elem = 3;
		
		remove(A, elem);
		System.out.println(Arrays.toString(A));
	}
	
	static int remove(int[] A, int elem){
		int m = 0;
		
		for(int i=0; i<A.length; i++){
			if(A[i] != elem){
				A[m] = A[i];
				m++;
			}
		}
		
		return m;
	}
}
