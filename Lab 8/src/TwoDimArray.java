import java.util.StringTokenizer;

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
		String line = input.readLine();
		//tokenizer
		StringTokenizer myTokens=new StringTokenizer(line,",");
		int row = Integer.parseInt(myTokens.nextToken());
		int col = Integer.parseInt(myTokens.nextToken());
		//System.out.println("There are "+myTokens.countTokens()+" tokens in the line.");
		//create 2d array
		int[][] integers = new int[row][col];
		for(int i=0;i<row;i++) {
			String li = input.readLine();
			myTokens = new StringTokenizer(li, ",");
			for(int j=0;j<col;j++) {
				integers[i][j]=Integer.parseInt(myTokens.nextToken());
			}
		}
        return integers;
	}//fillArray
}//TwoDimArray
