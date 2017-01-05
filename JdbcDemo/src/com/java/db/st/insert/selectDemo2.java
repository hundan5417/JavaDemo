package com.java.db.st.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.spi.DirectoryManager;


import com.mysql.jdbc.RowDataCursor;

public class selectDemo2 {
     public static final String DBDRIVER = "com.mysql.jdbc.Driver";
     public static final String DBURL = "jdbc:mysql://localhost:3306/5418";
     public static final String DBUSER = "root";
     public static final String DBPWD = "5417";
    
	public static void main(String[] args) throws Exception {
		Class.forName(DBDRIVER);
		Connection coon = DriverManager.getConnection(DBURL,DBUSER,DBPWD);
		String sql = "select * from emp limit ?;";
		PreparedStatement st = coon.prepareStatement(sql);
		st.setInt(1, 5);
		ResultSet res = st.executeQuery();
		while (res.next()) {
			String name = res.getString(2);
			int age = res.getInt(3);
			String cr = res.getString(4);
			String ctiy = res.getString(5);
		    System.out.print("name = " + name + "   ");
		    System.out.print("age = " + age + "   ");
		    System.out.print("³¯´ú   :" + cr + "    ");
			System.out.println("Ê×¶¼   :" + ctiy);
		}
		System.out.println(coon);
		res.close();
		st.close();
		coon.close();
	}

}
