package week1.calss1.ArrayAndMath;
/**
 * You are given an Array of boxes A, where each box consists of oranges. 
 * You really love oranges, and you want to eat atleast B oranges.
 * You start from the 0th index of the array, and keep eating oranges until you eat B oranges. 
 * If oranges from a box at ith index get depleted, you start eating from the (i+1)th box. 
 * Determine index of the box where you finish eating B number of oranges. 
 * If you don't eat B oranges even after eating from all the boxes, return -1.
 * 
 * 
 * @author RajendraMallina
 *
 */
public class CarotenemiaProblem {

	public static void main(String[] args) {
		
		int list[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		int B = 10;
		System.out.println(findIndexOfBox(list, B));
	}

	/**
	 * This method return the index of the box where we got require oranges.
	 * @param list 
	 * @param oranges
	 * @return index of the box
	 */
	private static int findIndexOfBox(int[] list, int oranges) {
		
		int i = 0;
		
		while(oranges > 0 && i < list.length) {
			oranges -= list[i++];		//Removing oranges from the box. 
		}
		
		return oranges <= 0 ? i -1 : -1;
	}
}
