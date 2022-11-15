package quest.bicycle;

public class AS {

	public static Bicycle asBicycle ( Bicycle asBicycle ) {

		// 이곳에는 as 로직이 담길 예정입니다

		// ㅅ수리하는 로직을 실행하고
		// 수리가 완료되면 수리비를 청구할 예정입니다

				
		asBicycle = Repair.repairBicycle(asBicycle);
			
		
		return asBicycle;
	}
	
	
	
}
