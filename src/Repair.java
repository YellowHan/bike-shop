package quest.bicycle;

public class Repair {

	static Bicycle repairedBicycle;
	
	static PartOfBicycle[] ASPart;
	
	static PartOfBicycle[] newPart;
	

	// 이곳에는 수리하는 로직을 만들 예정입니다
	// 고장난 부품 판별 후
	// 고장난 부품의 새 제품을 창고로 부터 받아서
	// 교체하고 반환
	 
	
	static Bicycle repairBicycle( Bicycle ASBicycle ) {	//AS 바이크를 받아
		
		
		
		// 고장을 확인해
		// 고장 ->  각각 부품에 내구도 추가
		// 내구도로 isBroken
		// 판별
		// 고장난 부품 배열?
		
		
		
		
		
		return Repair.repairedBicycle;

	}
	
	// 부품의 고장을 판별하는 메서드
	static boolean inBroken(PartOfBicycle part) {
		
		return part.isBorken();
	}
	
	
	
} // end class
