package com.account;

//import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import account.Account;
import account.AccountDAOImpl;

public class TestLoadAccount {
	public static void main(String[] args) throws Exception {
		String fileName="D:\\Account.txt";
		

		AccountDAOImpl daoImpl = new AccountDAOImpl();
		
		Path path=Paths.get(fileName);
		List<String> lines=Files.readAllLines(path);
		for(String line:lines) {
			System.out.println(line);
			
			String[] row=line.split(",");
			Integer accNo= Integer.parseInt(row[0]);
			String accType=row[1];
			int availableBalance=Integer.parseInt(row[2]);
			int customerId=Integer.parseInt(row[3]);
			
			
			Account account=new Account();
			account.setAccNo(accNo);
			account.setAccType(accType);
			account.setAvailableBalance(availableBalance);
			account.setCustomerId(customerId);
			//System.out.println(branch);
			
			daoImpl.addAccount(account);

	}
		daoImpl.displayAcc();


	}

}
