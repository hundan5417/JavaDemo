package com.java.db.st.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.spi.DirectoryManager;

import com.mysql.jdbc.RowDataCursor;

public class updateDemo2 {
     public static final String DBDRIVER = "com.mysql.jdbc.Driver";
     public static final String DBURL = "jdbc:mysql://localhost:3306/5418";
     public static final String DBUSER = "root";
     public static final String DBPWD = "5417";
    
	public static void main(String[] args) throws Exception {
		Class.forName(DBDRIVER);
		Connection coon = DriverManager.getConnection(DBURL,DBUSER,DBPWD);
		String sql = "update lol set name = 'shen' where id = ?;";
		PreparedStatement st = coon.prepareStatement(sql);
		st.setInt(1,16);
		int i = st.executeUpdate();
	    System.out.println("更改的数据是条目:" + i);
		st.close();
		coon.close();
	}

}
