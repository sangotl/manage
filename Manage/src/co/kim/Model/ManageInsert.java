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

	public void ItemInfoInsert() throws ClassNotFoundException, SQLException {  //  1. 품목정보테이블
		ItemInfoDao mdbo = new ItemInfoDao();
		
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
		
		
		mdbo.ItemInfoInsert(ib);   //Bean 
		mdbo.ItemInfoView();
		mdbo.close();
	}
	public void WareInfoInsert() throws ClassNotFoundException, SQLException {  // 2. 창고정보
		WareInfoDao wdbo = new WareInfoDao();
		
		System.out.println("창고코드 입력하세요.");    
		wb.setW_code(sc.nextLine());                    
		System.out.println("창고명 입력하세요");
		wb.setW_name(sc.nextLine());
		System.out.println("설명 입력하세요");
		wb.setW_content(sc.nextLine());		
		
		
		wdbo.WareInfoInsert(wb);   //Bean 
		wdbo.WareInfoView();
		wdbo.close();
	}
	public void BuyManageInsert() throws ClassNotFoundException, SQLException {  //  3. 판매업체관리테이블
		BuyManageDao mdbo = new BuyManageDao();
		
		System.out.println("업체코드를 입력하세요.");    
		bm.setB_code(sc.nextLine());                    
		System.out.println("업체명을 입력하세요");
		bm.setB_name(sc.nextLine());
		System.out.println("주소를 입력하세요");
		bm.setAddress(sc.nextLine());
		System.out.println("연락처를 입력하세요");
		bm.setP_number(sc.nextLine());
		System.out.println("대표자명을 입력하세요");
		bm.setR_name(sc.nextLine());
		
		
		mdbo.BuyManageInsert(bm);   //Bean 
		mdbo.BuyManageView();
		mdbo.close();
	}
}
