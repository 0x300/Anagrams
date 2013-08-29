import java.io.*;
import java.util.Scanner;

public class InputHelper {
	private Scanner scanner;
	
	//default constructor
	public InputHelper() {}
	
	//construct with name of file
	public InputHelper(File file) {
		try {
			scanner = new Scanner(file);
		}
		catch(IOException ioe) {
			System.err.println(ioe.getMessage());
		}
	}
}
