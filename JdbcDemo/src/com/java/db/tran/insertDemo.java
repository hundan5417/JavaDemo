package com.java.db.tran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.spi.DirectoryManager;

import com.mysql.jdbc.RowDataCursor;

public class insertDemo {
     public static final String DBDRIVER = "com.mysql.jdbc.Driver";
     public static final String DBURL = "jdbc:mysql://localhost:3306/5418";
     public static final String DBUSER = "root";
     public static final String DBPWD = "5417";
    
	public static void main(String[] args) throws Exception {
		Class.forName(DBDRIVER);
		Connection coon = DriverManager.getConnection(DBURL,DBUSER,DBPWD);
		Statement st = coon.createStatement();
		String sql = "insert into lol (name) values ";
		st.addBatch(sql + "('1');");
		st.addBatch(sql + "('2');");
		st.addBatch(sql + "('3');");
		st.addBatch(sql + "('4');");
		st.addBatch(sql + "('5');");
		st.addBatch(sql + "('6');");
		int i[] = st.executeBatch();
	    System.out.println("插入的数据是条目:" + i.length);
		st.close();
		coon.close();
	}

}
