package com.techouts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Deletedata {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		
		
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techoutsjava25","root","root");
			PreparedStatement pst=con.prepareStatement("Delete from employee where Eid=?");
		
			pst.setInt(1, id);
			
			int n=pst.executeUpdate();
			if (n>0) {
				System.out.println("Records deleted succesfully");
				
			}
			else {
				System.out.println("deleting the data failed..");
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
