package com.techouts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Updatetable {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		System.out.println("enter the employee name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter the employee conatct number");
		String mobile=sc.next();
		
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techoutsjava25","root","root");
			PreparedStatement pst=con.prepareStatement("update employee set Ename=? ,Emobile=?  where Eid="+id+"");
		
			pst.setString(1, name);
			pst.setString(2, mobile);
			int n=pst.executeUpdate();
			if (n>0) {
				System.out.println("Records updatesd succesfully");
				
			}
			else {
				System.out.println("updating data failed..");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		

	}

	}

}
