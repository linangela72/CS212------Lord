import java.awt.GridLayout;


import javax.swing.*;

public class DateGUI{

	public DateGUI(UnsortedDateList list1, SortedDateList list2) {
		createAndShowGUI(list1, list2);
	}

	private void createAndShowGUI(UnsortedDateList unsorted, SortedDateList sorted) {
		//Create and set up the window.
        JFrame frame = new JFrame("Dates");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize( 500,500);
        frame.setLocation(200,200);
        frame.setLayout(new GridLayout(1,2));//1=row 2=col
        
        //create JMenuBar
        JMenuItem item;
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		
		item = new JMenuItem("Open");
		fileMenu.add(item);
		
		fileMenu.addSeparator();
		
		item = new JMenuItem("Quit");
		fileMenu.add(item);
		
		frame.setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		//End of JMenuBar

        JTextArea textArea = new JTextArea(5, 20);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane);
        
        textArea.setText("Unsorted: "+"\n");
        textArea.append(unsorted + "\n");//prints Unsorted List		
        
        JTextArea textArea2 = new JTextArea(5, 20);
        textArea2.setEditable(false);
        frame.getContentPane().add(textArea2);
        
        textArea2.setText("Sorted: "+"\n");
        textArea2.append(sorted + "\n");//prints sorted List	

        //Display the window.
        frame.pack();
        frame.setVisible(true);
		
	}
	
}



