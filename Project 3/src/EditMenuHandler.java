import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

	public class EditMenuHandler implements ActionListener  {
		   JFrame jframe;
		private Date212 d;
		   public EditMenuHandler (JFrame jf) {
		      jframe = jf;
		   }
		   public void actionPerformed(ActionEvent event) {
		      String menuName = event.getActionCommand();
		      String input = null;
		      if (menuName.equals("Insert")) {
		         input = JOptionPane.showInputDialog("insert date in the format yyyymmdd: "); 
		      
		      try {
		    	  d = new Date212(input);
		    	  DateGUI.sorted.append(d);
		    	  DateGUI.unsorted.append(d);
		      }
		      catch(Date212Exception d) {
		    	  System.out.println("Date: "+ d );
		    	  JOptionPane.showMessageDialog(null, d);
		      }
		      
		    
		      }
		   } //actionPerformed
		
		
	}
