package co.kim.bean;

public class ItemInfoBean {	//1. 품목정보화면
	private String g_code;	//분류코드
	private String i_code;	//상품코드
	private String i_name;	//상품명
	private String stand;	//규격
	private String unit;	//단위
	
	public String getG_code() {
		return g_code;
	}
	public void setG_code(String g_code) {
		this.g_code = g_code;
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
	public void setI_name(String i) {
		this.i_name = i;
	}
	public String getStand() {
		return stand;
	}
	public void setStand(String stand) {
		this.stand = stand;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public void toPrint() {   		
		System.out.println(g_code +"\t" + i_code +"\t" + i_name + "\t" + stand  + "\t" +unit );		
	}
	
}
