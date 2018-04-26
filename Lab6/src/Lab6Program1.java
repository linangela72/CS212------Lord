import java.util.Arrays;

import javax.swing.*;

public class Lab6Program1 {
	
	public static void main(String[] args) {

		int[] numArray = new int[100];
		int count = inputFromFile(args[0], numArray);
		
		numArray = Arrays.copyOfRange(numArray, 0, count);
		
        JOptionPane.showMessageDialog(null,  "The sum of all numbers is: " + sum(numArray, count) + '\n' + "The average of all numbers is: " + average(numArray, count));

	} //main
	
	public static int sum (int[] numArray, int count) {
		int arraySum=0;
			for(int i=0;i<count;i++) {
				arraySum+=numArray[i];
			}
		return arraySum;
	}//sum
	public static int average(int[] numArray, int count) {
		int arrayAvg;
			arrayAvg=sum(numArray,count)/count;
		return arrayAvg;
	}//average
	private static int inputFromFile(String filename, int[] numbers){
		   TextFileInput in = new TextFileInput(filename); 
		   int lengthFilled = 0; 
		   String line = in.readLine();
		   while ( lengthFilled < numbers.length && line != null ) {
		      numbers[lengthFilled++] = Short.parseShort(line);
		      line = in.readLine(); 
		   } // while 

		   if ( line != null ) {
		      System.out.println("File contains too many numbers.");
		      System.out.println("This program can process only " +
		                          numbers.length + " numbers.");
		      System.exit(1); 
		    } // if 
		   in.close(); 
		   return lengthFilled; 
		} // method inputFromFile 
} // class Lab6Program1
