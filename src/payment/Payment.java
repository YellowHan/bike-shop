package payment;

public class Payment { // 결제 클래스
	
	public Payment() {
		System.out.println("Payment::Default Constructor invoked.");
	} // Default Constructor
	
	// 현금 계산 메소드 : productAmount(상품금액), paymentAmount(지불금액)
	public int cashCalculation(int productAmount, int paymentAmount) {
		System.out.println("Payment::cashCalculation(int, int) invoked.");
		
		// 지불금액 - 상품금액 = 잔액
		// 잔액이 0이면 결제완료
		// 잔액이 (0 < 잔액)이면 거스름돈 지급
		// 잔액이 (0 > 잔액)이면 지불금액이 얼마 부족한지 안내
		return paymentAmount - productAmount;
	} // cashCalculation(int, int)
	
	// 카드 계산 메소드
	public boolean cardCalculation(String cardNumber) {
		System.out.println("Payment::cardCalculation(int) invoked.");
		
		// 카드번호가 16자리이면 true, false
		return cardNumber.length() == 16 ? true : false;
	} // cardCalculation(int)

} // end class
