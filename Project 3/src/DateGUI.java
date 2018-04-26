import java.awt.GridLayout;
import javax.swing.*;

public class DateGUI extends JFrame{
	static DateList sorted,unsorted;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5716566116492930114L;

	public DateGUI(UnsortedDateList list1, SortedDateList list2) {
		createAndShowGUI(list1, list2);
	}

	private void createAndShowGUI(UnsortedDateList unsorted, SortedDateList sorted) {
		//Create and set up the window
        JFrame frame = new JFrame("Dates");
        frame.setSize( 500,500);
        frame.setLocation(200,200);
        frame.setLayout(new GridLayout(1,2));//1=row 2=col
        CreateFileMenu();
        frame.setJMenuBar(getJMenuBar());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
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

	private void CreateFileMenu() {
		//create JMenuBar
        JMenuItem item;
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		
		FileMenuHandler fmh = new FileMenuHandler(this);
		
		item = new JMenuItem("Open");
		item.addActionListener(fmh);
		fileMenu.add(item);
		
		fileMenu.addSeparator();
		
		item = new JMenuItem("Quit");
		item.addActionListener(fmh);
		fileMenu.add(item);
		
		JMenu editMenu = new JMenu("Edit");
		EditMenuHandler emh = new EditMenuHandler(this);
		
		item = new JMenuItem("Insert");
		item.addActionListener(emh);
		editMenu.add(item);
		
		setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		//End of JMenuBar
		
	}
	
}



