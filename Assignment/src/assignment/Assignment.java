package assignment;

public class Assignment {

	public static void main(String[] args) {
		

		final int nums[][] = {	{1,2,3,4},
								{5,6,7,8},
								{9,10,11,12},
								{13,14,15,16}	};
		
		helicalPrintArray(nums);
	}

	/**
	 * Given a 2D array, traverses the given array in a helical path then prints the numbers along this path.
	 * 1.1) The method starts the helix as clockwise direction by starting with 'Right' direction, from [firstRow][firstColumn] position (which is [0][0] at start).
	 * 1.2) When the direction is 'Right'; it prints numbers of firstRow from firstColumn to lastColumn.
	 * 1.3) When it reaches the lastColumn; it increments firstRow by 1 in order to not meet this row again and changes the direction to 'Down'.
	 * 2.1) When the direction is 'Down'; it prints numbers of lastColumn from firstRow to lastRow.
	 * 2.2) When it reaches the lastRow; it decrements lastColumn by 1 in order to not meet this column again and changes the direction to 'Left'.
	 * 3.1) When the direction is 'Left'; it prints numbers of lastRow from lastColumn to firstColumn.
	 * 3.2) When it reaches the firstColumn; it decrements lastRow by 1 in order to not meet this row again and changes the direction to 'Up'.
	 * 4.1) When the direction is 'Up'; it prints numbers of firstColumn from lastRow to firstRow.
	 * 4.2) When it reaches the firstRow; it increments firstRow by 1 in order not to meet this column again and changes the direction to 'Right'.
	 * 5.1) It goes item 1.2) and keeps iteration until firstRow meets LastRow and firstColumn meets lastColumn.
	 * Time Complexity of this algorithm is O(RC) where R is the number of Rows and C is the number of Columns. It goes each cell only once, shrinks the 2D array at each direction moves.
	 * Space Complexity of this algorithm is O(1), since it use constant amount of variables in order to handle positions and directions.
	 * 
	 * @param nums 2D array of integer numbers
	 */
	private static void helicalPrintArray(int[][] nums) {
		if(nums.equals(null) || nums.length == 0 || nums[0].length == 0)
			return;
		int numberOfRows = nums.length;
		int numberOfColumns = nums[0].length;
		int firstRow = 0;
		int firstColumn = 0;
		int lastRow = numberOfRows-1;
		int lastColumn = numberOfColumns-1;
		
		Character direction = 'R';
		while (firstRow <= lastRow && firstColumn <= lastColumn) {
			if(direction.equals('R')) {
				for (int i = firstColumn; i <= lastColumn; i++) {
					System.out.print(nums[firstRow][i] + ",");
				}
				firstRow++;
				direction = 'D';
			} else if (direction.equals('D')) {
				for (int i = firstRow; i <= lastRow; i++) {
					System.out.print(nums[i][lastColumn] + ",");
				}
				lastColumn--;
				direction = 'L';
			} else if (direction.equals('L')) {
				for (int i = lastColumn; i >= firstColumn; i--) {
					System.out.print(nums[lastRow][i] + ",");
				}
				lastRow--;
				direction = 'U';
			} else if (direction.equals('U')) {
				for (int i = lastRow; i >= firstRow; i--) {
					System.out.print(nums[i][firstColumn] + ",");
				}
				firstColumn++;
				direction = 'R';
			}
		}
		
	}
}
