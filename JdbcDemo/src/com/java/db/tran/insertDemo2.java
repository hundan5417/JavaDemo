package com.java.db.tran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.spi.DirectoryManager;

import com.mysql.jdbc.RowDataCursor;

public class insertDemo2 {
     public static final String DBDRIVER = "com.mysql.jdbc.Driver";
     public static final String DBURL = "jdbc:mysql://localhost:3306/5418";
     public static final String DBUSER = "root";
     public static final String DBPWD = "5417";
    
	public static void main(String[] args) throws Exception {
		Class.forName(DBDRIVER);
		Connection coon = DriverManager.getConnection(DBURL,DBUSER,DBPWD);
		coon.setAutoCommit(false);
		Statement st = coon.createStatement();
		String sql = "insert into lol (name) values ";
		st.addBatch(sql + "('1');");
		st.addBatch(sql + "('2');");
		st.addBatch(sql + "('3');");
		st.addBatch(sql + "('4);");
		st.addBatch(sql + "('5');");
		st.addBatch(sql + "('6');");
		
		try {
			int i[] = st.executeBatch();
			coon.commit();
			System.out.println("�������������Ŀ:" + i.length);
		} catch (Exception e) {
			coon.rollback();
			System.out.println("ִ�г����ع���");
		
		}
		st.close();
		coon.close();
	}

}
