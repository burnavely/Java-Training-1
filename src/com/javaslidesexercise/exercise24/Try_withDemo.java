package com.javaslidesexercise.exercise24;


import java.io.FileReader;
import java.io.IOException;
public class Try_withDemo {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("D://file.txt")){
			char[] a = new char [50];
			fr.read(a);
			for (char c : a)
				System.out.print(c);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
