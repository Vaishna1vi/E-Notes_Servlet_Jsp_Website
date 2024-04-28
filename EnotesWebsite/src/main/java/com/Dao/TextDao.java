package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

import com.User.textNotes;

public class TextDao {
	private Connection conn;

	public TextDao(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean addText(String title, String content, String Uemail) {
		boolean f = false;
		try {
			String query = "insert into textnotes(textTitle, textContent, Uemail) values(?,?,?)";

			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, title);
			ps.setString(2, content);
			// ps.setString(3, tn.getPdate());
			ps.setString(3, Uemail);
			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {

		}
		return f;
	}

	public List<textNotes> getAllText(String Uemail) {
		List<textNotes> list = new ArrayList<textNotes>();
		textNotes tn = null;
		try {
			String query = "select * from textnotes where Uemail=? order by textID desc";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, Uemail);

			ResultSet rs = ps.executeQuery();
			int records = 0;
			while (rs.next()) {
				tn = new textNotes();
				tn.setId(rs.getInt(1));
				tn.setTitle(rs.getString(2));
				tn.setContent(rs.getString(3));
				tn.setPdate(rs.getTimestamp(4));
				list.add(tn);
				records++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	
	public textNotes getDataById(int noteId) {
		textNotes tn = null;
		try {
			String query = "select * from textnotes where textID=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, noteId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				tn = new textNotes();
				tn.setId(rs.getInt(1));
				tn.setTitle(rs.getString(2));
				tn.setContent(rs.getString(3));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return tn;
	}
	
	public boolean updateText(int nid, String title, String content) {
		boolean f = false;
		try {
			String query = "update textnotes set textTitle=?,textContent=? where textID=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, nid);
			int i = ps.executeUpdate();
			if(i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}
	
	public boolean softDelete(int nid) {
		boolean f = false;
		try {
			String query = "update textnotes set deleted='true' where textID=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, nid);
			int i = ps.executeUpdate();
			if(i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public boolean deleteText(int nid) {
		boolean f = false;
		int deletednote = 0;
		try {
			String query = "delete from textnotes where textID=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, nid);
			int i = ps.executeUpdate();
			
			if(i == 1) {
				f = true;
				deletednote++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
