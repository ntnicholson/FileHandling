package filehandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileMain {

	public static final String TESTFILE = "FILE.txt";
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		List<String> fileContent = new ArrayList<>();
		String choice = "0";
		
		System.out.println("Select an option: ");
		FileHandling.SystemOptions();
		
		choice = in.nextLine();
		
		while (choice != "5") 
		{
			switch (choice) {
			case "1":
				FileHandling.ReadFile(TESTFILE, fileContent);
				break;
			case "2":
				FileHandling.DisplayFile(TESTFILE);
				break;
			case "3":
				
				FileHandling.AppendFile(TESTFILE);
				break;	
			}
			
			FileHandling.SystemOptions();
			choice = in.nextLine();
		}

	}

}
