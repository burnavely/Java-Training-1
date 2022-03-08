package com.javaslidesexercise.exercise23;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadData_Demo {

	public static void main(String[] args) {
		FileReader fr = null;
		
		try {
			File file = new File("C:\\Users\\xx\\Desktop\\Testing\file.txt");
			fr = new FileReader(file); char[] a = new char[50];
			fr.read(a);
			for(char c : a)
				System.out.print(c);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
