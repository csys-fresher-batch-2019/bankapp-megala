package com.branch;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class TestFileWrite {
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Path path=Paths.get("D:\\employee.txt");
		String content="1,Naresh";
		byte[] contentInBytes=content.getBytes();
		Files.write(path,contentInBytes);
		System.out.println("File write completed");
		
	}

}
