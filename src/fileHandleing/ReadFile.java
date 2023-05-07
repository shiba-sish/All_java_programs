package fileHandleing;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {
//		int num;
//		FileReader fr=null;
//		try {
//			fr=new FileReader("C:\\\\Users\\\\Shibasish China\\\\eclipse-workspace\\\\project_001\\\\data/javanotes/java.txt")
//			while((num=fr.read())!=-1) {
//				System.out.println((char)num);
//			}
//		}
		try {
		File newFolder= new File("C:\\Users\\Shibasish China\\eclipse-workspace\\project_001\\data/javanotes/java.txt");
		Scanner sc= new Scanner(newFolder);
		while(sc.hasNextLine()) {
			String line=sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		}
		
		catch(Exception e){
			e.printStackTrace();
			System.out.println("File not able to read");
		}
	}
}
