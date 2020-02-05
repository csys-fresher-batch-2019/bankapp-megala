package com.branch;

//import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import branch.Branch;
import branch.BranchDAOImpl;

public class TestExportBranch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//String fileName="D:\\branch_backup.txt";
		

		BranchDAOImpl daoImpl = new BranchDAOImpl();
		List<Branch> list = daoImpl.list();
		
		System.out.println("NO of branches:"+ list.size());
		String fileContent = "";
		//Path path=Paths.get(fileName);
		//List<String> lines=Files.readAllLines(path);
		for(Branch branch:list) {
			String line =branch.getId()+","+branch.name+","+branch.city;
			
			fileContent = fileContent+line+"\n";
			
	}
		System.out.println(fileContent);
		Path path=Paths.get("D:\\Branch.txt");
		Files.write(path, fileContent.getBytes());
		

}
			
		}
