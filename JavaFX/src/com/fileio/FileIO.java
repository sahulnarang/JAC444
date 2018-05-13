package com.fileio;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.*;

public class FileIO {
	   private static ObjectOutputStream output;
	   private JFrame mainFrame;
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel;

	   public FileIO(){
	      prepareGUI();
	   }
	   public static void main(String[] args){
	      FileIO swingControlDemo = new FileIO();  
	      swingControlDemo.showEventDemo();       
	   }
	   private void prepareGUI(){
	      mainFrame = new JFrame("Accounts");
	      mainFrame.setSize(400,400);
	      mainFrame.setLayout(new GridLayout(3, 1));

	      headerLabel = new JLabel("",JLabel.CENTER );
	      statusLabel = new JLabel("",JLabel.CENTER);        
	      statusLabel.setSize(350,100);
	      
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	      controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout());

	      mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.add(statusLabel);
	      mainFrame.setVisible(true);  
	   }
	   void showEventDemo(){
	      headerLabel.setText("Control in action: Button"); 
	      JLabel  Account= new JLabel("Account: ", JLabel.RIGHT);
	      JLabel  FirstName= new JLabel("Fname: ", JLabel.CENTER);
	      JLabel  LastName= new JLabel("Lname: ", JLabel.LEFT);
	      JLabel  Balance= new JLabel("Balance: ", JLabel.LEFT);
	      JButton submitButton = new JButton("Submit");
	      JButton cancelButton = new JButton("Cancel");
	      final JTextField AccText = new JTextField(6);
	      final JTextField FNameText = new JTextField(6);      
	      final JTextField LNameText = new JTextField(6);
	      final JTextField BalText = new JTextField(6);      

	      
	      submitButton.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {     
	        	  if(validateFields()) {     		  
	        		  openFile();
	        			addRecord();
	        			closeFile();
	        			
	        		             
	             statusLabel.setText("data has been added");  
	             AccText.setText("");
		     		FNameText.setText("");
		     		LNameText.setText("");
		     		BalText.setText("");
	             
	        	  }
	        	  
	          }
	          
	          public void openFile() {
	  			// TODO Auto-generated method stub
	  		try{
	  			Path p  = Paths.get("sarthak.txt");
	     		    output = new ObjectOutputStream(Files.newOutputStream(p));
	  		}catch (IOException ioException){
	  		    System.err.println("Error opening file. Terminating.");
	  		    System.exit(1); // terminate the program
	  		  }

	  	}

	          
	          public void addRecord() {
	        	  double var= Double.parseDouble(BalText.getText());
	        	  int var2 = Integer.parseInt(AccText.getText());
	        	  Accounts record =  new Accounts (var2,FNameText.getText(), LNameText.getText(), var2 );
	        	  
	        	  try {
					output.writeObject(record);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	          }
	          
	          public  void closeFile(){
	      		try{
	      			if (output != null)
	      				//System.out.println("end of file");
	      				output.close();
	      			}catch (IOException ioException){	 
	      					//System.err.println("Error closing file. Terminating.");
	      		    }
	      	}
	          

			public boolean validateFields() {
				// TODO Auto-generated method stub
				
				boolean validint = !validateInteger(AccText, "Please Enter an integer value in Account");
				boolean validfield = !validateField(FNameText, "Please Enter a first Name");
				boolean validfield2 = !validateField(LNameText, "Please Enter a Last Name");
				boolean validdouble = !validatedouble(BalText, "Please Enter a double amount in balance");
				
				
				if ( validint)
				{
					if (validfield)
					{
						if(validfield2)
						{
							if (validdouble)
							{
								return false;
							}
							else
							{   return false;}
						}
						else
						{   return false;}
					}
					else
					{   return false;}
				}

					
				
				else 
					return true;
				
			}

			private boolean validateField(JTextField f, String str) {
				// TODO Auto-generated method stub
				if(f.getText().equals(""))
		    		  return failedMessage(f,str);
		    	  else 
		    		  return true;
			}
			
			public boolean validateInteger( JTextField f, String errormsg )
			{
			  try
			  {  // try to convert input to integer
			    int i = Integer.parseInt(f.getText());

			    // input must be greater then 0
			    // if it is, success
			    if ( i > 0 )
			      return true; // success, validation succeeded
			   }
			   catch(Exception e)
			   {
			      // if conversion failed, or input was <= 0,
			      // fall-through and do final return below
			   }
			   return failedMessage( f, errormsg );
			}
			
			public boolean validatedouble( JTextField f, String errormsg )
			{
			  try
			  {  // try to convert input to integer
			    double i = Double.parseDouble(f.getText());

			    // input must be greater then 0
			    // if it is, success
			    if ( i > 0.0 )
			      return true; // success, validation succeeded
			   }
			   catch(Exception e)
			   {
			      // if conversion failed, or input was <= 0,
			      // fall-through and do final return below
			   }
			   return failedMessage( f, errormsg );
			}
			

			private boolean failedMessage(JTextField f, String str) {
				// TODO Auto-generated method stub
				
				JOptionPane.showMessageDialog(null, str); // give user feedback
				  f.requestFocus(); // set focus on field, so user can change
				  return false; 
			}

			
	       });
	      
	      
	      
	      cancelButton.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e) {
	    		  String data = "Cancelled"; 
	    		  statusLabel.setText(data);
	    	  }
	      });

	      controlPanel.add(Account);
	      controlPanel.add(AccText);
	      
	      controlPanel.add(FirstName);
	      controlPanel.add(FNameText);
	      
	      controlPanel.add(LastName);
	      controlPanel.add(LNameText);
	      
	      controlPanel.add(Balance);
	      controlPanel.add(BalText);
	      
	      controlPanel.add(submitButton);
	      controlPanel.add(cancelButton);       

	      mainFrame.setVisible(true);  
	   }
	   
	   
	   
//	protected void openFile() {
//			// TODO Auto-generated method stub
//		try{
//			Path p  = Paths.get("clients.txt");
//   		    output = new ObjectOutputStream(Files.newOutputStream(p));
//		}catch (IOException ioException){
//		    System.err.println("Error opening file. Terminating.");
//		    System.exit(1); // terminate the program
//		  }
//
//	}

		
//	protected void addRecords() {
		
		//Accounts record = new Accounts(AccText.getText(),)
		
		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//        System.out.printf("%s%n%s%n","","");
//	
//        
//	while (input.hasNext()) // loop until end-of-file indicator
//	{
//	   try{
//		// create new record; this example assumes valid input
//		Accounts record = new Accounts(input.nextInt(),
//			input.next(), input.next(), input.nextDouble());
//
//		//serialize record object into file
//		output.writeObject(record);
//	     }catch (NoSuchElementException elementException){
//		System.err.println("Invalid input. Please try again.");
//		input.nextLine(); // discard input so user can try again
//		}catch (IOException ioException){
//		System.err.println("Error writing to file. Terminating.");
//			break;
//		} System.out.print(" ");
//	}
//	}
	
	
	
//	protected void closeFile() {
//		// TODO Auto-generated method stub
//		try{
//		    if (output != null)
//		      output.close();} catch (IOException ioException){
//		    		 System.err.println("Error closing file. Terminating.");
//		        }
//
//	}
	
	//////////////////////////
		   
}
