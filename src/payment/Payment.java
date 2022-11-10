package payment;

import java.util.Scanner;

public class Payment { // 결제 클래스
    private static int totalPrice; // 총 결제금액

    public Payment() {
        System.out.println("Payment::Default Constructor invoked.");
    } // Default Constructor


    // 결제에 사용될 총 금액을 가져오는 메소드


    public static void setTotalPrice(int totalPrice) {
        System.out.println("Payment::setTotalPrice invoked.");

        Payment.totalPrice = totalPrice;
    } // setTotalPrice

    // 결제 메소드
    public void payment(Boolean isDecision) {
        System.out.println("Information::payment() invoked.");

        Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성

        if (isDecision) { // 고객이 구매결정을 OK 했을 때
            System.out.println("결제방식을 선택해주세요");
            System.out.println("1. 현금");
            System.out.println("2. 카드");
            System.out.print("> ");

            int serviceNumber = scanner.nextInt();

            switch (serviceNumber) {
                case 1:
                    System.out.println("지불하실 금액을 입력해주세요.");
                    System.out.print("> ");

                    // 고객에게 현금을 받음
                    int inputCach = scanner.nextInt();

                    cashCalculation(inputCach, totalPrice);
                    break;
                case 2:
                    System.out.println("카드번호 16자리를 입력해주세요.");
                    System.out.print("> ");
                    String inputCardNumber = scanner.nextLine();
                    cardCalculation(inputCardNumber);
                    break;
            } // switch


        } else { // 구매결정을 취소했을 때
            System.out.println("구매취소");

        } // if-else
    } // payment

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

        // TODO: 만약, 고객이 "-"를 포함한 입력을 했을 경우? 숫자만 입력하게 하는가?
        // 카드번호가 16자리이면 true, false
        return cardNumber.length() == 16;
    } // cardCalculation(int)

} // end class
