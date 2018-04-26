import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FileMenuHandler implements ActionListener {
   DateGUI dGUI;
   public FileMenuHandler (DateGUI d){
      dGUI = d;
   }
   
   public void actionPerformed(ActionEvent event) {
      String menuName = event.getActionCommand();
      if (menuName.equals("Open")) 
    	  	openFile();
       else if (menuName.equals("Quit"))
           System.exit(0);
   } //actionPerformed

   private void openFile() {
	   JFileChooser fd = new JFileChooser();
	   fd.setFileSelectionMode(JFileChooser.FILES_ONLY);
	   fd.showOpenDialog(null);
	   File f = fd.getSelectedFile();
	   readFile(f);
}

   private void readFile(File f) {
	  
		TextFileInput inFile = new TextFileInput(f.toString());
		String line = inFile.readLine();
		while(line != null) {
			try {
				Date212 d = new Date212(line);
				dGUI.sorted.append(d);
				dGUI.unsorted.append(d);
			}
			catch(Date212Exception d){
				System.out.println("Date: "+ d );
				JOptionPane.showMessageDialog(null, d);
			}
			finally {
				line = inFile.readLine();
			}
			dGUI.displaySorted();
			dGUI.displayUnsorted();
		}
		
   }
}