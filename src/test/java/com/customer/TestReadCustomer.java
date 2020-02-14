package com.customer;

import java.io.IOException;

import com.branch.GetUtil;


public class TestReadCustomer {

	public static void main(String[] args) throws IOException {
		Testutil.writeToFile("D:\\customer.txt", "kumudha,karur,ondipudur,kumudha12");
		GetUtil.GetFileName("D:\\customer.txt");
		
	}


}