import javax.swing.*;
import java.awt.*;
public class Lab12{
   
   static TextFileInput inFile;
   static String inFileName ="numbers.txt";
   static JFrame myFrame;
   static Container cPane;
   static TextArea even, odd;
   
   public static void main(String[] args) {
      initialize();
      readNumbersFromFile(inFileName);
      
   }   
   public static void initialize() {
      inFile = new TextFileInput(inFileName);
      even = new TextArea();
      odd = new TextArea();
      myFrame = new JFrame();
      myFrame.setSize(400,400);
      myFrame.setLocation(200, 200);
      myFrame.setTitle("Even and Odd");
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
   }
  public static void readNumbersFromFile(String fileName){
	 myFrame.setLayout(new GridLayout(1,2));
	 cPane = myFrame.getContentPane();
	 cPane.add(even);
	 cPane.add(odd);
	 
     String line;
     line = inFile.readLine();
     while (line != null) {
          int num = Integer.parseInt(line);
          if(num%2==0) {
        	  	even.append(num+"\n");
          }
          else {
        	  odd.append(num+"\n");
          }
          line = inFile.readLine();
       } //while
     myFrame.setVisible(true);
   } //readSSNsFromFile
} //SSN

