package co.kim.Model;

import java.sql.ResultSet;
import java.sql.SQLException;

import co.kim.Dao.ManageDao;
import co.kim.bean.ItemInfoBean;




public class ManageModel {
	private ResultSet rs;  //excuteQuery()
	private int res;   //excuteUpdate()
	private int id; //
	ManageDao dao = new ManageDao();
	ItemInfoBean sb = new ItemInfoBean();
	public void noticeView() throws SQLException {	//품목정보화면뷰		
		
		rs = dao.itemView();
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
		rs.close();
	}
	
}
