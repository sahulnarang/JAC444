package com.fileio;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.text.JTextComponent;

public class OutputJFX {
	
	static ObjectInputStream input;
	static void readin(String fn, JTextComponent pane) {
        try {
            FileReader fr = new FileReader(fn);
            pane.read(fr, null);
            fr.close();
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }

    public static void main(String args[]) {
        final JFrame frame = new JFrame("Accounts");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // set up the text pane, either a JTextArea or JTextPane

        final JTextComponent textpane = new JTextArea();
        //final JTextComponent textpane = new JTextPane();

        // set up a scroll pane for the text pane

        final JScrollPane pane = new JScrollPane(textpane);
        pane.setPreferredSize(new Dimension(600, 600));

        // set up the file chooser

        String cwd = System.getProperty("user.dir");
        final JFileChooser jfc = new JFileChooser(cwd);

        JButton filebutton = new JButton("Choose File");
        filebutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jfc.showOpenDialog(frame) !=
                    JFileChooser.APPROVE_OPTION)
                        return;
                File f = jfc.getSelectedFile();
                String avrr = jfc.getSelectedFile().getAbsolutePath();
                
                
                openfile(avrr);
                addRecord();
                
                
       		 } // end method readRecords

			 void openfile(String f) {
				 try{ // open file
					 
	         		   input = new ObjectInputStream(
	         			Files.newInputStream(Paths.get(f)));
	         		}catch (IOException ioException){
	         			System.err.println("Error opening file.");
	         			System.exit(1);}
	                
				// TODO Auto-generated method stub
				
			}
			 
			 void addRecord() {

	        		try{
	       		     while (true){ // loop until there is an EOFException

	       		 		Accounts record = (Accounts) input.readObject(); 
	       				// display record contents
	       		 		String number = "Account Number = " + Integer.toString(record.getAccount());
	       		 		number += "Named - " + (record.getFirstName());
	       		 		number += " " + record.getLastName();
	       		 		number += ", With Balance Left " + Double.toString(record.getBalance());
       		 	//String data = String.parse(record.getAccount());
//	       		 	, record.getFirstName(),
//   					record.getLastName(), record.getBalance()
	       		 		textpane.setText(number);}
	       				}catch (EOFException endOfFileException) {
	       					//System.out.println("No more records");
	       				}catch (ClassNotFoundException classNotFoundException){
	       				     System.err.println("Invalid object type. Terminating.");
	       				}catch (IOException ioException){
	       				  System.err.println("Error reading from file. Terminating.");
	       				}
			 }
			 
			 void closeFile() {
				 
				 try{
						if (input != null)
							input.close();
					}catch (IOException ioException){
						//System.err.println("Error closing file. Terminating.");
						System.exit(1);
					}
			 }

            
        });

        JPanel buttonpanel = new JPanel();
        buttonpanel.add(filebutton);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add("North", buttonpanel);
        panel.add("Center", pane);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
