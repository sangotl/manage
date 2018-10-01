package co.kim.Model;

import java.sql.SQLException;
import java.util.Scanner;

import co.kim.Dao.ManageDao;

public class ManageModel {
	
	public ManageModel() throws SQLException, Exception{
		int num=1;
		Scanner s = new Scanner(System.in);
		
		while(num>0) {		
			System.out.println();
			System.out.println("번호를 입력하세요(1. 전체보기, 2. 입력, 3. 삭제, 4. 수정 0. 종료");
			
			num = s.nextInt();			
			switch(num){
			case 1:
	//			ManageModel mm = new ManageModel();
	//			mm.noticeView();		//품목정보화면 뷰
				ManageDao dao = new ManageDao();
				dao.itemView();
				break;
			case 2:
				ManageInsert mi = new ManageInsert();	//입력
				mi.input();
				break;
			case 3:
				ManageDelete md = new ManageDelete();	//삭제
				md.delete();
				break;
			case 4:
				ManageUpdate mu = new ManageUpdate();	//수정
				mu.update();
				break;
			case 5:
				
				break;
			case 0:
				System.exit(0);
				break;
				
			}
		}
	}
}
