package co.kim.Model;

import java.sql.SQLException;
import java.util.Scanner;

import co.kim.Dao.BuyManageDao;
import co.kim.Dao.ItemInfoDao;
import co.kim.Dao.WareInfoDao;



public class ManageDelete {
	public void ItemInfoDelete() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		ItemInfoDao idao = new ItemInfoDao();
		
		
		idao.ItemInfoView();
		System.out.println(" =============== ");
		System.out.println("������ ��ǰ�ڵ带 �Է��ϼ���");
		String n = sc.nextLine();				
		idao.ItemInfoDelete(n);		
		idao.ItemInfoView();
		idao.close();
	}
	public void WareInfoDelete() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		WareInfoDao wdao = new WareInfoDao();
		
		
		wdao.WareInfoView();
		System.out.println(" =============== ");
		System.out.println("������ â���ڵ带 �Է��ϼ���");
		String n = sc.nextLine();				
		wdao.WareInfoDelete(n);		
		wdao.WareInfoView();
		wdao.close();
	}
	public void BuyManageDelete() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		BuyManageDao bdao = new BuyManageDao();
		
		
		bdao.BuyManageView();
		System.out.println(" =============== ");
		System.out.println("������ ��ü�ڵ带 �Է��ϼ���");
		String n = sc.nextLine();				
		bdao.BuyManageDelete(n);		
		bdao.BuyManageView();
		bdao.close();
	}
}
