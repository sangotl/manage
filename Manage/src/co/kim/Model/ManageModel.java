package co.kim.Model;

import java.sql.SQLException;
import java.util.Scanner;

import co.kim.Dao.BuyManageDao;
import co.kim.Dao.EnterViewDao;
import co.kim.Dao.ItemInfoDao;
import co.kim.Dao.SellManageDao;
import co.kim.Dao.WareInfoDao;

public class ManageModel {
	
	public ManageModel() throws SQLException, Exception{
		int num=1, n=1;
		Scanner s = new Scanner(System.in);
		while(n>0) {
			System.out.println();
			System.out.println("테이블을 선택하세요(1. 품목정보, 2. 창고정보, 3. 구매업체관리, 4. 판매업체관리, 6. 입고화면 0. 종료)");
			num = s.nextInt();
			if(num==1) {			
				while(num>0) {		
					System.out.println();
					System.out.println("품목정보테이블 입니다.");
					System.out.println("번호를 입력하세요(1. 전체보기, 2. 입력, 3. 삭제, 4. 수정 0. 뒤로)");			
					
					num = s.nextInt();			
					switch(num){
					case 1:
			//			ManageModel mm = new ManageModel();
			//			mm.noticeView();		//품목정보화면 뷰
						ItemInfoDao dao = new ItemInfoDao();
						dao.ItemInfoView();
						break;
					case 2:
						ManageInsert mi = new ManageInsert();	//입력
						mi.ItemInfoInsert();
						break;
					case 3:
						ManageDelete md = new ManageDelete();	//삭제
						md.ItemInfoDelete();
						break;
					case 4:
						ManageUpdate mu = new ManageUpdate();	//수정
						mu.ItemInfoUpdate();
						break;
					case 5:
						
						break;
					case 0:
						num=-1;						
						break;						
					}	// switch end
				}// while end
			}// if end
			else if(num==2) {
				while(num>0) {		
					System.out.println();
					System.out.println("창고정보테이블 입니다.");
					System.out.println("번호를 입력하세요(1. 전체보기, 2. 입력, 3. 삭제, 4. 수정 0. 뒤로)");
					
					num = s.nextInt();			
					switch(num){
						case 1:
				//			ManageModel mm = new ManageModel();
				//			mm.noticeView();		//품목정보화면 뷰
							WareInfoDao dao = new WareInfoDao();
							dao.WareInfoView();
							break;
						case 2:
							ManageInsert mi = new ManageInsert();	//입력
							mi.WareInfoInsert();
							break;
						case 3:
							ManageDelete md = new ManageDelete();	//삭제
							md.WareInfoDelete();
							break;
						case 4:
							ManageUpdate mu = new ManageUpdate();	//수정
							mu.WareInfoUpdate();
							
							break;
						case 5:
							
							break;
						case 0:
							num=-1;	
							break;							
						}// switch end
					}// while end
			} // else if end
			else if(num==3) {
				while(num>0) {		
					System.out.println();
					System.out.println("구매업체관리테이블 입니다.");
					System.out.println("번호를 입력하세요(1. 전체보기, 2. 입력, 3. 삭제, 4. 수정 0. 뒤로)");
					
					num = s.nextInt();			
					switch(num){
						case 1:
				//			ManageModel mm = new ManageModel();
				//			mm.noticeView();		//품목정보화면 뷰
							BuyManageDao dao = new BuyManageDao();
							dao.BuyManageView();
							break;
						case 2:
							ManageInsert mi = new ManageInsert();	//입력
							mi.BuyManageInsert();
							break;
						case 3:
							ManageDelete md = new ManageDelete();	//삭제
							md.BuyManageDelete();
							break;
						case 4:
							ManageUpdate mu = new ManageUpdate();	//수정
							mu.BuyManageUpdate();
							
							break;
						case 5:
							
							break;
						case 0:
							num=-1;	
							break;							
						}// switch end
					}// while end
			}
			else if(num==4) {
				while(num>0) {		
					System.out.println();
					System.out.println("판매업체관리테이블 입니다.");
					System.out.println("번호를 입력하세요(1. 전체보기, 2. 입력, 3. 삭제, 4. 수정 0. 뒤로)");
					
					num = s.nextInt();			
					switch(num){
						case 1:
				//			ManageModel mm = new ManageModel();
				//			mm.noticeView();		//품목정보화면 뷰
							SellManageDao dao = new SellManageDao();
							dao.SellManageView();
							break;
						case 2:
							ManageInsert mi = new ManageInsert();	//입력
							mi.SellManageInsert();
							break;
						case 3:
							ManageDelete md = new ManageDelete();	//삭제
							md.SellManageDelete();
							break;
						case 4:
							ManageUpdate mu = new ManageUpdate();	//수정
							mu.SellManageUpdate();
							
							break;
						case 5:
							
							break;
						case 0:
							num=-1;	
							break;							
						}// switch end
					}// while end
			}
			else if(num==6) {
				while(num>0) {		
					System.out.println();
					System.out.println("입고화면테이블 입니다.");
					System.out.println("번호를 입력하세요(1. 전체보기, 2. 입력, 3. 삭제, 4. 수정 0. 뒤로)");
					
					num = s.nextInt();			
					switch(num){
						case 1:
				//			ManageModel mm = new ManageModel();
				//			mm.noticeView();		//품목정보화면 뷰
							EnterViewDao dao = new EnterViewDao();
							dao.EnterView();
							break;
						case 2:
							ManageInsert mi = new ManageInsert();	//입력
						//	mi.EnterViewInsert();
							break;
						case 3:
							ManageDelete md = new ManageDelete();	//삭제
						//	md.EnterViewDelete();
							break;
						case 4:
							ManageUpdate mu = new ManageUpdate();	//수정
						//	mu.EnterViewUpdate();
							
							break;
						case 5:
							
							break;
						case 0:
							num=-1;	
							break;							
						}// switch end
					}// while end
			}
			
			else {
				n=100;	
				break;
			}// else end
		} // while end
				
	}
}
