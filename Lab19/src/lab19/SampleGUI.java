package lab19;

import javax.swing.*;
import java.awt.*;



public class SampleGUI extends JFrame {
   private JMenuBar menuBar;  
   public SampleGUI(String title, int height, int width) {
	    setTitle(title);
	    setSize(height,width);
       setLocation  (400,200);
       menuBar  = new JMenuBar();
	    createFileMenu();
	    createEditMenu();
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
   } //SSNGUI

   private void createFileMenu( ) {
      JMenuItem   item;
      JMenu       fileMenu = new JMenu("File");
     
      FileMenuHandler fmh  = new FileMenuHandler(this);
      
 
      

      item = new JMenuItem("Open");    //Open...
      item.addActionListener( fmh );
      fileMenu.add( item );

      fileMenu.addSeparator();           //add a horizontal separator line
    
      item = new JMenuItem("Quit");       //Quit
      item.addActionListener( fmh );
      fileMenu.add( item );

      setJMenuBar(menuBar);
      menuBar.add(fileMenu);
    
   } //createMenu
   
   private void createEditMenu( ) {
	  JMenuItem item;
      JMenu       fileMenu = new JMenu("Edit");
      
      EditMenuHandler fmh  = new EditMenuHandler(this);
      
 
      

      item = new JMenuItem("Find");    //Open...
      item.addActionListener( fmh );
      fileMenu.add( item );

      fileMenu.addSeparator();           //add a horizontal separator line
    
      item = new JMenuItem("Replace");       //Quit
      item.addActionListener( fmh );
      fileMenu.add( item );

      setJMenuBar(menuBar);
      menuBar.add(fileMenu);
	    
   }

} //SSNGUI
