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
			System.out.println("���̺��� �����ϼ���(1. ǰ������, 2. â������, 3. ���ž�ü����, 4. �Ǹž�ü����, 6. �԰�ȭ�� 0. ����)");
			num = s.nextInt();
			if(num==1) {			
				while(num>0) {		
					System.out.println();
					System.out.println("ǰ���������̺� �Դϴ�.");
					System.out.println("��ȣ�� �Է��ϼ���(1. ��ü����, 2. �Է�, 3. ����, 4. ���� 0. �ڷ�)");			
					
					num = s.nextInt();			
					switch(num){
					case 1:
			//			ManageModel mm = new ManageModel();
			//			mm.noticeView();		//ǰ������ȭ�� ��
						ItemInfoDao dao = new ItemInfoDao();
						dao.ItemInfoView();
						break;
					case 2:
						ManageInsert mi = new ManageInsert();	//�Է�
						mi.ItemInfoInsert();
						break;
					case 3:
						ManageDelete md = new ManageDelete();	//����
						md.ItemInfoDelete();
						break;
					case 4:
						ManageUpdate mu = new ManageUpdate();	//����
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
					System.out.println("â���������̺� �Դϴ�.");
					System.out.println("��ȣ�� �Է��ϼ���(1. ��ü����, 2. �Է�, 3. ����, 4. ���� 0. �ڷ�)");
					
					num = s.nextInt();			
					switch(num){
						case 1:
				//			ManageModel mm = new ManageModel();
				//			mm.noticeView();		//ǰ������ȭ�� ��
							WareInfoDao dao = new WareInfoDao();
							dao.WareInfoView();
							break;
						case 2:
							ManageInsert mi = new ManageInsert();	//�Է�
							mi.WareInfoInsert();
							break;
						case 3:
							ManageDelete md = new ManageDelete();	//����
							md.WareInfoDelete();
							break;
						case 4:
							ManageUpdate mu = new ManageUpdate();	//����
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
					System.out.println("���ž�ü�������̺� �Դϴ�.");
					System.out.println("��ȣ�� �Է��ϼ���(1. ��ü����, 2. �Է�, 3. ����, 4. ���� 0. �ڷ�)");
					
					num = s.nextInt();			
					switch(num){
						case 1:
				//			ManageModel mm = new ManageModel();
				//			mm.noticeView();		//ǰ������ȭ�� ��
							BuyManageDao dao = new BuyManageDao();
							dao.BuyManageView();
							break;
						case 2:
							ManageInsert mi = new ManageInsert();	//�Է�
							mi.BuyManageInsert();
							break;
						case 3:
							ManageDelete md = new ManageDelete();	//����
							md.BuyManageDelete();
							break;
						case 4:
							ManageUpdate mu = new ManageUpdate();	//����
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
					System.out.println("�Ǹž�ü�������̺� �Դϴ�.");
					System.out.println("��ȣ�� �Է��ϼ���(1. ��ü����, 2. �Է�, 3. ����, 4. ���� 0. �ڷ�)");
					
					num = s.nextInt();			
					switch(num){
						case 1:
				//			ManageModel mm = new ManageModel();
				//			mm.noticeView();		//ǰ������ȭ�� ��
							SellManageDao dao = new SellManageDao();
							dao.SellManageView();
							break;
						case 2:
							ManageInsert mi = new ManageInsert();	//�Է�
							mi.SellManageInsert();
							break;
						case 3:
							ManageDelete md = new ManageDelete();	//����
							md.SellManageDelete();
							break;
						case 4:
							ManageUpdate mu = new ManageUpdate();	//����
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
					System.out.println("�԰�ȭ�����̺� �Դϴ�.");
					System.out.println("��ȣ�� �Է��ϼ���(1. ��ü����, 2. �Է�, 3. ����, 4. ���� 0. �ڷ�)");
					
					num = s.nextInt();			
					switch(num){
						case 1:
				//			ManageModel mm = new ManageModel();
				//			mm.noticeView();		//ǰ������ȭ�� ��
							EnterViewDao dao = new EnterViewDao();
							dao.EnterView();
							break;
						case 2:
							ManageInsert mi = new ManageInsert();	//�Է�
						//	mi.EnterViewInsert();
							break;
						case 3:
							ManageDelete md = new ManageDelete();	//����
						//	md.EnterViewDelete();
							break;
						case 4:
							ManageUpdate mu = new ManageUpdate();	//����
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
