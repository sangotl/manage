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
			System.out.println("��ȣ�� �Է��ϼ���(1. ��ü����, 2. �Է�, 3. ����, 4. ���� 0. ����");
			
			num = s.nextInt();			
			switch(num){
			case 1:
	//			ManageModel mm = new ManageModel();
	//			mm.noticeView();		//ǰ������ȭ�� ��
				ManageDao dao = new ManageDao();
				dao.itemView();
				break;
			case 2:
				ManageInsert mi = new ManageInsert();	//�Է�
				mi.input();
				break;
			case 3:
				ManageDelete md = new ManageDelete();	//����
				md.delete();
				break;
			case 4:
				ManageUpdate mu = new ManageUpdate();	//����
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
