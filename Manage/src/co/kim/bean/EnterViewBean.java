package co.kim.bean;

public class EnterViewBean {		//6. 입고화면121211
	private String b_number;		//구매번호
	private String l_number;		//라인번호
	private String i_code;			//상품코드
	private String i_name;			//상품명
	private int i_count;			//수량	
	private int e_money;			//단가
	private int o_money;			//금액
	private String e_today;			//입고일자 날짜 
	private String b_business;		//구매업체
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
