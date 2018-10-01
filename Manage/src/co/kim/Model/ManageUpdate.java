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
		
		ndb.itemView(); 
		System.out.println(" ==================== ");
		System.out.println("변경할 상품코드를 입력하세요.");
		rs = ndb.SearchManage(sc.nextLine());
		
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
		System.out.println("번호를 선택하세요(1. 분류코드, 2. 상품코드, 3. 상품명, 4. 규격, 5. 단위)");
		int n = Integer.parseInt(sc.nextLine());
		EditSelectCol(n);
		ndb.EditManage(udate);  
		ndb.itemView();
		ndb.close();
	}
	
	private void EditSelectCol(int n) {
		switch(n) {
		case 1 : //
			System.out.println("g_code");
			udate.setG_code(sc.nextLine());
			break;
		case 2 : 
			System.out.println("i_code");
			udate.setI_code(sc.nextLine());
			break;
		case 3 : 
			System.out.println("i_name");
			udate.setI_name(sc.nextLine());
			break;
		case 4 : 
			System.out.println("stand");
			udate.setStand(sc.nextLine());
			break;
		case 5 : 
			System.out.println("unit");
			udate.setUnit(sc.nextLine());
			break;
		}
	}
}
