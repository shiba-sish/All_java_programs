package file_handling;

import java.io.File;
import java.io.IOException;

public class O1_makingTextFile {

	public static void main(String[] args) throws IOException {
		// making a text file using the File class. 
		File f = 
		new File("C:/Users/Administrator/Desktop/java_selenium_programs/core_java_programs/notes/filehandlingnotes.txt");
		
		
//		boolean result = f.createNewFile();
//		
//		if (result){
//			System.out.println("File Created");
//		}
//		else{
//			System.out.println("File already exists");
//		}
		
		if(!f.exists()){
			f.createNewFile();
			System.out.println("File Created");
		}
		else{
			System.out.println("File already exists");
		}
	}
}