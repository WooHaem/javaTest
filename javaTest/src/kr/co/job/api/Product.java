package kr.co.job.api;

public class Product {
	private int gNo;		// 번호
	private String gName;	// 상품명
	private int gPrice;		// 상품가격
	private String gMade;	// 제조국가

	public Product () {}	// 디폴트 생성자 (매개변수 생성자 이전에 미리 만드는 습관)
	
	public Product(int gNo, String gName, int gPrice, String gMade) {
		super();
		this.gNo = gNo;
		this.gName = gName;
		this.gPrice = gPrice;
		this.gMade = gMade;
	}

	public int getgNo() {
		return gNo;
	}

	public void setgNo(int gNo) {
		this.gNo = gNo;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public int getgPrice() {
		return gPrice;
	}

	public void setgPrice(int gPrice) {
		this.gPrice = gPrice;
	}

	public String getgMade() {
		return gMade;
	}

	public void setgMade(String gMade) {
		this.gMade = gMade;
	}

	@Override
	public String toString() {
		return "￣￣상품정보 [상품번호=" + gNo + ", 상품명=" + gName + ", 상품가격=" + gPrice + ", 제조국가=" + gMade + "]";
	}

}
