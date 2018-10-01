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
		System.out.println("분류코드 입력하세요.");    
		ib.setG_code(sc.nextLine());                    
		System.out.println("상품코드 입력하세요");
		ib.setI_code(sc.nextLine());
		System.out.println("상품명 입력하세요");
		ib.setI_name(sc.nextLine());
		System.out.println("규격을 입력하세요");
		ib.setStand(sc.nextLine());
		System.out.println("단위를 입력하세요");
		ib.setUnit(sc.nextLine());
		sc.close();
		
		mdbo.InsertManage(ib);   //Bean 
		mm.noticeView();
		mdbo.close();
	}
}
