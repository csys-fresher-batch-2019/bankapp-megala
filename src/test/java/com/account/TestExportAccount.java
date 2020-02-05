package com.account;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import account.Account;
import account.AccountDAOImpl;


public class TestExportAccount {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		AccountDAOImpl daoImpl = new AccountDAOImpl();
		List<Account> displayAcc = daoImpl.displayAcc();
		
		System.out.println("NO of branches:" + displayAcc.size());
		String fileContent = " ";
		//Path path=Paths.get(fileName);
		//List<String> lines=Files.readAllLines(path);
		for(Account account:displayAcc) {
			String line = account.getCustomerId()+","+account.getAccNo()+","+account.getAccType()+","+account.getAvailableBalance();
			
			fileContent = fileContent+line+"\n";
			
	}
		System.out.println(fileContent);
		Path path=Paths.get("D:\\Branch.txt");
		Files.write(path, fileContent.getBytes());
		

}
	}

