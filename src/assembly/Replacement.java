package assembly;

public class Replacement { // 부품 교체 클래스
	
	public Replacement() {
		System.out.println("Replacement::Default Constructor invoked.");
	} // Default Constructor
	
	public void setChangePart(long serialNumber, String part, int modelNumber) {
		System.out.println("Replacement::setChangePart(int, int) invoked.");

		
		// TODO: 기존 값에서 교체되는 부품의 값만 변경
		// 시리얼넘버의 값을 가져와서 part에 맞는 값을 찾아 수정 후
		// 다시 시리얼넘버(key)에 담는다.
		
		// 변경된 자전거의 정보를 저장(키 값이 동일할 경우 값만 변경)
//		storage.setSerialNumber(serialNumber, null, null, modelNumber);
		
		
	} // setChangePart(String)
	
	

} // end class
