package co.kim.Model;

import java.sql.SQLException;
import java.util.Scanner;

import co.kim.Dao.ManageDao;



public class ManageDelete {
	public void delete() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		ManageDao dao = new ManageDao();
		
		
		dao.itemView();
		System.out.println(" =============== ");
		System.out.println("������ ��ǰ�ڵ带 �Է��ϼ���");
		String n = sc.nextLine();				
		dao.DeleteManage(n);		
		dao.itemView();
		dao.close();
	}
}
