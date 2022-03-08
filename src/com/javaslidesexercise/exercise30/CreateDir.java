package com.javaslidesexercise.exercise30;

import java.io.*;
public class CreateDir {

	public static void main(String[] args) {
		String dirname = "C:\\Users\\xx\\Desktop\\Testing\\newfolder\\tmp\\user\\java\\bin";
		File d = new File(dirname);
		
		d.mkdirs();

	}

}
