package com.springmvc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	 
	
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/mvc01?useUnicode&characterEncoding=utf-8";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "0000";
	
		static{
			try {
				Class.forName(DRIVER);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static Connection getConnection(){
			Connection conn = null;
			try {
				conn = (Connection)DriverManager.getConnection(URL,USERNAME,PASSWORD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
			
		}
		
		protected ResultSet executeQuery(String sql, Object... params) throws SQLException {
			Connection conn = null;
	        PreparedStatement pstmt = null;
	        ResultSet rs = null;
	        try {
	            pstmt = conn.prepareStatement(sql);
	            for (int i = 0; i < params.length; i++) {
	                pstmt.setObject(i + 1, params[i]);
	            }
	            rs = pstmt.executeQuery();
	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw e;
	        }
	        return rs;
	    }

}
