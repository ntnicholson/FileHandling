package filehandling;

import java.util.ArrayList;
import java.util.List;

public class FileMain {

	public static final String TESTFILE = "FILE.txt";
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> fileList = new ArrayList<>();
		
		//Get user's file path or use default file
		//
		FileHandling.ReadFile(TESTFILE, fileList);
		


	}

}
