import java.awt.GridLayout;

import javax.swing.*;

public class DateGUI{

	public DateGUI(String[] array1, String[] array2, int size) {
		createAndShowGUI(array1, array2, size);
	}

	private void createAndShowGUI(String[] unsorted, String[] sorted, int size) {
		//Create and set up the window.
        JFrame frame = new JFrame("Dates");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize( 500,500);
        frame.setLocation(200,200);
        frame.setLayout(new GridLayout(1,2));//1=row 2=col

        JTextArea textArea = new JTextArea(5, 20);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane);
        
        textArea.setText("Unsorted: "+"\n");
        //loop to go through the array and display the unsorted list
        for(int i=0; i<size; i++) {
			textArea.append(unsorted[i] + "\n");		
		}
        JTextArea textArea2 = new JTextArea(5, 20);
        textArea2.setEditable(false);
        frame.getContentPane().add(textArea2);
        textArea2.setText("Sorted: "+"\n");
        //loop to go through the array and display the sorted list
        for(int i=0; i<size; i++) {
			textArea2.append(sorted[i] + "\n");			
		}
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
		
	}
	
}



