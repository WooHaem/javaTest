/* 인터페이스는
 * final필드, 추상메소드로 구성됨
 */
package kr.co.job.api;

public interface ProductMessage {
	// 메뉴선택
	public int menuSelect();
	// 상품추가
	public void goodsJoin(Product obj) throws Exception; 
	// 상품수정
	public void goodsUpdate(Product obj) throws Exception; 	
	// 상품삭제
	public void goodsDelete(Product obj) throws Exception; 	
}
