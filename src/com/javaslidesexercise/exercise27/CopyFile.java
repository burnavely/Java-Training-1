package com.javaslidesexercise.exercise27;

import java.io.*;
public class CopyFile {

	public static void main(String[] args) throws IOException{
		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader("C:\\Users\\xx\\Desktop\\Testing\\input.txt");
			out = new FileWriter("C:\\Users\\xx\\Desktop\\Testing\\newfolder\\output.txt");
			
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
		}finally {
			if(in != null) {
				in.close();
			}
			if (out!= null) {
				out.close();
			}
		}

	}

}
