package com.java.db.tran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;

import javax.naming.spi.DirectoryManager;

import com.mysql.jdbc.RowDataCursor;

public class insertDemo3 {
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
		Savepoint sp = null;
		try {
			st.executeUpdate(sql + "('1');");
			st.executeUpdate(sql + "('2');");
			st.executeUpdate(sql + "('3');");
			sp = coon.setSavepoint();
			st.executeUpdate(sql + "('4);");
			st.executeUpdate(sql + "('5');");
			coon.commit();
		} catch (Exception e) {
	    	System.out.println("Ö´ÐÐ³ö´í£¡");
	    	coon.rollback(sp);
		    coon.commit();
		}
		
		
		
		st.close();
		coon.close();
	}

}
