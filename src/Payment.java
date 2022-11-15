package quest.bicycle;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Payment { // 결제 클래스

	// 1. 필드
	private  int totalPrice; 				// 총 결제금액
	Bicycle bicycle; 						// 완성된 자전거 가져와서 (아직은 아닌거) 
	Scanner sc  = new Scanner(System.in);	// 스캐너 객체 생성

	private int inputCach;					// 투입금액
	private int restMoney;

	// 2. 생성자 
	public Payment( Bicycle bicycle) {
		System.out.println("-------------------------------------------------Payment::Default Constructor invoked.");

		this.bicycle = bicycle;
		this.totalPrice = bicycle.getPrice();
	} // Default Constructor

	// 3. 메소드 
	// 구매 결정 여부 값을 받는 메소드
	public boolean isDecision() {
		System.out.println("-------------------------------------------------Payment::isDecision() invoked.");

		DecimalFormat decFormat = new DecimalFormat("###,###"); // 문자열 포맷 - 3자리마다 콤마찍으려고 넣음.

		// totalPrice를 결제에서 사용하기 위해 전달

		System.out.println("부품의 총 가격은 " + decFormat.format(this.totalPrice) + "원 입니다.");
		System.out.println();
		System.out.println("위 내용으로 구매를 진행하시겠습니까?");
		System.out.println("1. 구매");
		System.out.println("2. 취소");

		int serviceNumber = this.sc.nextInt();

		return (serviceNumber == 1) ;

	} // isDecision


	// 결제 메소드
	public void payment(boolean isDecision) {
		System.out.println("-------------------------------------------------Payment::payment() invoked.");

		if (isDecision) { // 고객이 구매결정을 OK 했을 때
			System.out.println("결제방식을 선택해주세요.");
			System.out.println("1. 현금");
			System.out.println("2. 카드");
			System.out.print("> ");

			int serviceNumber = this.sc.nextInt();

			switch (serviceNumber) {
			case 1:	// 현금결제 메서드호출
				this.cashCalculation();
				break;
			case 2:	// 카드결제
				System.out.println("카드를 찍어주세요.");
				System.out.print("> ");
				
				Storage.takeMoney(this.totalPrice);
				
				System.out.println("감사합니다. 안녕히 가세요.");
				break;
			} // switch


		} else { // 구매결정을 취소했을 때
			System.out.println("구매취소");

		} // if-else
	} // payment

	// 현금 계산 메소드 : totalPrice(상품금액), inputCach(지불금액)
	public void cashCalculation() {
		System.out.println("-------------------------------------------------Payment::cashCalculation(int, int) invoked.");

		DecimalFormat decFormat = new DecimalFormat("###,###"); // 문자열 포맷 - 3자리마다 콤마찍으려고 넣음.
		
		this.restMoney = this.totalPrice;

		do {
			System.out.println("지불하실 금액을 입력해주세요.");
			System.out.print("> ");

			// 고객에게 현금을 받음
			this.inputCach = this.sc.nextInt();


			if (this.inputCach < this.restMoney) {																						// 돈이 (내야할돈 > 낸 돈)이면 지불금액이 얼마 부족한지 안내
				
				System.out.println( decFormat.format(this.restMoney - this.inputCach) + " 원을 더 지불하셔야합니다.");

				this.restMoney = this.restMoney - this.inputCach ;																   		// 지불금액 - 상품금액 = 잔액

			} else if (this.inputCach > this.restMoney) {																				// 잔액이 (0 < 잔액)이면 거스름돈 지급

				Storage.takeMoney(this.restMoney);

				System.out.println( decFormat.format(this.inputCach - this.restMoney) + " 원을 더 지불하셨습니다.");	
				//		        this.cashReturn();
				System.out.println( decFormat.format(this.inputCach - this.restMoney) + " 원을 돌려드리겠습니다.");
				break;
				
			} else{																														// 지불금액 = 상품금액

				break;
			}// if - else 																						    

		}  while ( this.restMoney >= 0 ); // do-while
		
		
		Storage.takeMoney(this.totalPrice);
		System.out.println("구매해주셔서 감사합니다."); 
		System.out.println("감사합니다. 안녕히 가세요.");																				// 잔액이 0 보다 적으면 결제완료

		sc.close();

	} // cashCalculation(int)

	//    public boolean cashReturn() {
	//    	while (true) {
	//    		if(this.inputCach > this.totalPrice) {
	//    			this.totalPrice = this.inputCach - this.totalPrice ;
	//    			return false;
	//    		} else {
	//    			return true;
	//    		}
	//    		// if  - else
	//    		
	//    	} // while 

	//    } //cashReturn


} // end class