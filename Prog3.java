/**************************************************************/
/* Josh Lindoo
/* Login ID: lind6441
/* CS-203, Summer 2013
/* Programming Assignment 3
/* Prog3 class: 
/**************************************************************/

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Prog3 {
	public static long startTime = 0; //start time of algorithm
	public static long endTime = 0; //end time of algorithm
	public static HashMap<String, ArrayList<String>> anagrams = new HashMap<String, ArrayList<String>>();
	
	/**************************************************************/
	/* Method: main
	/* Purpose: Control program flow
	/* Parameters:
	/* String[] args: filename
	/* Returns: void
	/**************************************************************/
	public static void main(String[] args) {
		Scanner scanner = null; //scanner for input file
		if(args.length == 1) {
			try {
				scanner = new Scanner(new File(args[0]));
				startTime = System.nanoTime();
				while(scanner.hasNext()) {
					String currWord = scanner.next();
					String sortedWord = alphaLowerSort(currWord);
					ArrayList<String> listAtKey = anagrams.get(sortedWord);
					if(listAtKey == null) {
						listAtKey = new ArrayList<String>();
						anagrams.put(sortedWord, listAtKey);
						listAtKey.add(currWord);
					}
					else {
						if(!listAtKey.contains(currWord.toLowerCase()))
							listAtKey.add(currWord.toLowerCase());
					}
				}
				endTime = System.nanoTime();
				
				String mostAnagramsKey = null;
				int mostAnagramsSize = 0;
				for(Entry<String, ArrayList<String>> entry : anagrams.entrySet()) {
					System.out.println("Anagram(s) at key \"" + entry.getKey() + "\" : " + entry.getValue());
					int numAnagrams = entry.getValue().size();
					
					if(mostAnagramsKey == null) {
						mostAnagramsKey = entry.getKey();
						mostAnagramsSize = entry.getValue().size();
					}
					else if(numAnagrams > anagrams.get(mostAnagramsKey).size()) {
						mostAnagramsKey = entry.getKey();
						mostAnagramsSize = entry.getValue().size();
					}
						
				}
				
				System.out.println("\n-- Runtime Statistics --");
				System.out.println("Number of anagram sets: " + anagrams.size());
				System.out.println("Algorithm Runtime: " + (endTime-startTime)/1000000000.0 + "s");
				System.out.println("Largest set of anagrams: " + anagrams.get(mostAnagramsKey));
			} catch(IOException ioe) {
				System.err.println(ioe.getMessage());
			}
		} else {
			System.err.println("Error: Invalid number of args");
			System.exit(0);
		}
		
	} //end main()
	
	private static String alphaLowerSort(String unsorted) {
		unsorted = unsorted.toLowerCase();
		char[] strChars = unsorted.toCharArray();
		Arrays.sort(strChars);
		return new String(strChars);
	}
}