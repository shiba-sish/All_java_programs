package file_handling;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class O4_Renaming_filename {

	public static void main(String[] args) {
	 try{
	 File oldname = new File("C:/Users/Administrator/Desktop/java_selenium_programs/core_java_programs/notes/filehandlingnotes.txt");
			 
	 // new name
	File newname = new File("C:/Users/Administrator/Desktop/java_selenium_programs/core_java_programs/notes/corejavanotes.txt");

             boolean result =  oldname.renameTo(newname);
             
             if(result){
            	 System.out.println("file name changed successfully");
             }
             else{
            	 System.out.println("Unable to change the name of the file");
             }
		 }
		 catch(Exception ex){
			 ex.printStackTrace();
			 System.out.println("File not written");
		 }
	}
}