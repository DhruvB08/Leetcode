import java.util.*;

public class UniquePathsII{
	public static void main(String[] args){

	}

	public int solution(int[][] obstacleGrid){
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;

		//flip first item, 0-->1, 1-->0
		//shows numebr of available paths from this point forward
		obstacleGrid[0][0] ^= 1;

		//first row
		//if 1 (obstacle), then set to 0 (0 available paths from here on)
		//if 0 then set to 1 (top cell, 1 path available)
		for(int i=0; i<n; i++){
			obstacleGrid[0][i] = obstacleGrid[0][i]==1 ? 0:obstacleGrid[0][i-1];
		}

		//first column
		//same procedure as above
		for(int i=0; i<m; i++){
			obstacleGrid[i][0] = obstacleGrid[i][0]==1 ? 0:obstacleGrid[i-1][0];
		}

		//rest of cells
		//if 1 (obstacle), set to 0
		//set to left cell + top cell (number of available paths from here on)
		for(int i=1; i<m; i++){
			for(int j=1; j<n; j++){
				obstacleGrid[i][j] = obstacleGrid[i][j]==1 ? 0:obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
			}
		}

		return obstacleGrid[m-1][n-1];
	}
}