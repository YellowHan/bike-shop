package quest.bicycle;

import java.util.Scanner;


public class Assembly {
	
	// field
	static int partNum; // 대분류(부품종류)
	static int partIdx; // 소분류(부품)
	
	
	// constructor
	
	
	// method
	public static Bicycle assembly(Bicycle myBicycle) {
		System.out.println("-------------------------------------------------Assembly::assembly(myMicycle) invoked");
		
		Scanner sc = new Scanner(System.in);				// 대분류,소분류 인덱스를 받기위한 scanner생성
		
		Storage storge = Storage.getStorgeInstance();		// 창고 싱글톤에서 정보를 불러오기위해
															// 싱글톤 불러오기.
		
		do {												// 부품이 모두 조립될 때까지 반복
			
			storge.showPartOfBicycle();						// 부품의 종류를 보여줌

			partNum = sc.nextInt();							// 부품종류 인덱스를 받음
			
			if( 0 <= partNum && partNum < PartName.size() ) { // ( 0~번호개수 ) 가 아닌 숫자는 안받음
				;;
			} else {
				System.out.println("유효하지 않은 부품종류번호입니다.");
				
				continue;
			} // if-else : 유효한 번호인지 확인.
			
			
			// 재대로 부품의 번호를 받았으면 이미 조립된 부품인지 확인
			if (myBicycle.isEmpty(partNum)) {				// 번호에 맞는 부품이 비어있는지 확인
				;;
			} else {
				System.out.println("이미 조립된 부품입니다.");
				
				continue;
			} // if-else : 선택한 제품이 이미 조립되어 있는 부품을 넣었는지 확인.
			
			storge.showPartInfo(partNum);					// 부품의 정보 출력
			
			partIdx = sc.nextInt();							// 부품의 인덱스를 받음
			
			if ( 0 <= partIdx && partIdx < storge.getPartArr(partNum).length) { // ( 0~선택된 부품 배열의 길이 ) 가 아닌 숫자는 안받음
				
				myBicycle.setPart(partNum, partIdx);		// 숫자가 유효하면 부품을 자전거의 부품으로 저장
				
			} else {
				System.out.println("유효하지 않은 부품번호입니다.");
				
				continue;
			} // if-else : 유효한 번호인지 확인

		} while (!myBicycle.isAllPart());					// 부품이 모두 조립되면 조립 끝!
		
		return myBicycle;									// 완성된 자전거 객체 반환
				
	} // assembly(myBicycle)

	
	

}
