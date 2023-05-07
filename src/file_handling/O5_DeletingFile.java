package file_handling;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class O5_DeletingFile {

	public static void main(String[] args) {
		 try{
			 File file = 
					 new File("C:/Users/Administrator/Desktop/java_selenium_programs/core_java_programs/notes/filehandlingnotes.txt");
			 
             if(file.exists()){
            	 if(file.delete() == true){
            		 System.out.println("file successfully deleted");
                   }
            	 }
             else{
            	 System.out.println("Unable to delete the file");
             }
		 }
		 catch(Exception ex){
			 ex.printStackTrace();
		 }
	}
}