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
			String url = "jdbc:oracle:thin:@192.168.0.90:1521:xe";
	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	public ResultSet itemView() { //
//		sql = "select * from item_i";
//		try {
//			psmt = conn.prepareStatement(sql);
//			rs = psmt.executeQuery();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return rs;
//	}
	
	public ResultSet itemView() throws SQLException { //¿¬½À¿ë
		sql = "select * from item_i";
		ItemInfoBean sb = new ItemInfoBean();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		if(rs.next()) {
			do {			
				sb = new ItemInfoBean();
				sb.setG_code(rs.getString("g_code"));
				sb.setI_code(rs.getString("i_code"));
				sb.setI_name(rs.getString("i_name"));
				sb.setStand(rs.getString("stand"));
				sb.setUnit(rs.getString("unit"));							
				sb.toPrint();
			} while(rs.next());
		} else System.out.println("else");
		
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
	public int EditManage(ItemInfoBean eb) { 	//
		sql = "update item_i set g_code = ?, i_code = ?, i_name = ?, stand = ?, unit = ? where i_code = ?";
			
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,eb.getG_code());
			psmt.setString(2,eb.getI_code());
			psmt.setString(3,eb.getI_name());
			psmt.setString(4,eb.getStand());
			psmt.setString(5,eb.getUnit());
			psmt.setString(6, eb.getI_code());
			r = psmt.executeUpdate();
		} catch (SQLException e ) {
			e.printStackTrace();
		}
		return r;
	}
	
	
	public void close() throws SQLException {  //DB
		psmt.close();
		conn.close();
	}
	
}
