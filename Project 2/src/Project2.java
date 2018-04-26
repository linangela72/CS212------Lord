import java.util.StringTokenizer;

public class Project2 {
	public static String filename="Date.txt";
	
	public static void main(String[] args) {
		
		SortedDateList sorted = new SortedDateList();//makes sorted List
		UnsortedDateList unsorted = new UnsortedDateList();//makes unsorted List
		
		inputFromFile(filename, sorted, unsorted);//imports files
		new DateGUI(unsorted,sorted);//creates GUI
	}//main

	private static void inputFromFile(String name, SortedDateList sorted, UnsortedDateList unsorted) {
		TextFileInput inFile = new TextFileInput(name);
		
		String line = inFile.readLine();
		while(line != null) {
			StringTokenizer myTokens = new StringTokenizer(line, ",");
			while(myTokens.hasMoreTokens()) {
				String temp = myTokens.nextToken();
				Date212 d = new Date212(temp);
				sorted.sort(d);
				unsorted.add(d);
			}//end of second while 
			line = inFile.readLine();
		}//end of first while
		inFile.close();
	}//inputFromFile
	
}//Project 2
