import javax.swing.JOptionPane;

public class Project0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputSentence;
		while(true) {
		inputSentence = JOptionPane.showInputDialog(null, "Enter a Sentence:");
		if(inputSentence.equalsIgnoreCase("Stop")) System.exit(0);
		
		//enter code to calculate number of capital and lower case e's
	
		int lowernum = 0;
		int uppernum = 0; 
		
		for(int i=0;i<inputSentence.length();i++) {
			if (inputSentence.charAt(i)=='e') {
				lowernum++;
			}
			if (inputSentence.charAt(i)=='E') {
				uppernum++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Number of lower case e's: " + lowernum + "\nNumber of upper case E's: " + uppernum);
		
		}//while
	}//main
}//class
