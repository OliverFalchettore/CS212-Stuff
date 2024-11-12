package lab21;

import java.io.File;
import javax.swing.*;
public class ListFiles {

	public static void main(String[] args) {
        JFileChooser fd = new JFileChooser();
//        mode - the type of files to be displayed:
//            * JFileChooser.FILES_ONLY
//            * JFileChooser.DIRECTORIES_ONLY
//            * JFileChooser.FILES_AND_DIRECTORIES 
        fd.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fd.showOpenDialog(null);
		File f = fd.getSelectedFile();
		//listFiles(f,"");
		ListLargestFile(f);

	}
	
	public static void ListLargestFile(File d) {
		File files[] = d.listFiles();
		
		File f2 = null;
		long large = files[0].length();
		for(int i = 1; i < files.length; i++) {
			if(files[i].length() > large) {
				large = files[i].length();
				f2 = files[i];
			}
		}
		
		System.out.println("Largest File: " + f2.getName() + " " + "Size: " + large);
	}
	
	public static void listFiles(File f, String indent) {
		File files[] = f.listFiles();
		
		for (int i = 0; i<files.length; i++) {
			File f2 = files[i];
			System.out.print(indent+f2.getName());
			System.out.print("...");
			System.out.print(f2.lastModified());
			System.out.print("...");
			System.out.print(f2.length());
			System.out.println();
            if (f2.isDirectory())
                listFiles(f2, indent+"   ");
		}
	}
}
