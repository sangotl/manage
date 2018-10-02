package co.kim.bean;

public class BuyManageBean {		//3. 구매업체관리
	private String b_code;			//업체코드
	private String b_name;			//업체명
	private String address;			//주소
	private String p_number;		//연락처
	private String r_name;			//대표자명
	public String getB_code() {
		return b_code;
	}
	public void setB_code(String b_code) {
		this.b_code = b_code;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getP_number() {
		return p_number;
	}
	public void setP_number(String p_number) {
		this.p_number = p_number;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public void toPrint() {   		
		System.out.println(b_code +"\t" + b_name +"\t" + address + "\t" + p_number + "\t" + r_name);		
	}
}
