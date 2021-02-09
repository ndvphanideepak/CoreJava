package com.FilesBasics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BasicFileOperations {

	public static void main(String[] args) throws IOException    {
		
FileWriter fw = new FileWriter("‪‪sample.txt");
BufferedWriter bw = new BufferedWriter(fw);
String s = "abcdefghijklmnopqrstuvwxyz";
bw.write(s, 5, 20);
		
		bw.close();
		fw.close();
	}
}
