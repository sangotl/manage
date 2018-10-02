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
		System.out.println("변경할 상품코드를 입력하세요.");
		rs = idb.ItemInfoSearch(sc.nextLine());
		System.out.println("분류코드"+"\t"+ "상품코드"+"\t"+ "상품명"+"\t"+ "규격"+"\t"+ "단위");
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
		System.out.println("번호를 선택하세요(1. 분류코드, 2. 상품명, 3. 규격, 4. 단위)");
		int n = Integer.parseInt(sc.nextLine());
		ItemEditSelect(n);
		idb.ItemInfoSearchEdit(idate);  
		idb.ItemInfoView();
		idb.close();
	}
	
	private void ItemEditSelect(int n) {
		switch(n) {
		case 1 : //
			System.out.println("분류코드을 입력하세요.");
			idate.setG_code(sc.nextLine());
			break;
		case 2 : 
			System.out.println("상품명을 입력하세요.");
			idate.setI_name(sc.nextLine());
			break;
		case 3 : 
			System.out.println("규격을 입력하세요.");
			idate.setStand(sc.nextLine());
			break;
		case 4 : 
			System.out.println("단위를 입력하세요.");
			idate.setUnit(sc.nextLine());
			break;
		}
	}
	
	
	public void WareInfoUpdate() throws ClassNotFoundException, SQLException  { 
		WareInfoDao wdb = new WareInfoDao();
		
		wdb.WareInfoView(); 
		System.out.println(" ==================== ");
		System.out.println("변경할 상품코드를 입력하세요.");
		rs = wdb.WareInfoSearch(sc.nextLine());
		System.out.println("창고코드"+"\t"+ "창고명"+"\t"+ "설명");
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
		System.out.println("번호를 선택하세요(1. 창고명, 2. 설명)");
		int n = Integer.parseInt(sc.nextLine());
		WareEditSelect(n);
		wdb.WareInfoSearchEdit(wdate);  
		wdb.WareInfoView();
		wdb.close();
	}
	
	private void WareEditSelect(int n) {
		switch(n) {
		case 1 : 
			System.out.println("창고명을 입력하세요.");
			wdate.setW_name(sc.nextLine());
			break;
		case 2 : 
			System.out.println("설명을 입력하세요.");
			wdate.setW_content(sc.nextLine());
			break;
		
		}
	}
	
	
	
	public void BuyManageUpdate() throws ClassNotFoundException, SQLException  { 
		BuyManageDao bdb = new BuyManageDao();
		System.out.println("업체코드"+"\t"+ "업체명"+"\t"+ "주소"+"\t"+ "연락처"+"\t"+ "대표자명");
		bdb.BuyManageView(); 
		System.out.println(" ==================== ");
		System.out.println("변경할 업체코드를 입력하세요.");
		rs = bdb.BuyManageSearch(sc.nextLine());
		System.out.println("업체코드"+"\t"+ "업체명"+"\t"+ "주소"+"\t"+ "연락처"+"\t"+ "대표자명");
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
		System.out.println("번호를 선택하세요(1. 업체명, 2. 주소, 3. 주소, 4. 연락처, 5. 대표자명)");
		int n = Integer.parseInt(sc.nextLine());
		BuyManageEditSelect(n);
		bdb.BuyManageSearchEdit(bdate);  
		bdb.BuyManageView();
		bdb.close();
	}
	
	private void BuyManageEditSelect(int n) {
		switch(n) {
		case 1 : //
			System.out.println("업체명을 입력하세요.");
			bdate.setB_code(sc.nextLine());
			break;
		case 2 : 
			System.out.println("주소를 입력하세요.");
			bdate.setAddress(sc.nextLine());
			break;
		case 3 : 
			System.out.println("연락처를 입력하세요.");
			bdate.setP_number(sc.nextLine());
			break;
		case 4 : 
			System.out.println("대표자명을 입력하세요.");
			bdate.setR_name(sc.nextLine());
			break;
		}
	}
	
	
	
	
}
