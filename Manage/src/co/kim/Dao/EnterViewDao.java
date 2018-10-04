package co.kim.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.kim.bean.BuyManageBean;
import co.kim.bean.EnterViewBean;

public class EnterViewDao {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs; //excuteQuery()
	private String sql;  //Sql 
	private int r;  //excuteUpdate().
	public EnterViewDao() {  //
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
	
	public ResultSet EnterView() throws SQLException { //연습용
		sql = "select * from enter_v";
		EnterViewBean evb = new EnterViewBean();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		if(rs.next()) {
			do {			
				evb = new EnterViewBean();
				evb.setB_number(rs.getString("b_number"));
				evb.setL_number(rs.getString("l_number"));
				evb.setI_code(rs.getString("i_code"));
				evb.setI_name(rs.getString("i_name"));		//(품목정보.상품코드)조인으로
				evb.setI_count(rs.getInt("i_count"));
				evb.setE_money(rs.getInt("e_money"));
				evb.setO_money(rs.getInt("o_money"));
				evb.setE_today(rs.getString("e_today"));
				evb.setB_business(rs.getString("b_business"));
				evb.toPrint();
			} while(rs.next());
		} else System.out.println("입고화면 테이블에 데이터가 없습니다.");
		
		return rs;		
	}
	public int EnterViewInsert(EnterViewBean b) throws SQLException {  //
		sql = "insert into enter_v values(?,?,?,?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, b.getB_number());
			psmt.setString(2, b.getL_number());
			psmt.setString(3, b.getI_code());
			psmt.setString(4, b.getI_name());
			psmt.setInt(5, b.getI_count());
			psmt.setInt(6, b.getE_money());
			psmt.setInt(7, b.getO_money());
			psmt.setString(8, b.getE_today());
			psmt.setString(8, b.getB_business());
			r = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return r;
	}
	public void close() throws SQLException {  //DB
		psmt.close();
		conn.close();
	}	
	
}
