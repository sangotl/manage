package co.kim.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	
	public ResultSet EnterViewView() throws SQLException { //연습용
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
				evb.setL_number(rs.getString("i_number"));
				evb.setI_code(rs.getString("i_code"));
				evb.setI_name(rs.getString("i_name"));
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
}
