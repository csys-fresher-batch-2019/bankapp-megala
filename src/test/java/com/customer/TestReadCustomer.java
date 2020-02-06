package com.customer;

import java.io.IOException;

import com.branch.GetUtil;


public class TestReadCustomer {

	public static void main(String[] args) throws IOException {
		Testutil.writeToFile("D:\\customer.txt", "kumudha,265,karur,ondipudur");
		GetUtil.GetFileName("D:\\customer.txt");
		
	}


}