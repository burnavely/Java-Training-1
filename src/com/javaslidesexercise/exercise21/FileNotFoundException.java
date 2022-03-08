package com.javaslidesexercise.exercise21;

import java.io.*;

public class FileNotFoundException {

	public static void main(String[] args) {
		try {
			file = new FileInputStream(fileName);
			x = (byte) file.read();
		}
		catch (IOException i) {
			i.printStackTrace();
			return -1;
		}
		
		catch (FileNotFoundException f) {
			f.printStackTrace();
			return -1;
		}

	}

}
