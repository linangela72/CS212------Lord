
public class TwoDimArray {

	//public static int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
	
	public static void main(String[] args) {
		int[][] myArray = fillArray(args[0]);
		printArray(myArray);
		printArrayEven(myArray);		
	}
	private static void printArray (int[][] theArray) {
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				display(theArray[i][j]);
			System.out.println();
		}
		System.out.println();
	}//printArray
	private static void display (int num){
		System.out.print(num+" ");
	}
	private static void printArrayEven(int[][] theArray){
		for (int i=0;i<theArray.length;i++) {
			for(int j=0;j<theArray[i].length;j++) {
				if(theArray[i][j]%2!=0) {
					System.out.print("* ");
				}
				else {
					display(theArray[i][j]);
				}
			}//for j
			System.out.println();
		}//for i
	}//printArrayEven
	public static int[][] fillArray(String myFile){
		TextFileInput input = new TextFileInput(myFile);
        int n = Integer.parseInt(input.readLine());
        int m = Integer.parseInt(input.readLine());
        int[][] integers = new int[n][m];
        for(int i=0; i<n; i++) {
        		for(int j=0; j<m; j++) { 
        			integers[i][j]=Integer.parseInt(input.readLine());
        		}
        }
        return integers;
	}//fillArray
}//TwoDimArray
