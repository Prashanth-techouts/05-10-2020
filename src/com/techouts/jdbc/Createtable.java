package com.techouts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Createtable {

	public static void main(String[] args) {
		
		String table="Create table Employee ( "+"Eid int,"+"Ename varchar(20),"+"Emobile varchar(12))";
 		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		System.out.println("enter the employee name");
		String name=sc.next();
		System.out.println("Enter the employee conatct number");
		String mobile=sc.next();
		
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techoutsjava25","root","root");
			
			PreparedStatement pst=con.prepareStatement(table);
			int n=pst.executeUpdate();
			System.out.println(n);
			System.out.println("Table created succesfully...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
