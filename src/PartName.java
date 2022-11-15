package quest.bicycle;


public enum PartName {

	// 부품의 개수 확인 및 부품별 인덱싱을 위해 enum타입 활용
	// 각각의 부품의 이름을 상수로 지정
	
	FRAME,
	WHEEL,
	HANDLE,
	SEAT,
	PEDAL,
	BRAKE,
	GEARLEVER
	;
	
	public static int size() {
		// 	정의된 상수의 개수 카운팅

		int count = 0;

		for( PartName num : PartName.values()) {
			count++;
		}

		return count;
	} // size

} // end enum 
