
public class ValidSudoku {
	public static void main(String[] args){
		
	}
	
	public boolean isValid(char[][] board){
		for(int i=0; i<9; i++){
			if(!isValid(board, i, 0, i, 8)){
				return false;
			}
			if(!isValid(board, 0, i, 8, i)){
				return false;
			}
		}
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(!isValid(board, i*3, j*3, i*3 +2, j*3 +2)){
					return false;
				}
			}
		}
		
		return true;
	}
	
	private boolean isValid(char[][] board, int x1, int x2, int y1, int y2){
		boolean[] boolArray = new boolean[10];
		
		for(int i=x1; i<x2; i++){
			for(int j=y1; j<y2; j++){
				if(board[i][j] != '.'){
					int boolIdx = Character.getNumericValue(board[i][j]);
					if(boolArray[boolIdx]){
						return false;
					} else{
						boolArray[boolIdx] = true;
					}
				}
			}
		}
		
		return true;
	}
}
