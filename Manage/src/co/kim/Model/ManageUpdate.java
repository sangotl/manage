package co.kim.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import co.kim.Dao.BuyManageDao;
import co.kim.Dao.ItemInfoDao;
import co.kim.Dao.WareInfoDao;
import co.kim.bean.BuyManageBean;
import co.kim.bean.ItemInfoBean;
import co.kim.bean.WareInfoBean;



public class ManageUpdate {
	ItemInfoBean idate = new ItemInfoBean();
	WareInfoBean wdate = new WareInfoBean();
	BuyManageBean bdate = new BuyManageBean();
	Scanner sc = new Scanner(System.in);
	ResultSet rs;
	public void ItemInfoUpdate() throws ClassNotFoundException, SQLException  { 
		ItemInfoDao idb = new ItemInfoDao();
		
		idb.ItemInfoView(); 
		System.out.println(" ==================== ");
		System.out.println("������ ��ǰ�ڵ带 �Է��ϼ���.");
		rs = idb.ItemInfoSearch(sc.nextLine());
		System.out.println("�з��ڵ�"+"\t"+ "��ǰ�ڵ�"+"\t"+ "��ǰ��"+"\t"+ "�԰�"+"\t"+ "����");
		try {
			while(rs.next()) {
				idate.setG_code(rs.getString("g_code"));
				idate.setI_code(rs.getString("i_code"));
				idate.setI_name(rs.getString("i_name"));				
				idate.setStand(rs.getString("stand"));
				idate.setUnit(rs.getString("unit"));
				idate.toPrint();
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println(" ==================== ");
		System.out.println("��ȣ�� �����ϼ���(1. �з��ڵ�, 2. ��ǰ��, 3. �԰�, 4. ����)");
		int n = Integer.parseInt(sc.nextLine());
		ItemEditSelect(n);
		idb.ItemInfoSearchEdit(idate);  
		idb.ItemInfoView();
		idb.close();
	}
	
	private void ItemEditSelect(int n) {
		switch(n) {
		case 1 : //
			System.out.println("�з��ڵ��� �Է��ϼ���.");
			idate.setG_code(sc.nextLine());
			break;
		case 2 : 
			System.out.println("��ǰ���� �Է��ϼ���.");
			idate.setI_name(sc.nextLine());
			break;
		case 3 : 
			System.out.println("�԰��� �Է��ϼ���.");
			idate.setStand(sc.nextLine());
			break;
		case 4 : 
			System.out.println("������ �Է��ϼ���.");
			idate.setUnit(sc.nextLine());
			break;
		}
	}
	
	
	public void WareInfoUpdate() throws ClassNotFoundException, SQLException  { 
		WareInfoDao wdb = new WareInfoDao();
		
		wdb.WareInfoView(); 
		System.out.println(" ==================== ");
		System.out.println("������ ��ǰ�ڵ带 �Է��ϼ���.");
		rs = wdb.WareInfoSearch(sc.nextLine());
		System.out.println("â���ڵ�"+"\t"+ "â���"+"\t"+ "����");
		try {
			while(rs.next()) {
				wdate.setW_code(rs.getString("w_code"));
				wdate.setW_name(rs.getString("w_name"));
				wdate.setW_content(rs.getString("w_content"));				
				wdate.toPrint();
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println(" ==================== ");
		System.out.println("��ȣ�� �����ϼ���(1. â���, 2. ����)");
		int n = Integer.parseInt(sc.nextLine());
		WareEditSelect(n);
		wdb.WareInfoSearchEdit(wdate);  
		wdb.WareInfoView();
		wdb.close();
	}
	
	private void WareEditSelect(int n) {
		switch(n) {
		case 1 : 
			System.out.println("â����� �Է��ϼ���.");
			wdate.setW_name(sc.nextLine());
			break;
		case 2 : 
			System.out.println("������ �Է��ϼ���.");
			wdate.setW_content(sc.nextLine());
			break;
		
		}
	}
	
	
	
	public void BuyManageUpdate() throws ClassNotFoundException, SQLException  { 
		BuyManageDao bdb = new BuyManageDao();
		System.out.println("��ü�ڵ�"+"\t"+ "��ü��"+"\t"+ "�ּ�"+"\t"+ "����ó"+"\t"+ "��ǥ�ڸ�");
		bdb.BuyManageView(); 
		System.out.println(" ==================== ");
		System.out.println("������ ��ü�ڵ带 �Է��ϼ���.");
		rs = bdb.BuyManageSearch(sc.nextLine());
		System.out.println("��ü�ڵ�"+"\t"+ "��ü��"+"\t"+ "�ּ�"+"\t"+ "����ó"+"\t"+ "��ǥ�ڸ�");
		try {
			while(rs.next()) {
				bdate.setB_code(rs.getString("b_code"));
				bdate.setB_name(rs.getString("b_name"));
				bdate.setAddress(rs.getString("address"));				
				bdate.setP_number(rs.getString("p_number"));
				bdate.setR_name(rs.getString("r_name"));
				bdate.toPrint();
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println(" ==================== ");
		System.out.println("��ȣ�� �����ϼ���(1. ��ü��, 2. �ּ�, 3. �ּ�, 4. ����ó, 5. ��ǥ�ڸ�)");
		int n = Integer.parseInt(sc.nextLine());
		BuyManageEditSelect(n);
		bdb.BuyManageSearchEdit(bdate);  
		bdb.BuyManageView();
		bdb.close();
	}
	
	private void BuyManageEditSelect(int n) {
		switch(n) {
		case 1 : //
			System.out.println("��ü���� �Է��ϼ���.");
			bdate.setB_code(sc.nextLine());
			break;
		case 2 : 
			System.out.println("�ּҸ� �Է��ϼ���.");
			bdate.setAddress(sc.nextLine());
			break;
		case 3 : 
			System.out.println("����ó�� �Է��ϼ���.");
			bdate.setP_number(sc.nextLine());
			break;
		case 4 : 
			System.out.println("��ǥ�ڸ��� �Է��ϼ���.");
			bdate.setR_name(sc.nextLine());
			break;
		}
	}
	
	
	
	
}
