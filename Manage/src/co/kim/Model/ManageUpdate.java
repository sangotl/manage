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
		System.out.println("������ ��ǰ�ڵ带 �Է��ϼ���.");
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
		System.out.println("��ȣ�� �����ϼ���(1. �з��ڵ�, 2. ��ǰ�ڵ�, 3. ��ǰ��, 4. �԰�, 5. ����)");
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
