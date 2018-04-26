public class Lab25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 3, 5, 9, 4, 10, 33, 12, 19, 4, 16, 23, 30 };
		int[] intArray1 = { 1, 2, 4, 5, 5, 6, 7, 8, 9, 100 };

		System.out.println(largest(intArray, 0));
		System.out.println(sum(intArray, 0));
		System.out.println(isSorted(intArray, 0));
		System.out.println(isSorted(intArray, 8));
		System.out.println(isSorted(intArray1, 0));
	}

	public static int largest(int[] myArray, int index) {
		if(index == myArray.length-1) {
			return myArray[index];
		}
		int max = largest(myArray,index+1);
		if(myArray[index]>max) {
				return myArray[index];
		}
		return max;
	}

	public static int sum(int[] myArray, int index) {
		if(index==myArray.length-1) {
			return myArray[index];
		}
		return myArray[index]+sum(myArray, index+1);
	}

	public static boolean isSorted(int[] myArray, int index) {
		if(index==myArray.length-1) {
			return true;
		}
		if(myArray[index]>myArray[index+1]) {
			return false;
		}
		return isSorted(myArray,index+1);
	}

}