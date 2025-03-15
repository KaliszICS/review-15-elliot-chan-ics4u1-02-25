public class PracticeProblem {

	public static void main(String args[]) {
		/*
		System.out.println(goodString("abcdfedree"));
		System.out.println(goodString("abcda"));
		*/
	}
	public static int goodString(String st) {
		char[] array = st.toCharArray();
		int leftNumOfOperations = -1, rightNumOfOperations = -1;
		for(int leftSide = 0; leftSide < array.length && leftNumOfOperations == -1; leftSide++) {
			for(int rightSide = array.length - 1; rightSide >= 0 && leftNumOfOperations == -1; rightSide--) {
				System.out.println((char) array[leftSide] + " compared with " + (char) array[rightSide]);
				if(array[leftSide] == array[rightSide] && leftSide != rightSide) {
					System.out.println("detected! " + (char) array[leftSide] + " compared with " + (char) array[rightSide]);
					System.out.println("right index: " + rightSide + " left index: " + leftSide);
					leftNumOfOperations = leftSide + (array.length - 1 - rightSide);
					break;
					//num of operations is the left index (num of letters until the first common letter from index 0), plus the array length minus the rightIndex minus 1, which is the num of letters until the first common letter from the right side.
				}
			}
			
		} 
		System.out.println("Starting right side");
		// Now, see if there could be a smaller number of operations if we were to swap the orders, where left side letters are compared starting from letters on the right side.
		for(int rightSide = array.length - 1; rightSide >= 0 && rightNumOfOperations == -1; rightSide--) {
			for(int leftSide = 0; leftSide < array.length && rightNumOfOperations == -1; leftSide++) {
				System.out.println((char) array[rightSide] + " compared with " + (char) array[leftSide]);
				if(array[rightSide] == array[leftSide] && rightSide != leftSide) {
					System.out.println("detected! " + (char) array[leftSide] + " compared with " + (char) array[rightSide]);
					System.out.println("right index: " + rightSide + " left index: " + leftSide);
					rightNumOfOperations = leftSide + (array.length - 1 - rightSide);
					//num of operations is the left index (num of letters until the first common letter from index 0), plus the array length minus the rightIndex minus 1, which is the num of letters until the first common letter from the right side.
					break;
				}
			}
		}
		
		if(rightNumOfOperations != leftNumOfOperations)
			return (rightNumOfOperations > leftNumOfOperations ? leftNumOfOperations : rightNumOfOperations);
		else if(rightNumOfOperations == -1)
			return -1;
		else
			return rightNumOfOperations;
	}
	

}
