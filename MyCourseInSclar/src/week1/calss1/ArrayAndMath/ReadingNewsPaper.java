package week1.calss1.ArrayAndMath;

/**
 * You have a newspaper which has A lines to read. You decided to start reading
 * the 1st line from Monday. You are given a schedule, B, where B[i] = number of
 * lines you can read on that day. You are very strict in reading the newspaper
 * and you will read as much as you can every day. Determine and return, which
 * day of the week you will read the last line of the newspaper.
 * 
 * @author RajendraMallina
 *
 */
public class ReadingNewsPaper {

	public static void main(String[] args) {
		
		int list[] = { 15, 20, 20, 15, 10, 30, 45 };
		int linesToRead = 100;

		System.out.println(getTheLastDay(list, linesToRead));
	}

	/**
	 * This method return the day of the week when read the last line of newspaper.
	 * 
	 * @param list
	 * @param linesToRead
	 * @return day of the week
	 */
	private static int getTheLastDay(int[] list, int linesToRead) {

		int lastDay = 0;
		while (linesToRead > 0) {
			
			int startDay = 0;
			for (int day = startDay; day < list.length; day++) {

				linesToRead -= list[day];
				if (linesToRead <= 0) {
					lastDay = day;
					break;
				}
			}
		}

		return lastDay + 1;
	}
}
