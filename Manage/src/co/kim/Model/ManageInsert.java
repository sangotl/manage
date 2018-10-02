package co.kim.Model;

import java.sql.SQLException;
import java.util.Scanner;

import co.kim.Dao.BuyManageDao;
import co.kim.Dao.ItemInfoDao;
import co.kim.Dao.WareInfoDao;
import co.kim.bean.BuyManageBean;
import co.kim.bean.ItemInfoBean;
import co.kim.bean.WareInfoBean;



public class ManageInsert {
	ItemInfoBean ib = new ItemInfoBean();
	WareInfoBean wb = new WareInfoBean();
	BuyManageBean bm = new BuyManageBean();
	Scanner sc = new Scanner(System.in);

	public void ItemInfoInsert() throws ClassNotFoundException, SQLException {  //  1. ǰ���������̺�
		ItemInfoDao mdbo = new ItemInfoDao();
		
		System.out.println("�з��ڵ� �Է��ϼ���.");    
		ib.setG_code(sc.nextLine());                    
		System.out.println("��ǰ�ڵ� �Է��ϼ���");
		ib.setI_code(sc.nextLine());
		System.out.println("��ǰ�� �Է��ϼ���");
		ib.setI_name(sc.nextLine());
		System.out.println("�԰��� �Է��ϼ���");
		ib.setStand(sc.nextLine());
		System.out.println("������ �Է��ϼ���");
		ib.setUnit(sc.nextLine());
		
		
		mdbo.ItemInfoInsert(ib);   //Bean 
		mdbo.ItemInfoView();
		mdbo.close();
	}
	public void WareInfoInsert() throws ClassNotFoundException, SQLException {  // 2. â������
		WareInfoDao wdbo = new WareInfoDao();
		
		System.out.println("â���ڵ� �Է��ϼ���.");    
		wb.setW_code(sc.nextLine());                    
		System.out.println("â��� �Է��ϼ���");
		wb.setW_name(sc.nextLine());
		System.out.println("���� �Է��ϼ���");
		wb.setW_content(sc.nextLine());		
		
		
		wdbo.WareInfoInsert(wb);   //Bean 
		wdbo.WareInfoView();
		wdbo.close();
	}
	public void BuyManageInsert() throws ClassNotFoundException, SQLException {  //  3. �Ǹž�ü�������̺�
		BuyManageDao mdbo = new BuyManageDao();
		
		System.out.println("��ü�ڵ带 �Է��ϼ���.");    
		bm.setB_code(sc.nextLine());                    
		System.out.println("��ü���� �Է��ϼ���");
		bm.setB_name(sc.nextLine());
		System.out.println("�ּҸ� �Է��ϼ���");
		bm.setAddress(sc.nextLine());
		System.out.println("����ó�� �Է��ϼ���");
		bm.setP_number(sc.nextLine());
		System.out.println("��ǥ�ڸ��� �Է��ϼ���");
		bm.setR_name(sc.nextLine());
		
		
		mdbo.BuyManageInsert(bm);   //Bean 
		mdbo.BuyManageView();
		mdbo.close();
	}
}
