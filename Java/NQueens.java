import java.util.*;

public class NQueens{
	public static void main(String[] args){
		NQueens nq = new NQueens();
		System.out.println(nq.solve(4));
	}

	public List<List<String>> solve(int n){
		char[][] board = new char[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				board[i][j] = '.';
			}
		}

		List<List<String>> res = new ArrayList<List<String>>();
		dfs(board, 0, res);
		return res;
	}

	private void dfs(char[][] board, int col, List<List<String>> res){
		if(col==board.length){
			res.add(construct(board));
			return;
		}

		for(int i=0; i<board.length; i++){
			if(validate(board, i, col)){
				board[i][col] = 'Q';
				dfs(board, col+1, res);
				board[i][col] = '.';
			}
		}
	}

	private boolean validate(char[][] board, int x, int y){
		for(int i=0; i<board.length; i++){
			for(int j=0; j<y; j++){
				if(board[i][j]=='Q' && (x+j==y+i || x+y==i+j || x==i)){
					return false;
				}
			}
		}

		return true;
	}

	private List<String> construct(char[][] board){
		List<String> res = new LinkedList<String>();
		for(int i=0; i<board.length; i++){
			String s = new String(board[i]);
			res.add(s);
		}

		return res;
	}
}