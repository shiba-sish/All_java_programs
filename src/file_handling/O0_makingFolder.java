package file_handling;

import java.io.File;

public class O0_makingFolder 
{
  public static void main(String[] args) {
	File newfolder  =  new File("C:/Users/Administrator/Desktop/java_selenium_programs/core_java_programs/notes/javanotes");
	
	if (!newfolder.exists()){
		newfolder.mkdir();
		System.out.println("folder created");
	}
	else{
		System.out.println("Folder already exists");
	}
 }
}
