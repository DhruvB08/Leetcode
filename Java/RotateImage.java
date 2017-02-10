
public class RotateImage {
	public static void main(String[] args){
		
	}
	
	public void rotate(int[][] matrix){
		for(int i=0; i<matrix.length; i++){
			for(int j=i; j<matrix[0].length; j++){
				swap(matrix, i, j, j, i);
			}
		}
		
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length/2; j++){
				swap(matrix, i, j, i, matrix.length-1-j);
			}
		}
	}
	
	private void swap(int[][] matrix, int i1, int j1, int i2, int j2){
		int temp = matrix[i1][j1];
		matrix[i1][j1] = matrix[i2][j2];
		matrix[i2][j2] = temp;
	}
}
