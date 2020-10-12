package com.jay.assorted;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {

	public static void main(String[] args) {
		
		File file = new File("src/main/java/testFile.txt");
			FileWriter fw;
			try {
				fw = new FileWriter(file);
				fw.write("Hello World 4!!!");
				fw.close();
				
				displayFile(file);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	private static void displayFile(File file) throws IOException {
//		FileInputStream fis = new FileInputStream(file);
//		
//		int content;
//		while ((content = fis.read()) != -1) {
//			System.out.print((char) content);
//		}
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}

}
