package week1.calss1.ArrayAndMath;
/**
 * The following program is to find the total content of water will remains on the buildings after raining.
 * Given N non-negative integers representing each building height(an elevation map) where the width of each bar is 1, 
 * compute how much water it is able to trap after raining.
 * 
 * Example Input and Output
 * 
 * Input: list[]   = {3, 0, 0, 2, 0, 4}
 *	Output: 10
 *	Structure is like below
 *	     |
 *	|    |
 *	|  | |
 *	|__|_| 
 *	We can trap "3*2 units" of water between 3 an 2,
 *	"1 unit" on top of bar 2 and "3 units" between 2 
 *
 * 
 * @author RajendraMallina
 *
 */
public class RainWaterTrapped {
	
	/**
	 * 
	 * @param list -> An elevation map(Represents height of each building)
	 * @return the total content of water remains on the buildings.
	 */
	private static int findTotalTrapWater(int[] list) {
		
		int leftMax = 0, rightMax = 0; // Variables to store the maximum value of both ends.
		int startIndex = 0, endIndex = list.length - 1;
		int totalWaterContent = 0;
		
		while(startIndex < endIndex) {
			
			if(list[startIndex] < list[endIndex]) {
				
				//Right side Index is less than current so need to calculate from left side.
				if(list[startIndex] > leftMax) {
					leftMax = list[startIndex]; 
					//If current building has max height water content on this building is zero
				}else {
					totalWaterContent += (leftMax - list[startIndex]);
					// The water content on the building is left max height building - current building height.
				}
				startIndex++; // Going to calculating water on the next building.
			}else {
				//Right side Building is less than left so need to calculate from right side.
				
				if(list[endIndex] > rightMax) {
					rightMax = list[endIndex];
				}else {
					totalWaterContent += (rightMax - list[endIndex]);
				}
				endIndex--;
			}
		}
		return totalWaterContent;
	}
	
	public static void main(String[] args) {
		
		int list[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		System.out.println(findTotalTrapWater(list));
	}
}
/* Procedure to solve this problem in linear time.
 * 
 * The total amount of water you can store on a each building was the min(leftMaxBuilding, rightMaxBuilding)
 * So we need to keep two variables which describes the left most height and right most height for building.
 * So start program execution from both ends(left and right). If right side building height was greater than left
 * side building than calculate water content from the left side. If your left side building is left side max height
 * building than water content on this building was 0. Otherwise water content on your building was max height of 
 * left side building - current building height than increase move to next building again compare with the right side building.
 * If right side building height is less than your current building than do the above operation on right side.
 * Repeat the same operation until before your left side building and right side building meet each other.
 * That means when you reach middle building.
 * 
 * 
 */