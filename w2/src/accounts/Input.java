package accounts;

//import java.util.Scanners;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;

public class Input{
	/*private static ObjectOutputStream output; // outputs data to file
	public static void main(String[] args){
		openFile();
		
		addRecords();
		closeFile();
	}

	// open file clients.ser
	public static void openFile(){
		try{
			Path p  = Paths.get("clients.txt");
    		    output = new ObjectOutputStream(
			Files.newOutputStream(p));

		}catch (IOException ioException){
		    System.err.println("Error opening file. Terminating.");
		    System.exit(1); // terminate the program
		  }
	}
	// add records to file
		public static void addRecords(){
			Scanner input = new Scanner(System.in);
	          System.out.printf("%s%n%s%n","","",
		"Enter account number, first name, last name and balance.",
		"Enter end-of-file indicator to end input.");
		
		while (input.hasNext()) // loop until end-of-file indicator
		{
		   try{
			// create new record; this example assumes valid input
			Accounts record = new Accounts(input.nextInt(),
				input.next(), input.next(), input.nextDouble());

			//serialize record object into file
			output.writeObject(record);
		     }catch (NoSuchElementException elementException){
			System.err.println("Invalid input. Please try again.");
			input.nextLine(); // discard input so user can try again
			}catch (IOException ioException){
			System.err.println("Error writing to file. Terminating.");
				break;
			} System.out.print(" ");
		}
	     }
		// close file and terminate application
		public static void closeFile(){
			try{
			    if (output != null)
			      output.close();} catch (IOException ioException){
			    		 System.err.println("Error closing file. Terminating.");
			        }
			     }
*/
	
/*	
	private static ObjectOutputStream output; // outputs data to file
	public static void main(String[] args){
		openFile();
		addRecords();
		closeFile();
	}

	// open file clients.ser
	public static void openFile(){
		try{
			Path p = Paths.get("cli.txt");
    		    output = new ObjectOutputStream(
			Files.newOutputStream(p));

		}catch (IOException ioException){
		    System.err.println("Error opening file. Terminating.");
		    System.exit(1); // terminate the program
		  }
	}

	
	
	// add records to file
	public static void addRecords(){
		Scanner input = new Scanner(System.in);
          System.out.printf("%s%n%s%n? ",
	"Enter account number, first name, last name and balance.",
	"Enter end-of-file indicator to end input.");
	
	while (input.hasNext()) // loop until end-of-file indicator
	{
	   try{
		// create new record; this example assumes valid input
		Accounts record = new Accounts(input.nextInt(),
			input.next(), input.next(), input.nextDouble());

		//serialize record object into file
		output.writeObject(record);
	     }catch (NoSuchElementException elementException){
		System.err.println("Invalid input. Please try again.");
		input.nextLine(); // discard input so user can try again
		}catch (IOException ioException){
		System.err.println("Error writing to file. Terminating.");
			break;
		} System.out.print("? ");
	}
     }
	// close file and terminate application
	public static void closeFile(){
		try{
		    if (output != null)
		      output.close();} catch (IOException ioException){
	
	
	 System.err.println("Error closing file. Terminating.");
}
}
*/
	
	
private static ObjectOutputStream output; // outputs data to file
	
	public static void main(String[] args){
		openFile();
		addRecords();
		closeFile();
		System.out.println("task finished");
		return;
	}

	// open file clients.ser
	public static void openFile(){
		try{
    		output = new ObjectOutputStream(
			Files.newOutputStream(Paths.get("clients.ser")));

		}catch (IOException ioException){
		    System.err.println("Error opening file. Terminating.");
		    System.exit(1); // terminate the program
		  }
	}

	
	// add records to file
	public static void addRecords(){
		Scanner input = new Scanner(System.in);
	    System.out.printf("%s%n%s%n? ",
		"Enter account number, first name, last name and balance.",
		"Enter end-of-file indicator to end input.");
		
		while (input.hasNext()) // loop until end-of-file indicator
		{
		   try{
			// create new record; this example assumes valid input
			Accounts record = new Accounts(input.nextInt(), input.next(), input.next(), input.nextDouble());
			
			System.out.println(record.getAccount());
			System.out.println(record.getFirstName());
			System.out.println(record.getLastName());
			System.out.println(record.getBalance());

			//serialize record object into file
			output.writeObject(record);
			
		    }catch (NoSuchElementException elementException){
		    	System.err.println("Invalid input. Please try again.");
				input.nextLine(); // discard input so user can try again
			}catch (IOException ioException){
				System.err.println("Error writing to file. Terminating.");
				System.err.println(ioException);
				break;
			} System.out.print("? ");
		}
	}
	
	// close file and terminate application
	public static void closeFile(){
		try{
			if (output != null)
				System.out.println("end of file");
				output.close();
			}catch (IOException ioException){	 
					System.err.println("Error closing file. Terminating.");
		    }
	}

}
