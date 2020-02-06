package com.branch;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class TestReadBranch {

	public static void main(String[] args) throws IOException {
		Testutil.writeToFile("D:\\employees.txt", "1,ondipudur,covai\n2,sundarapuram,covai");
		Testutil.writeToFile("D:\\departments.txt", "CSE,ECE");
		Testutil.writeToFile("D:\\marks.txt", "60,70");
		
		Testutil.writeToFile("D:\\Branch.txt", "7,ondipudur,covai\n8,sundarapuram,covai");
		//file read
		String fileName="D:\\Branch.txt";
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
