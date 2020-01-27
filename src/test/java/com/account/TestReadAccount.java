package com.account;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.util.List;

import com.branch.Testutil;

public class TestReadAccount {

	public static void main(String[] args) throws IOException{
		
		Testutil.writeToFile("D:\\Account.txt", "1,salaried,10000,3\n4,saving,5000,2");
		//file read
		String fileName="D:\\Account.txt";
		Path path=Paths.get(fileName);
		
		//Read all bytes-read entire file
		byte[] bytes=Files.readAllBytes(path);
		String content=new String (bytes);
		System.out.println(content);
		
		//read lines
//		System.out.println("Read lines");
//		List<String> readAllLines=Files.readAllLines(path);
//		for(String line:readAllLines) {
//			System.out.println(line);
//		}
	}
}