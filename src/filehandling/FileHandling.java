package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


public class FileHandling {

	public static void ReadFile(String path, List<String> list) {

		try {
			File f = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = br.readLine();
			
			while (line != null) {
				list.add(line);
				line = br.readLine();
			}
			
			br.close();
			System.out.println("Success: File read");
			
		} catch (IOException e) 
		{
			System.out.println("Failure: Unable to read file.");

		}
		
	}
	public static void WriteFile() {

	}

	public static void AppendFile() {

	}

}
