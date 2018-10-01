package co.kim.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.kim.bean.ItemInfoBean;

public class ManageDao {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs; //excuteQuery()
	private String sql;  //Sql 
	private int r;  //excuteUpdate()
	public ManageDao() {  //
		try {
			String user = "kim";
			String pw = "123";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ResultSet itemView() { //
		sql = "select * from item_i";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public int InsertManage(ItemInfoBean b) throws SQLException {  //
		sql = "insert into item_i values(?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, b.getG_code());
			psmt.setString(2, b.getI_code());
			psmt.setString(3, b.getI_name());
			psmt.setString(4, b.getStand());
			psmt.setString(5, b.getUnit());
			r = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return r;
	}
	
	public int DeleteManage(String n) { //
		sql = "delete from item_i where i_code = ?";  
	
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, n);
			r = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}
	
	public ResultSet SearchManage(String id) { 	//
		sql = "select * from item_i where i_code = ?";  	
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,id);
			rs = psmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return rs;
	}
	
	
	
	public void close() throws SQLException {  //DB
		psmt.close();
		conn.close();
	}
	
}
