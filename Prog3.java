/**************************************************************/
/* Josh Lindoo
/* Login ID: lind6441
/* CS-203, Summer 2013
/* Programming Assignment 3
/* Prog3 class: 
/**************************************************************/

import java.io.*;
import java.util.*;

public class Prog3 {
	//global vars
	public static boolean debug = false; //toggles debug mode
	
	public static long startTime = 0; //start time of algorithm
	public static long endTime = 0; //end time of algorithm
	
	/**************************************************************/
	/* Method: main
	/* Purpose: Control program flow
	/* Parameters:
	/* String[] args: filename or -debug filename
	/* Returns: void
	/**************************************************************/
	public static void main(String[] args) {
		//local vars
		int numArgs = args.length; //number of args
		
		//check arguments
		switch(numArgs) {
			case 1: //arg filename
				
				break;
				
			case 2: //arg -debug flag and filename
				
				//set debug flag
				if(args[0].compareTo("-debug") == 0) debug = true;
				else System.out.println("Error: First parameter must be \"-debug\"");
				
				break;
				
			default: //invalid number of args
				System.out.println("Error: Invalid number of parameters");
				break;
		} //end switch
		
	} //end main()
	
	/**************************************************************/
	/* Method: importData
	/* Purpose: import datafile and save in arrays
	/* Parameters:
	/* String fileName
	/* Returns: void
	/**************************************************************/
	public static void importData(String fileName) {
		Scanner fileScan; //scanner for input file
		
		
	}
	
}