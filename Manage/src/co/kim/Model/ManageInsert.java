package co.kim.Model;

import java.sql.SQLException;
import java.util.Scanner;

import co.kim.Dao.ManageDao;
import co.kim.bean.ItemInfoBean;



public class ManageInsert {
	ItemInfoBean ib = new ItemInfoBean();
	Scanner sc = new Scanner(System.in);

	public void input() throws ClassNotFoundException, SQLException {                    //Bean 
		ManageDao mdbo = new ManageDao();
		ManageModel mm = new ManageModel();
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
		sc.close();
		
		mdbo.InsertManage(ib);   //Bean 
		mm.noticeView();
		mdbo.close();
	}
}
