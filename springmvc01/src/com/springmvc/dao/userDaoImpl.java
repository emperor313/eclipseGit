package com.springmvc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.springmvc.pojo.user;
import com.springmvc.utils.DBUtil;

public class userDaoImpl implements userDao {

	@Override
	public user getUser(String name, String pass) {
		user user = null;
		ResultSet rs = null;
		PreparedStatement psmt = null;
		String sql = "select * from test01 where name = ? and pass = ?";
		Object[] par = {name,pass};
		
		
		
		return null;
	}

}
