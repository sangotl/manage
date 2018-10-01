package co.kim.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import co.kim.Dao.ManageDao;
import co.kim.bean.ItemInfoBean;



public class ManageUpdate {
	ItemInfoBean udate = new ItemInfoBean();
	Scanner sc = new Scanner(System.in);
	ResultSet rs;
	public void update() throws ClassNotFoundException, SQLException  { 
		ManageDao ndb = new ManageDao();
		ManageModel mm = new ManageModel();
		mm.noticeView(); 
		System.out.println(" ==================== ");
		System.out.println("변경할 상품코드를 입력하세요.");
		rs = ndb.SearchManage(String.);
		
		try {
			while(rs.next()) {
				udate.setG_code(rs.getString("g_code"));
				udate.setI_code(rs.getString("i_code"));
				udate.setI_name(rs.getString("i_name"));				
				udate.setStand(rs.getString("stand"));
				udate.setUnit(rs.getString("unit"));
				udate.toPrint();
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println(" ==================== ");
		System.out.println("asdf");
		int n = Integer.parseInt(sc.nextLine());
		EditSelectCol(n);
		ndb.EditNotice(udate);  //
		ndb.close();
	}
	
	private void EditSelectCol(int n) {
		switch(n) {
		case 1 : //
			System.out.println("asdf");
			udate.setTitle(sc.nextLine());
			break;
		case 2 : //
			System.out.println("asdf");
			udate.setContent(sc.nextLine());
			break ;
		}
	}
}
