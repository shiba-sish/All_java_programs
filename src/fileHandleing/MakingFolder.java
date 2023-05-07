package fileHandleing;

import java.io.File;

public class MakingFolder {

	public static void main(String[] args)  {
		File newFolder= new File("C:\\Users\\Shibasish China\\eclipse-workspace\\project_001\\data/javanotes/java.txt");
		if(!newFolder.exists()) {
			newFolder.mkdir();
			System.out.println("folder created");
		}
		else {
			System.out.println("folder already created");
		}
	}

}
