package fileHandleing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DeleteFile {

	public static void main(String[] args) throws IOException {
		try {
		File newname= new File("C:\\Users\\Shibasish China\\eclipse-workspace\\project_001\\data/javanotes/Newjava.txt");
		if(newname.exists()) {
			if(newname.delete()==true)
			System.out.println("file deleted successfully");
		}
		else {
			System.out.println("unable to delete the file");
		}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("File not written");
		}
	}
}
