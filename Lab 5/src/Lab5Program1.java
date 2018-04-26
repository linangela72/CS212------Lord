import java.util.Arrays;

import javax.swing.*;

public class Lab5Program1 {

	public static void main(String[] args) {
	
		//String[] wordArray = { "hello", "goodbye", "cat", "dog", "red", "green", "sun", "moon" };
		String[] wordArray = new String[100];
		int count = inputFromFile(args[0], wordArray);
		wordArray = Arrays.copyOfRange(wordArray, 0, count);
		
		String isOrIsNot, inputWord;
			
		// This line asks the user for input by popping out a single window
		// with text input
		while(true) {
		inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
		if(inputWord.equals("STOP")) System.exit(0);
		// if the inputWord is contained within wordArray return true
		if (wordIsThere(inputWord, wordArray)) 
			isOrIsNot = "is"; // set to is if the word is on the list
		else
			isOrIsNot = "is not"; // set to is not if the word is not on the list
		
		// Output to a JOptionPane window whether the word is on the list or not
		JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
		}
	} //main

	public static boolean wordIsThere(String findMe, String[] theList) {
		for (String word: theList) {
			if(findMe.equals(word)) {
				return true;
			}
		}
		return false;
	} // wordIsThere
	private static int inputFromFile(String filename, String[] wordArray){
		   TextFileInput in = new TextFileInput(filename); 
		   int lengthFilled = 0; 
		   String line = in.readLine();
		   while ( lengthFilled < wordArray.length && line != null ) {
		      wordArray[lengthFilled++] =line;
		      line = in.readLine(); 
		   } // while 

		   if ( line != null ) {
		      System.out.println("File contains too many numbers.");
		      System.out.println("This program can process only " +
		                          wordArray.length + " numbers.");
		      System.exit(1); 
		    } // if 
		   in.close(); 
		   return lengthFilled; 
		} // method inputFromFile 
} // class Lab5Program1
