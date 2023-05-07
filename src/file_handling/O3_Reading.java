package file_handling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class O3_Reading {

	public static void main(String[] args) throws IOException {
//		 try{
//			 File f = new File("C:/Users/Administrator/Desktop/java_selenium_programs/core_java_programs/notes/filehandlingnotes.txt");
//			 // reading using the Scanner Class. 
//			 Scanner sc = new Scanner(f);
//			 	while(sc.hasNextLine()){
//			 		String lines = sc.nextLine();
//			 		System.out.println(lines);
//			 	}
//			 	sc.close();
//		 }
//		 catch(Exception ex){
//			 ex.printStackTrace();
//			 System.out.println("File not able to read.");
//		 }
		
		
		// reading using FileReader and character array. 
//		 try{
//			 File f = new File("C:/Users/Administrator/Desktop/java_selenium_programs/core_java_programs/notes/filehandlingnotes.txt");
//                 // make the object of the FileReader class. 
//			 FileReader fr = new FileReader(f);
//			 // make a char array 
//			 char [] ch = new char[1000];
//			 	   fr.read(ch);
//			 		System.out.println(ch);
//			 	fr.close();
//		 }
//		 catch(Exception ex){
//			 ex.printStackTrace();
//			 System.out.println("File not written");
//		 }
		
		
		// reading till the end of the file. 
		int num;
		FileReader fr = null;
		try{
			fr= new FileReader("C:/Users/Administrator/Desktop/java_selenium_programs/core_java_programs/notes/corejavanotes.txt");
			// read from the file. 
			while( (num = fr.read())!= -1){
				System.out.print((char)num);
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}