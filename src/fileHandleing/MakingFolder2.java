package fileHandleing;

import java.io.File;
import java.io.IOException;

public class MakingFolder2 {

	public static void main(String[] args) throws IOException {
		File newFolder= new File("C:\\Users\\Shibasish China\\eclipse-workspace\\project_001\\data/javanotes/java.txt");
		if(!newFolder.exists()) {
			newFolder.createNewFile();
			System.out.println("folder created");
		}
		else {
			System.out.println("folder already created");
		}
	}

}
