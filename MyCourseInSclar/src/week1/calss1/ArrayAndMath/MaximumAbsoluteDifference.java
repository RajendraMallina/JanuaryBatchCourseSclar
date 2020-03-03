package week1.calss1.ArrayAndMath;
/**
 * You are given an array of N integers, A1, A2 ,..., AN. 
 * Return maximum value of f(i, j) for all 1 ≤ i, j ≤ N. f(i, j) is defined as 
 * |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.
 * 
 * Sample input and output
 * 
 * A=[1, 3, -1]
 * 
 * f(1, 1) = f(2, 2) = f(3, 3) = 0
 * f(1, 2) = f(2, 1) = |1 - 3| + |1 - 2| = 3
 * f(1, 3) = f(3, 1) = |1 - (-1)| + |1 - 3| = 4
 * f(2, 3) = f(3, 2) = |3 - (-1)| + |2 - 3| = 5
 * 
 * So, we return 5 which is the maximum value.
 * 
 * 
 * @author RajendraMallina
 *
 */
public class MaximumAbsoluteDifference {
	
	public static void main(String[] args) {
			
		int list[] = {1, 3, -1};
		
		System.out.println(findMaxAbsoluteDifference(list));	
	}
	
	/**
	 * The method which calculate and return maximum absolute value of given below formula.
	 * |A[i] - A[j]| + |i - j|
	 * 
	 * @param list
	 * @return maximum absolute value
	 */
	private static int findMaxAbsoluteDifference(int[] list) {
		
		int maxX = (list[0] + 1);
        int maxY = (list[0] - 1);
        int minX = (list[0] + 1);
        int minY = (list[0] - 1);
        
        for(int i = 1; i  < list.length; i++){
               
            int xParm = ((list[i] + (i+1)));
            int yParm = ((list[i] - (i+1)));
            
            if(maxX < xParm){
                maxX = xParm;
            }
            if(maxY < yParm){
                maxY = yParm;
            }
            
            if(minX > xParm){
                minX = xParm;
            }
            if(minY > yParm){
                minY = yParm;
            }
        }
        
        
        return (Math.max((maxX - minX) , (maxY - minY)));
	}

}
/*
 * The traditional approach to solve this problem is iterate the list for all combinations 
 * then apply the formula and find the maximum absolute value from the answer list.
 * which takes O(n^2) times to execute.
 * 
 * But we can solve this in linear time.
 * 
 * 
 * 
 */
