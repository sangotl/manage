package co.kim.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.kim.bean.BuyManageBean;
import co.kim.bean.SellManageBean;

public class SellManageDao {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs; //excuteQuery()
	private String sql;  //Sql 
	private int r;  //excuteUpdate().
	public SellManageDao() {  //
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
	
	public ResultSet SellManageView() throws SQLException { //연습용
		sql = "select * from sell_m";
		SellManageBean bmb = new SellManageBean();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		if(rs.next()) {
			do {			
				bmb = new SellManageBean();
				bmb.setB_code(rs.getString("b_code"));
				bmb.setB_name(rs.getString("b_name"));
				bmb.setAddress(rs.getString("address"));
				bmb.setP_number(rs.getString("p_number"));
				bmb.setR_name(rs.getString("r_name"));							
				bmb.toPrint();
			} while(rs.next());
		} else System.out.println("판매업체관리 테이블에 데이터가 없습니다.");
		
		return rs;		
	}
	
	
	
	public int SellManageInsert(SellManageBean b) throws SQLException {  //
		sql = "insert into sell_m values(?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, b.getB_code());
			psmt.setString(2, b.getB_name());
			psmt.setString(3, b.getAddress());
			psmt.setString(4, b.getP_number());
			psmt.setString(5, b.getR_name());
			r = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return r;
	}
	
	public int SellManageDelete(String n) { //
		sql = "delete from sell_m where b_code = ?";  
	
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, n);
			r = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}
	
	public ResultSet SellManageSearch(String id) { 	//
		sql = "select * from sell_m where b_code = ?";  	
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,id);
			rs = psmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return rs;
	}
	
	
	public int SellManageSearchEdit(SellManageBean eb) { 	//
		sql = "update sell_m set b_code = ?, b_name = ?, address = ?, p_number = ?, r_name = ? where b_code = ?";
			
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,eb.getB_code());
			psmt.setString(2,eb.getB_name());
			psmt.setString(3,eb.getAddress());
			psmt.setString(4,eb.getP_number());
			psmt.setString(5,eb.getR_name());
			psmt.setString(6,eb.getB_code());
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
