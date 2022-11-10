package product;

/*
 * 이 클래스는 부품(브레이크)의 데이터를 모아놓은 문자열 양식이다.
 * 만약, 각 부품들에 양식들을 넣을 경우 필요없으므로 삭제
 */

public class Brake {
	
	String brakeModelInfo = """
			1. 모델명 : model1, 종류 : 캘리퍼, 가격 : price
			2. 모델명 : model2, 종류 : 림, 가격 : price
			3. 모델명 : model3, 종류 : 디스크, 가격 : price
			4. 모델명 : model4, 종류 : type, 가격 : price
			5. 모델명 : model5, 종류 : type, 가격 : price
			""";
	
	public Brake() {
		System.out.println("product.Brake::Default Constructor invoked.");
	} // Default Constructor
	
	// 브레이크 모델들 출력
	public String getBrakeModelInfo() {
		return this.brakeModelInfo;
	} // getBrakeModel()
	
} // end class
