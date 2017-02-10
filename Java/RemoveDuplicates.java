
public class RemoveDuplicates {
	public static void main(String[] args){
		int[] A = {1, 2, 2, 3, 4, 4, 4, 5};
		System.out.println(removeDuplicates(A));
	}
	
	static int removeDuplicates(int[] A){
		if(A.length==0){
			return 0;
		}
		
		int j=0;
		for(int i=0; i<A.length; i++){
			if(A[i] != A[j]){
				A[++j] = A[i];
			}
		}
		
		return ++j;
	}
}
