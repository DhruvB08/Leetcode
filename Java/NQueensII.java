import java.util.*;

public class NQueensII{
	public static void main(String[] args){
		NQueensII nq2 = new NQueensII();
		int n = 4;

		System.out.println("There are " +nq2.total(n)+ " possible solutions with n=" +n);
	}

	public int total(int n){
		return counter(0, 0, n);
	}

	private final Set<Integer> usedCols = new HashSet<Integer>();
	private final Set<Integer> usedDiags1 = new HashSet<Integer>();
	private final Set<Integer> usedDiags2 = new HashSet<Integer>();

	private int counter(int row, int count, int n){
		for(int col=0; col<n; col++){
			if(usedCols.contains(col)){
				continue;
			}

			int diag1 = row-col;
			if(usedDiags1.contains(diag1)){
				continue;
			}

			int diag2 = row+col;
			if(usedDiags2.contains(diag2)){
				continue;
			}

			if(row == n-1){
				count++;
			} else{
				usedCols.add(col);
				usedDiags1.add(diag1);
				usedDiags2.add(diag2);
				count = counter(row+1, count, n);

				usedCols.remove(col);
				usedDiags1.remove(diag1);
				usedDiags2.remove(diag2);
			}
		}

		return count;
	}
}