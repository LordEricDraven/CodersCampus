package com.coderscampus.lesson10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOExample {

	public static void main(String[] args) {

		BufferedReader fileReader = null;
		
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			
			String line;
			while ((line = fileReader.readLine()) != null) {
				System.out.println(line);
			}
			
//			System.out.println(fileReader.readLine());
//			System.out.println(fileReader.readLine());
//			System.out.println(fileReader.readLine());
//			System.out.println(fileReader.readLine());
//			System.out.println(fileReader.readLine());
//			System.out.println(fileReader.readLine());
//			System.out.println(fileReader.readLine());
//			System.out.println(fileReader.readLine());
//			System.out.println(fileReader.readLine());
		} catch (FileNotFoundException e) {
			System.out.println("Oops, file not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Oops, there was some sort of I/O problem");
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Closing file reader");
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
