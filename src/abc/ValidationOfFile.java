package abc;

import java.io.File;
import java.util.Scanner;



public class ValidationOfFile {
	

	
	public static void main(String args[]) throws Throwable {	
		doesFileExist();}
		
		public static void doesFileExist() throws Throwable  {
			
		File f = new File("C:\\\\Users\\\\15719\\\\Selenium3\\\\WordsMeaning\\\\wordmeanings.txt");
	
						
		if (f.exists()) {
			System.out.println("File Exists");
		}else {
			System.out.println("File doesnot exist");}
	
		
		Scanner ui = new Scanner(new File("C:\\Users\\15719\\Selenium3\\WordsMeaning\\wordmeanings.txt"));
		
				 						
	//read until it reaches end of the file pointer	
	while(ui.hasNext()) {
		//read each line on the provided file
		String line = ui.nextLine();
		//split the line with - , this will split string into arrays of size two, index one is word and rest will be the meaning
		String[] lineArray  = line.split("-");
		//word is the first value of the lineArray
		String word = lineArray[0];
		//print the word
		System.out.println(word);
		//meaning is the next value of lineArray
		String meaning = lineArray[1];
		//we wanted to print meaning in each line, so lets split that with commas
		String[] meaningArray = meaning.split(",");
		//print the meaning in each line from meaningArray
		for(String mean: meaningArray) {
			System.out.println(mean);
		}
		  			
	}
		}	
}
		
	
		
		
		
		
		
		
		

	

		
		
		
		
		
		
		
		
		
	


