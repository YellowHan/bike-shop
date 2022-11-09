import asset.BikeInfoStorage;
import purchase.Purchase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BikeInfoStorage bikeInfoStorage = new BikeInfoStorage(); // 판매된 자전거의 정보를 저장

        // 샘플 데이터 입력(테스트용)
        bikeInfoStorage.setSerialNumber(12345, "삼천리", "종이", 55600);
        bikeInfoStorage.setSerialNumber(54321, "오천리", "대나무", 32456);
        bikeInfoStorage.setSerialNumber(13579, "구천리", "티타늄", 874561);

        Scanner scanner = new Scanner(System.in);

        // TODO : 최종 완료 후 while문 안에 넣어 고객이 원할 때 종료되게 하기

        // 제공 서비스에 대한 안내 메시지 출력
        System.out.println("====================================");
        System.out.println("        \uD83D\uDEB2 따르릉 판매점 \uD83D\uDEB2");
        System.out.println("====================================");
        System.out.println("이용하실 서비스 번호를 선택해주세요.");
        System.out.println("1. 구매 2. A/S요청");
        System.out.print("=> ");

        // 서비스 번호 입력받기
        int serviceNumber = scanner.nextInt();

        // 입력받은 서비스 번호에 대한 처리
        switch (serviceNumber) {
            case 1: // 1번 : 구매 => 완제품 or 커스텀 선택
                System.out.println("====================================");
                System.out.println("             제품 선택");
                System.out.println("====================================");
                System.out.println("1. 커스텀");
                System.out.println("2. 완제품");
                System.out.print("> ");

                // 구매할 제품에 대한 서비스 번호 입력받기
                serviceNumber = scanner.nextInt();

                // 입력받은 서비스 번호에 대한 처리
                switch (serviceNumber) {
                    case 1: // 1번 : 커스텀을 시작
                        // TODO : 커스텀 시작
                        break;
                    case 2: // 2번 : 완제품 리스트를 보여줌
                        // TODO : 완제품 선택
                        break;
                } // switch
                break;

            case 2: // 2번 : A/S 요청
                System.out.println("====================================");
                System.out.println("          구매 고객 확인");
                System.out.println("====================================");
                System.out.println("정품 확인을 위해 자전거의 시리얼 번호를 입력해주세요.");
                System.out.print("> ");

                // A/S 대상 자전거의 Serial Number 입력받기
                int bikeSerialNumber = scanner.nextInt();

                // 입력받은 Serial Number로 정품 확인 처리
                boolean isSerialNumber = bikeInfoStorage.isSerialNumber(bikeSerialNumber);
                if(isSerialNumber) {
                    System.out.println("정품이 맞습니다.");
                    System.out.println();

                    // TODO : 보증기간에 대한 처리
                    // TODO : 구매 후 일정기간이 지나 A/S 불가에 대한 안내 처리

                    System.out.println("====================================");
                    System.out.println("            A/S 진행");
                    System.out.println("====================================");
                    System.out.println("교체를 원하시는 부품을 입력해주세요");
                    System.out.println("1. 브레이크          5. 페달");
                    System.out.println("2. 프레임            6. 안장");
                    System.out.println("3. 기어레버          7. 바퀴");
                    System.out.println("4. 핸들");
                    System.out.print(">");

                    // TODO : A/S 요청을 하는 부품 교체에 대한 처리

                } else {
                    System.out.println("정품이 아닙니다.");
                    System.out.println("A/S를 받으실 수 없습니다.");
                }
                break;
        } // switch


    } // main
} // end class
