package branch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bank.ConnectionUtil;

public class BranchDAOImpl implements BranchDAO {

	public void addBranch(Branch branch) throws Exception {
		String sql = "insert into branch(branch_id,branch_name,branch_city)values(?,?,?)";
		System.out.println(sql);
		try {
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, branch.getId());
			pst.setString(2, branch.name);
			pst.setString(3, branch.city);

			int rows = pst.executeUpdate();
			System.out.println("no of rows inserted:" + rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Branch> list() throws Exception {
		List<Branch> b = new ArrayList<Branch>();

		String sql = "select branch_id,branch_name,branch_city from branch";
		System.out.println(sql);

		Connection con = ConnectionUtil.getconnection();
		Statement stmt = con.createStatement();
		ResultSet rows = stmt.executeQuery(sql);
		System.out.println("No of rows displyed:"+rows);

		while (rows.next()) {
			int id = rows.getInt("branch_id");
			String name = rows.getString("branch_name");
			String city = rows.getString("branch_city");

//			System.out.println(id);
//			System.out.println(name);
//			System.out.println(city);

			//extracting details from sql
			Branch branch=new Branch();
			branch.setId(id);
			branch.name = name;
			branch.city = city;
			b.add(branch);
		}
		return b;
	}

	public void updateBranch(String name, int id) throws Exception {
		String sql = "update branch set branch_name=? where branch_id=?";
		System.out.println(sql);

		Connection con = ConnectionUtil.getconnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, name);
		pst.setInt(2, id);

		int rows = pst.executeUpdate();
		System.out.println("no of rows updated:"+rows);
	}

	public void delete(int id) throws Exception {
		String sql = "delete from branch where branch_id=?";
		System.out.println(sql);
		
		try {
			Connection con = ConnectionUtil.getconnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1,id);

			int rows = pst.executeUpdate();
			System.out.println("no of rows deleted:" + rows);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
