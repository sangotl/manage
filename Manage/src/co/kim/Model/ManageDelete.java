package co.kim.Model;

import java.sql.SQLException;
import java.util.Scanner;

import co.kim.Dao.ManageDao;



public class ManageDelete {
	public void delete() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		ManageDao dao = new ManageDao();
		ManageModel mm = new ManageModel();
		
		mm.noticeView();
		System.out.println(" =============== ");
		System.out.println("삭제할 상품코드를 입력하세요");
		String n = sc.nextLine();
		sc.close();		
		dao.DeleteManage(n);		
		mm.noticeView();
		dao.close();
	}
}
