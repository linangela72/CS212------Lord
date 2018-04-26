import java.io.File;
import javax.swing.*;

public class ListLargestFiles {
	public static File largestFile = null;//largestFile
	public static long largestFileLength = 0; //length of largest file
	
	public static void main(String[] args) {
        JFileChooser fd = new JFileChooser();
//        mode - the type of files to be displayed:
//            * JFileChooser.FILES_ONLY
//            * JFileChooser.DIRECTORIES_ONLY
//            * JFileChooser.FILES_AND_DIRECTORIES 
        fd.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fd.showOpenDialog(null);
		File f = fd.getSelectedFile();
		listFiles(f);

		System.out.println("Largest file: "+largestFile.getAbsolutePath());
		System.out.println("Largest file length (in bytes): "+ largestFileLength);
	}
	public static void listFiles(File dir) {
		File files[] = dir.listFiles();
		
		if(files!=null) {
			for(int i=0; i<files.length;i++) {
				File currentFile = files[i];
				if(currentFile.isDirectory()) {
					listFiles(currentFile);
				}
				else if(currentFile.length()>largestFileLength) {
					largestFile = currentFile;
					largestFileLength = currentFile.length();
				}
			}
		}
		
	}
}
