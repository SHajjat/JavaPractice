package InterviewQuetions;

import java.util.HashSet;

public class solvingSuddoku {
	/**
	 * We need to test whether a Sudoku solution is valid, testing the solution
	 * against the usual rules of Sudoku:
	 * <p>
	 * https://en.wikipedia.org/wiki/Sudoku
	 * <p>
	 * "The objective is to fill a 9×9 grid with digits so that each column, each
	 * row, and each of the nine 3×3 sub-grids that compose the grid (also called
	 * "boxes", "blocks", "regions", or "sub-squares") contains all of the digits
	 * from 1 to 9.
	 */
	
	public static int[][] board = new int[][]{
			new int[]{5, 3, 4, 6, 7, 8, 9, 1, 2},
			new int[]{6, 7, 2, 1, 9, 5, 3, 4, 8},
			new int[]{1, 9, 8, 3, 4, 2, 5, 6, 7},
			new int[]{8, 5, 9, 7, 6, 1, 4, 2, 3},
			new int[]{4, 2, 6, 8, 5, 3, 7, 9, 1},
			new int[]{7, 1, 3, 9, 2, 4, 8, 5, 6},
			new int[]{9, 6, 1, 5, 3, 7, 2, 8, 4},
			new int[]{2, 8, 7, 4, 1, 9, 6, 3, 5},
			new int[]{3, 4, 5, 2, 8, 6, 1, 7, 9}};
	
	public static boolean checkSize(int[][] board) {
		if(board.length!=9){
			return false;
		}
		for(int [] inner: board ){
			if(inner.length!=9){
				return false;
			}
		}
	
		return true;
	}
	
	public static boolean isFind(int[][] board, int row, int colm) {
	return false;
	}
	
	public static void main(String[] args) {
		
	
	}
	
}

