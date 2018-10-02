package co.kim.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.kim.bean.ItemInfoBean;
import co.kim.bean.WareInfoBean;

public class WareInfoDao {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs; //excuteQuery()
	private String sql;  //Sql 
	private int r;  //excuteUpdate().
	public WareInfoDao() {  //
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

	public ResultSet WareInfoView() throws SQLException { //연습용
		sql = "select * from warehouse_i";
		WareInfoBean wb = new WareInfoBean();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		if(rs.next()) {
			do {			
				wb = new WareInfoBean();
				wb.setW_code(rs.getString("w_code"));
				wb.setW_name(rs.getString("w_name"));
				wb.setW_content(rs.getString("w_content"));						
				wb.toPrint();
			} while(rs.next());
		} else System.out.println("창고 테이블에 데이터가 없습니다.");
		
		return rs;		
	}
	
	
	
	public int WareInfoInsert(WareInfoBean b) throws SQLException {  //
		sql = "insert into warehouse_i values(?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, b.getW_code());
			psmt.setString(2, b.getW_name());
			psmt.setString(3, b.getW_content());
			r = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return r;
	}
	
	public int WareInfoDelete(String n) { //
		sql = "delete from warehouse_i where w_code = ?";  
	
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, n);
			r = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}
	
	public ResultSet WareInfoSearch(String id) { 	//
		sql = "select * from warehouse_i where w_code = ?";  	
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,id);
			rs = psmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return rs;
	}
	
	
	public int WareInfoSearchEdit(WareInfoBean wib) { 	//
		sql = "update warehouse_i set w_code = ?, w_name = ?, w_content = ? where w_code = ?";
			
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,wib.getW_code());
			psmt.setString(2,wib.getW_name());
			psmt.setString(3,wib.getW_content());
			psmt.setString(4,wib.getW_code());
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
