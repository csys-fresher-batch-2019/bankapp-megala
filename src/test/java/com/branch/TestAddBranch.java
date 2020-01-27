package com.branch;

import branch.Branch;
import branch.BranchDAOImpl;

public class TestAddBranch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Branch b1=new Branch();
		b1.setId(1);
		b1.name="Sullur";
		b1.city="coimbatore";
		
		Branch b2=new Branch();
		b2.setId(2);
		b2.name="vandalur";
		b2.city="chennai";
		
		Branch b3=new Branch();
		b3.setId(3);
		b3.name="alwarpet";
		b3.city="chennai";
		
		Branch b4=new Branch();
		b4.setId(4);
		b4.name="ramanadhapuram";
		b4.city="coimbatore";
		
		BranchDAOImpl daoImpl=new BranchDAOImpl();
		daoImpl.addBranch(b1);
		
		BranchDAOImpl daoImpl2=new BranchDAOImpl();
		daoImpl2.addBranch(b2);
		
		BranchDAOImpl daoImpl3=new BranchDAOImpl();
		daoImpl3.addBranch(b3);

		BranchDAOImpl daoImpl4=new BranchDAOImpl();
		daoImpl4.addBranch(b4);


	}


	}

