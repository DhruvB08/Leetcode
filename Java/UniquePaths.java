import java.util.*;

public class UniquePaths{
	public static void main(String[] args){
		UniquePaths up = new UniquePaths();
		int m = 3;
		int n = 7;

		System.out.println(m + " " + n);
		System.out.println(up.paths(m, n) + " unique paths");
	}

	public int paths(int m, int n){
		int[][] map = new int[m][n];

		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				map[i][j] = 1;
			}
		}

		for(int i=1; i<m; i++){
			for(int j=1; j<n; j++){
				map[i][j] = map[i-1][j] + map[i][j-1];
			}
		}

		return map[m-1][n-1];
	}
}