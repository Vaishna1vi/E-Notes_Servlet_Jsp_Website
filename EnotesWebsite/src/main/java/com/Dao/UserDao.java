package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.User.UserDetails;

public class UserDao {
	private Connection conn;

	public UserDao(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean addUser(UserDetails us) {
		boolean f = false;
		try {
			String query = "insert into user(name, email, password) values(?,?,?)";

			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, us.getName());
			ps.setString(2, us.getEmail());
			ps.setString(3, us.getPassword());
			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}
	
	public boolean updatePwd(String pwd, String email) {
		boolean f = false;
		try {
			String query = "update user set password=? where email=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, pwd);
			ps.setString(2, email);
			int i = ps.executeUpdate();
			if(i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public UserDetails loginUser(UserDetails us) {
	UserDetails user = null;
		try {

			String query = "Select * from user where email=? and password=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, us.getEmail());
			ps.setString(2, us.getPassword());
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				user = new UserDetails();
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return user;
	}
	
	public boolean addProfile(String uId, String name, String useremail, String photo, String phone, String dob, String gender) {
		boolean f = false;
		try {
			String query = "insert into userprofile(userId, Uname, UsEmail, photo, contactNo, DOB, gender) values(?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, uId);
			ps.setString(2, name);
			ps.setString(3, useremail);
			ps.setString(4, photo);
			ps.setString(5, phone);
			ps.setString(6, dob);
			ps.setString(7, gender);
			int i = ps.executeUpdate();
			if(i == 1) {
				f = true;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}

}
