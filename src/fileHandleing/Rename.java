package fileHandleing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Rename {

	public static void main(String[] args) throws IOException {
		try {
		File newFolder= new File("C:\\Users\\Shibasish China\\eclipse-workspace\\project_001\\data/javanotes/java.txt");
		File newname= new File("C:\\Users\\Shibasish China\\eclipse-workspace\\project_001\\data/javanotes/Newjava.txt");
		boolean result=newFolder.renameTo(newname);
		if(result) {
			System.out.println("file name changed successfully");
		}
		else {
			System.out.println("unable to change the name");
		}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("File not written");
		}
	}
}
