package week1.calss1.ArrayAndMath;

import java.util.Arrays;

/**
 * Given an unsorted array, find the maximum difference between the successive elements in its sorted form.
 * 
 * 
 * @author rmallina
 *
 */
public class MaximumConsecutiveGap {

	/**
	 * Method will return maximum Consecutive Gap between successive two numbers of the list.
	 * @param list 
	 * @return maximum consecutive gap.
	 */
	private static int findMaximumConsecutiveGap(final int[] list) {
		
		// The question says the maximum consecutive between two numbers of sorted array.
		// Given list was unsorted and final so we can't sort the array in the same list.
		
		int copyOfList[] = new int[list.length];
		
		copyOfList = copyTheList(list);
		Arrays.sort(copyOfList);
		
		int maximumGap = Integer.MIN_VALUE;
		
		for(int i = 0; i < list.length-1; i++) {
			int currentGap = copyOfList[i+1] - copyOfList[i];
			if(currentGap > maximumGap) {
				maximumGap = currentGap;
			}
		}
		
		return maximumGap;
	}
	
	/**
	 * The method will return cop
	 * @param list
	 * @return
	 */
	private static int[] copyTheList(int[] list) {
		return list;
	}
	
	public static void main(String[] args) {
		
		final int list[] = { 5, 2, 4,  66, 67, 1, 71};
		
		System.out.println(findMaximumConsecutiveGap(list));
	}
}
