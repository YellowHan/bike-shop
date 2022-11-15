package quest.bicycle;


public class Do {

	public static void main(String[] args) {
		
		Storage storge = Storage.getStorgeInstance();							// 창고 생성
		
		System.out.println("현재 매출는 " + storge.getMoney() + "원입니다.");


		System.out.println("Storage(SINGLETON) instance 생성 로그 ");
		
//-----------------------------------------------------------------------------------창고(싱글톤) 소환
		

		Frame[] frameArr = new Frame[] {
				new Frame("강철", "콜나고\t", 10000, "빨강색", 100),
				new Frame("카본", "삼천리자전거", 50000, "하얀색", 100),
				new Frame("티타늄", "스페셜라이즈", 20000, "검정색", 100),
				new Frame("대나무", "캘피디자인", 60000, "갈색", 100)
		}; // frameArr
		System.out.println("FrameArr 생성 로그");

		
		Wheel[] wheelArr = new Wheel[] {
				new Wheel("클린처", "SuperTeam", 790000, "카본", 100),
				new Wheel("튜브 X", "파스포츠", 450000, "카본", 100),
				new Wheel("튜브 O", "시마노\t", 500000, "카본", 100)
		}; // wheelArr
		System.out.println("wheelArr 생성 로그");

		
		Handle[] handleArr = new Handle[] {
				new Handle("트레킹", "티맥스\t", 60000, "탄소섬유", 100),
				new Handle("라이저", "우노\t", 20000, "알루미늄", 100),
				new Handle("드롭바", "시마노\t", 44000, "알루미늄", 100),
				new Handle("플랫바", "TOSEEK\t", 45000, "카본", 100)
		}; // handleArr
		System.out.println("handleArr 생성 로그");


		Seat[] seatArr = new Seat[] {
				new Seat("일반용", "삼천리자전거", 15000, "젤리쿠션", 100),
				new Seat("MTB", "Selle Italia", 180000, "티타늄", 100),
				new Seat("경량", "EC90\t", 20000, "탄소섬유 ", 100),
				new Seat("카본", "시마노\t", 145000, "카본", 100)
		}; // seatArr
		System.out.println("seatArr 생성 로그");


		Pedal[] pedalArr = new Pedal[] {
				new Pedal("평페달", "MPEDA\t", 10000, "알루미늄", 100),
				new Pedal("토클립", "VP\t", 20000, "플라스틱", 100),
				new Pedal("클릿", "시마노\t", 140000, "카본", 100),
				new Pedal("접이식", "벨로즈\t", 10000, "알루미늄", 100)
		}; // pedalArr
		System.out.println("pedalArr 생성 로그");


		Brake[] brakeArr = new Brake[] {
				new Brake("캘리퍼", "시마노\t", 11000, "알루미늄", 100),
				new Brake("림", "삼천리자전거", 83700, "알루미늄", 100),
				new Brake("디스크", "시마노\t", 20000, "카본", 100)
		}; // brakeArr
		System.out.println("brakeArr 생성 로그");

		GearLever[] gearLeverArr = new GearLever[] {
				new GearLever("그립", "시마노\t", 30000, "고무", 100),
				new GearLever("듀얼", "시마노\t", 90000, "강철", 100),
				new GearLever("다운", "시마노\t", 110000, "합금", 100)	,
				new GearLever("바엔드", "microSHIFT", 250000, "알루미늄", 100)
		}; // gearLeverArr
		System.out.println("gearLeverArr 생성 로그");
		
//-----------------------------------------------------------------------------------각 부품(배열) 생성

		storge.setPartArr(PartName.FRAME.ordinal(), frameArr);
		storge.setPartArr(PartName.WHEEL.ordinal(), wheelArr);
		storge.setPartArr(PartName.HANDLE.ordinal(), handleArr);
		storge.setPartArr(PartName.SEAT.ordinal(), seatArr);
		storge.setPartArr(PartName.PEDAL.ordinal(), pedalArr);
		storge.setPartArr(PartName.BRAKE.ordinal(), brakeArr);
		storge.setPartArr(PartName.GEARLEVER.ordinal(), gearLeverArr);

		System.out.println("배열 저장 로그");

//-----------------------------------------------------------------------------------각 부품(배열) 창고에 넣기
		
		Bicycle myBicycle = new Bicycle();
		
		System.out.println("자전거 생성 로그 ( 커스텀을 위한 공갈 자전거 )");

		myBicycle =  Assembly.assembly(myBicycle);					// 조립 라이브러리에서 조립메서드 호출.
																	// 최종 조립완료시 완성 자전거를 반환.
		
//------------------------------------------------------------------------------------자전거 조립완료

		myBicycle.setBicycle();

		myBicycle.printInfo();

//------------------------------------------------------------------------------------자전거 최종 정보 출력 및 이름 짓기
		
		Payment payment = new Payment(myBicycle);					// 결제 라이브러리 호출
																	// 자전거를 생성자에 넣으면 자전거 정보저장(인스턴스, 가격)
		
		boolean isBuy = payment.isDecision();						// 살것인가 말것인가를 결정하는 메서드 호출

		payment.payment(isBuy);										// 결제 메서드 호출
		
		System.out.println("현재 매출는 " + storge.getMoney() + "원입니다.");


	} // main

} // end class
