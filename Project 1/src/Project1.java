import java.util.StringTokenizer;

public class Project1 {
	public static String filename="Date.txt";
	
	public static void main(String[] args){
		String[] myArray = new String[100];//for unsorted dates
		String[] myArray2 = new String[100];//for sorted dates
		inputFromFile(filename, myArray2);//inputs data into array2
		int count =  inputFromFile(filename, myArray);	//counts the # of dates
		selectionSort(myArray2, count);//sorts dates in order
		format(myArray2, count);
		new DateGUI(myArray, myArray2, count);//calls on DateGUI class
	}//main
	
	public static String[] format(String[] array, int length) {
		String[] monthName= {"","January","Februray","March","April","May","June","July","August","September","October","November","December"};
		for(int i=0;i<length;i++){
			int year = Integer.parseInt(array[i].substring(0,4));
			int month = Integer.parseInt(array[i].substring(4,6));
			int day = Integer.parseInt(array[i].substring(6,8));
			array[i]=monthName[month] +" "+day+", "+year;
		}
		return array;
	}
	
	public static int inputFromFile(String name, String[] array) {
			TextFileInput inFile = new TextFileInput(name);
			int lengthFilled = 0;
			String line = inFile.readLine();
			while (line != null ) {
				StringTokenizer myTokens = new StringTokenizer(line, ",");
				while(myTokens.hasMoreTokens()) {
					String temp = myTokens.nextToken();//temp = temporary place holder #
						array[lengthFilled]= temp;
						lengthFilled++;
				}//end of second while
				line = inFile.readLine();
			} // end of first while 
			inFile.close(); 
			return lengthFilled;
		}  //inputFromFile

	private static void selectionSort(String[] array, int length) {
			for ( int i = 0; i < length - 1; i++ ) { 
				int indexLowest = i; //set i as lowest
			    	for ( int j = i + 1; j < length; j++ ) {
			    		if ( array[j].compareTo(array[indexLowest]) < 0 ) { //compare array[j] to array[lowest]
							indexLowest = j;//set j lowest if array[j] less than array[lowest]
			    		}//if
			    	}//for j
			    	if ( array[indexLowest] != array[i] ) { 
			    		String temp = array[indexLowest];
			    		array[indexLowest] = array[i]; 
			    		array[i] = temp; 
			    	}//if
			}//for i
	}//selectionSort
	
}//Project1