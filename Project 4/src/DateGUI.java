import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.*;

public class DateGUI extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	iterator iterator;
	DateList sorted,unsorted;
	Container cPane;
	TextArea unsortedList = new TextArea();
	TextArea sortedList = new TextArea();
	JMenuBar menuBar = new JMenuBar();
	
	public DateGUI(String title) {
		
		//Create and set up the window
        setTitle(title);
        setSize( 500,500);
        setLocation(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        unsorted = new UnsortedDateList();
        sorted = new SortedDateList();
        unsortedList.setEditable(false);
        sortedList.setEditable(false);
        
        cPane = getContentPane();
        cPane.setLayout(new GridLayout(1,2));//1=row 2=col
        cPane.add(unsortedList);
        cPane.add(sortedList);
        
        CreateFileMenu();
     
        
        setVisible(true);
		
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

	public void displaySorted() {
		sortedList.setText("sorted: \n");
		iterator = sorted.reset();
		while(iterator.hasNext())
		sortedList.append(iterator.next()+"\n");
	}

	public void displayUnsorted() {
		unsortedList.setText("unsorted: \n");
		iterator = unsorted.reset();
		while(iterator.hasNext())
		unsortedList.append(iterator.next()+"\n");
	}
	
}



