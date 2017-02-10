
public class SudokuSolver {
	public static void main(String[] args){
		
	}
	
	public void solve(char[][] board){
		if(board==null || board.length==0){
			return; 
		}
		doSolve(board);
	}
	
	private boolean doSolve(char[][] board){
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board[0].length; j++){
				if(board[i][j] == '.'){
					for(char c='1'; c<='9'; c++){		//trial 1-9
						if(isValid(board, i, j, c)){	
							board[i][j] = c;			//put c in this cell
							
							if(doSolve(board)){			//find next empty cell
								return true;			//end if all cells completed
							} else{
								board[i][j] = '.';		//go back, wrong input to cell
							}
						}
					}
					
					return false;
				}
			}
		}
		
		return true;
	}
	
	private boolean isValid(char[][] board, int row, int col, char c){
		for(int i=0; i<9; i++){
			if(board[i][col]!='.' && board[i][col]==c){		//check the row
				return false;
			}
			if(board[row][i]!='.' && board[row][i]==c){		//check the column
				return false;
			}
			if(board[3*(row/3) + i/3][3*(col/3) + i%3] != '.' && 	//check 3*3 block
				board[3*(row/3) + i/3][3*(col/3) + i%3] == c){
				return false; 
			}
		}
		
		return true;
	}
}
