package co.kim.bean;

public class EnterViewBean {		//6. �԰�ȭ��121211
	private String b_number;		//���Ź�ȣ
	private String l_number;		//���ι�ȣ
	private String i_code;			//��ǰ�ڵ�
	private String i_name;			//��ǰ��
	private int i_count;			//����	
	private int e_money;			//�ܰ�
	private int o_money;			//�ݾ�
	private String e_today;			//�԰����� ��¥ 
	private String b_business;		//���ž�ü
	public String getB_number() {
		return b_number;
	}
	public void setB_number(String b_number) {
		this.b_number = b_number;
	}
	public String getL_number() {
		return l_number;
	}
	public void setL_number(String l_number) {
		this.l_number = l_number;
	}
	public String getI_code() {
		return i_code;
	}
	public void setI_code(String i_code) {
		this.i_code = i_code;
	}
	public String getI_name() {
		return i_name;
	}
	public void setI_name(String i_name) {
		this.i_name = i_name;
	}
	public int getI_count() {
		return i_count;
	}
	public void setI_count(int i_count) {
		this.i_count = i_count;
	}
	public int getE_money() {
		return e_money;
	}
	public void setE_money(int e_money) {
		this.e_money = e_money;
	}
	public int getO_money() {
		return o_money;
	}
	public void setO_money(int o_money) {
		this.o_money = o_money;
	}
	public String getE_today() {
		return e_today;
	}
	public void setE_today(String e_today) {
		this.e_today = e_today;
	}
	public String getB_business() {
		return b_business;
	}
	public void setB_business(String b_business) {
		this.b_business = b_business;
	}
	public void toPrint() {   		
		System.out.println(b_number +"\t" + l_number +"\t" + i_code + "\t" + i_name + "\t" + i_count + "\t"
				+ e_money +"\t" + o_money + "\t" + e_today +"\t" + b_business);		
	}
}
