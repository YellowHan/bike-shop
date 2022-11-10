package assembly;

public class Assembly { // 조립 클래스
//================================================
//	필드
//================================================
    private static int index = 0; // 배열에 값이 저장된 후 인덱스를 증가 시켜줄 카운터 필드

    // 고객이 선택한 부품 정보 임시 저장 배열
    private static final String[] tempData = new String[7];

//================================================
//	생성자
//================================================

    public Assembly() {
        System.out.println("Assembly::Default Constructor invoked.");
    } // Default Constructor

//================================================
//	메소드
//================================================

    public void addTempData(String tempData) {
		System.out.println("Assembly::addTempData(String) invoked.");

        this.tempData[index++] = tempData;
    } // addTempData


    // Test Method - 값이 잘 저장되었는지 체크
    public void printTempData() {
		System.out.println("Assembly::printTempData() invoked.");

		System.out.println("====================================");
		System.out.println("            최종 확인");
		System.out.println("====================================");
		System.out.println("선택하신 부품 목록을 출력합니다.");
		for (String element : tempData) {
			System.out.println(element);
		} // enhanced for
    } // getTempData


    // 부품들의 총합을 구하는 메소드
    public static int totalPrice() {
        System.out.println("Assembly::totalPrice() invoked.");

        int sum = 0;

        for(int i = 0 ; i < tempData.length ; i++) {
            String str = tempData[i];
            sum += Integer.parseInt(str.substring(str.lastIndexOf(' ') + 1));
        } // for

        return sum;
    } // totalPrice


    // TODO: 고객이 선택한 값으로 자전거를 만들 메소드 필요


} // end class
