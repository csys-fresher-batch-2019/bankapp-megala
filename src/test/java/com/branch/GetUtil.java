package com.branch;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GetUtil{
	public static void GetFileName(String fileName) throws IOException {
		Path path=Paths.get(fileName);
		
		System.out.println("Read lines");
		List<String> readAllLines=Files.readAllLines(path);
		for(String line:readAllLines) {
			System.out.println(line);
		}
	}


}
