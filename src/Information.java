import assembly.Assembly;
import storage.PartDataList;

import java.util.Scanner;

public class Information { // 안내 메시지 모음 클래스

//================================================
//	생성자
//================================================

    public Information() {
        System.out.println("Information::Default Constructor invoked.");
    } // Default Constructor

//================================================
//	메소드
//================================================

    public void welcomeInfo() {
        System.out.println("Information::welcomeInfo() invoked.");

        System.out.println("====================================");
        System.out.println("        \uD83D\uDEB2 따르릉 판매점 \uD83D\uDEB2");
        System.out.println("====================================");
        System.out.println("이용하실 서비스 번호를 선택해주세요.");
        System.out.println("1. 구매 2. A/S요청");
        System.out.print("> ");
    } // welcomeInfo


    // 부품 선택 유도 메소드
    // 1. 브레이크 2. 프레임 3. 기어레버 4. 핸들 5. 페달 6. 안장 7. 바퀴
    // 순서 변경 가능 -> 배열에 저장된 순서만 바꾸면 됩니다.
    public void selectParts(int index) {
        System.out.println("Information::selectParts() invoked.");

        Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
        PartDataList partDataList = new PartDataList(); // 부품 데이터 객체 생성
        Assembly assembly = new Assembly(); // 조립 객체 생성
        int serviceNumber = 0; // 서비스 번호 저장

        String[] order = {"", "브레이크", "프레임", "기어레버", "핸들", "페달", "안장", "바퀴"}; // index가 1부터이므로 0번째 인덱스에는 빈문자열 저장

        System.out.println("====================================");
        System.out.println("             " + order[index] + " 선택");
        System.out.println("====================================");

        // 현재 index의 부품 목록 출력
        switch (index) {
            case 1:
                // 브레이크 목록 출력
                partDataList.printBrakes();
                System.out.print("> ");

                // 선택한 부품의 값 입력받음
                serviceNumber = scanner.nextInt();

                // 입력값에 맞는 부품을 조립 클래스의 임시 배열에 저장
                assembly.addTempData(partDataList.getBrake(serviceNumber));
                break;
            case 2:
                partDataList.printFrames();
                System.out.print("> ");

                // 선택한 부품의 값 입력받음
                serviceNumber = scanner.nextInt();

                // 입력값에 맞는 부품을 조립 클래스의 임시 배열에 저장
                assembly.addTempData(partDataList.getFrame(serviceNumber));
                break;
            case 3:
                partDataList.printGearLevers();
                System.out.print("> ");

                // 선택한 부품의 값 입력받음
                serviceNumber = scanner.nextInt();

                // 입력값에 맞는 부품을 조립 클래스의 임시 배열에 저장
                assembly.addTempData(partDataList.getGearLever(serviceNumber));
                break;
            case 4:
                partDataList.printHandles();
                System.out.print("> ");

                // 선택한 부품의 값 입력받음
                serviceNumber = scanner.nextInt();

                // 입력값에 맞는 부품을 조립 클래스의 임시 배열에 저장
                assembly.addTempData(partDataList.getHandle(serviceNumber));
                break;
            case 5:
                partDataList.printPedals();
                System.out.print("> ");

                // 선택한 부품의 값 입력받음
                serviceNumber = scanner.nextInt();

                // 입력값에 맞는 부품을 조립 클래스의 임시 배열에 저장
                assembly.addTempData(partDataList.getPedal(serviceNumber));
                break;
            case 6:
                partDataList.printSeats();
                System.out.print("> ");

                // 선택한 부품의 값 입력받음
                serviceNumber = scanner.nextInt();

                // 입력값에 맞는 부품을 조립 클래스의 임시 배열에 저장
                assembly.addTempData(partDataList.getSeat(serviceNumber));
                break;
            case 7:
                partDataList.printWheels();
                System.out.print("> ");

                // 선택한 부품의 값 입력받음
                serviceNumber = scanner.nextInt();

                // 입력값에 맞는 부품을 조립 클래스의 임시 배열에 저장
                assembly.addTempData(partDataList.getWheel(serviceNumber));
                break;
        } // switch

    } // selectParts


    // 구매 결정 여부 값을 받는 메소드
    public boolean isDecision() {
        System.out.println("Information::isDecision() invoked.");

        Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성

        int totalPrice = Assembly.totalPrice();

        System.out.println("부품의 총 가격은 " + totalPrice + "입니다.");
        System.out.println();
        System.out.println("위 내용으로 구매를 진행하시겠습니까?");
        System.out.println("1. 구매");
        System.out.println("2. 취소");

        int serviceNumber = scanner.nextInt();

        return serviceNumber == 1 ? true : false;
    }


} // end class
