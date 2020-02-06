package com.branch;

//import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import branch.Branch;
import branch.BranchDAOImpl;

public class TestLoadBranch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String fileName="D:\\Branch.txt";
		

		BranchDAOImpl daoImpl = new BranchDAOImpl();
		
		Path path=Paths.get(fileName);
		List<String> lines=Files.readAllLines(path);
		for(String line:lines) {
			System.out.println(line);
			
			String[] row=line.split(",");
			Integer id= Integer.parseInt(row[0]);
			String name=row[1];
			String city=row[2];
			
			Branch branch=new Branch();
			branch.setId(id);
			branch.setName(name);
			branch.setCity(city);
			//System.out.println(branch);
			
			daoImpl.addBranch(branch);

	}
		daoImpl.list();

}
			
		}
