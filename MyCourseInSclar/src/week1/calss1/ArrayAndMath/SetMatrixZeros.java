package week1.calss1.ArrayAndMath;

import java.util.Arrays;

/**
 * 
 * Given a matrix, A of size M x N of 0s and 1s.
 * If an element is 0, set its entire row and column to 0.
 * 
 * @author RajendraMallina
 *
 */
public class SetMatrixZeros {

	public static void main(String[] args) {
		int list[][] = {   {1, 0, 1},
		                   {1, 1, 1}, 
		                   {1, 1, 1}   };
		
		int[][] resultList = getSetMatrixZeroList(list);
		
		for(int[] row: resultList) {
			System.out.println(Arrays.toString(row));
		}
		 
	}
	
	/**
	 * This method will return result matrix after making rows and columns zero.
	 * If cell contains zero.
	 * @param list
	 * @return result matrix
	 */
	private static int[][] getSetMatrixZeroList(int[][] list) {
		
		int rowInfo[] = new int[list.length];
		int colInfo[] = new int[list.length];
		int resultList[][] = new int[list.length][list.length];
		
		for(int row = 0; row < list.length; row++) {
			
			for(int col = 0; col < list[row].length; col++) {
				
				if(list[row][col] == 0) {
					rowInfo[row] = 1;
					colInfo[col] = 1;
				}
			}
		}
		
		for(int row = 0; row < list.length; row++) {
			
			for(int col = 0; col < list[row].length; col++) {
				
				if(rowInfo[row] == 1) {
					resultList[row][col] = 0;
				}else {
					if(colInfo[col] == 1) {
						resultList[row][col] = 0;
					}else {
						resultList[row][col] = 1;
					}
				}
			}
		}
		
		return resultList;
	}
}

/*
 * As per the question if list contains zero in any cell we need to replace entire row and column
 * fill with zero otherwise fill with one. 
 * 
 * If we perform operation directly on the given matrix the unprocessed data will change.
 * That produce wrong result. We have to know which row and which column need to fill with zeros.
 * The remaining rows and columns will fill with ones.
 * 
 * So we have to maintain two simple list which stores the row information and column information.
 * These two temporary lists store the information which rows and column need to fill with zeros.
 * 
 * Iterate matrix if any cell equal to zero then add 1 to the temporary list at row index and column index.
 * 
 * The iterate through matrix fill zero if row information or column information is equal to 1 otherwise
 * fill the result matrix with one.
 * 
 * 
 */
