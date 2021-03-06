package filehandling;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FileHandling {
	
	public static void SystemOptions() // Give User options
	{
		System.out.println();
		System.out.println("Select an option: ");
		System.out.println();
		System.out.println("1. [ Read File ]");
		System.out.println("2. [ Display File ]");
		System.out.println("3. [ Append File ]");
		System.out.println("5: { Close Application }");
		System.out.println();
	}

	public static void ReadFile(String path, List<String> list) {

		try {
			File f = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String line;
			
			while ((line = br.readLine()) != null) 
			{
				list.add(line); // Store for future use
			}

			br.close();
			System.out.println("Success: File read");

		} catch (IOException e) {
			System.out.println("Failure: Unable to read file.");
		}

	}

	public static void DisplayFile(String path) //
	{
		try {
			File f = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String line;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			br.close();
			System.out.println("Success: File Displayed.");

		} catch (IOException e) {
			System.out.println("Failure: Unable to display file.");
		}
	}
	public static void AppendFile(String path) 
	{
		String appendText = GetAppendText();
		
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(path, true));
			br.newLine();
			br.write(appendText);
			br.close();	
			System.out.println("File appended");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static String GetAppendText() 
	{
		Scanner input = new Scanner(System.in);
		String appendText = null;
		
		System.out.println("Input the text you would liike to add to the file.");
		appendText = input.nextLine();
		
		return appendText;
	}

}
