import asset.BikeInfoStorage;

import java.time.LocalDate;
import java.util.Scanner;

import assembly.Replacement;
import part.data.PartDataList;

public class Main {
	public static void main(String[] args) {

		BikeInfoStorage bikeInfoStorage = new BikeInfoStorage(); // 판매된 자전거의 정보를 저장

		PartDataList partDataList = new PartDataList();
		String brakeList = partDataList.getBrakes();
		System.out.println(brakeList);

		String brake = partDataList.getBrake(0);
		System.out.println("brake[0] => " + brake);

		// 샘플 데이터 입력(테스트용)
		bikeInfoStorage.setSerialNumber(221110123456L, "삼천리", "종이", 55600);
		bikeInfoStorage.setSerialNumber(200909543212L, "오천리", "대나무", 32456);
		bikeInfoStorage.setSerialNumber(190909999999L, "구천리", "티타늄", 874561);

		// 샘플 데이터 출력 확인
		bikeInfoStorage.getSerialNumbers();

		Scanner scanner = new Scanner(System.in);

		/*
		 * TODO : 1. 최종 완료 후 while문 안에 넣어 고객이 원할 때 종료되게 하기 2. while 탈출 조건을 정하기
		 */

		// 제공 서비스에 대한 안내 메시지 출력
		System.out.println("====================================");
		System.out.println("        \uD83D\uDEB2 따르릉 판매점 \uD83D\uDEB2");
		System.out.println("====================================");
		System.out.println("이용하실 서비스 번호를 선택해주세요.");
		System.out.println("1. 구매 2. A/S요청");
		System.out.print("> ");

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
				// TODO : 커스텀 데이터, 프로세스 필요
				break;
			case 2: // 2번 : 완제품 리스트를 보여줌
				// TODO : 완제품 데이터 필요
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
			long bikeSerialNumber = scanner.nextLong();

			// 입력받은 Serial Number로 정품 확인 처리
			boolean isSerialNumber = bikeInfoStorage.isSerialNumber(bikeSerialNumber);
			if (isSerialNumber) {
				System.out.println("정품이 맞습니다.");
				System.out.println();

				// TODO : 보증기간에 대한 처리 이 처리가 진행 되어야 부품 교체가 가능
				/*
				 * 1. 보증기간 내일경우 처리 2. 보증기간이 경과한 경우 처리 구매 후 일정기간이 지나 A/S 불가에 대한 안내 처리 시리얼넘버를 구매날짜
				 * + 제품고유번호로 생성하기 때문에 앞의 구매날짜를 현재 날짜와 비교하여 경과기간을 확인한다.
				 * 
				 * 예) 221110 + 고유번호 요런식? => 이게 총 자릿수가 몇이냐에 따라서
				 * 나누기 1000? 10000?을 정해서 앞의 6자리만 가져온다.
				 * 
				 */
				
				// 입력받은 Serial Number에서 앞의 6자리(구매날짜)를 뽑아서 현재 날짜와 비교한다.
				System.out.println("고객의 구매 날짜 : " + bikeSerialNumber/1000000); // 고객의 구매 날짜 : 221110
				System.out.println("현재 날짜 : " + LocalDate.now()); // 현재 날짜 : 2022-11-10
				
				
				
				

				// 정품 확인이 완료되어 A/S 진행 시작
				// 부품 교체를 위한 부품 교체 객체 생성
				Replacement replacement = new Replacement();

				System.out.println("====================================");
				System.out.println("            A/S 진행");
				System.out.println("====================================");
				System.out.println("교체를 원하시는 부품을 입력해주세요");
				System.out.println("1. 브레이크          5. 페달");
				System.out.println("2. 프레임            6. 안장");
				System.out.println("3. 기어레버          7. 바퀴");
				System.out.println("4. 핸들");
				System.out.print("> ");

				// 서비스 번호 입력받기
				serviceNumber = scanner.nextInt();

				// 입력받은 서비스 번호에 대한 처리
				switch (serviceNumber) {
				case 1: // 1번 : 브레이크
					// 제품 패키지의 브레이크 클래스의 객체 생성


//					String brakeInfo = brake.getBrakeModelInfo();

					System.out.println("====================================");
					System.out.println("            Brake Model");
					System.out.println("====================================");
					System.out.println("아래 모델 중 조립할 모델을 선택해주세요");

					// 브레이크 모델들에 대해 출력
//					System.out.println(brakeInfo);
					System.out.print("> ");

					// 서비스 번호 입력받기
					serviceNumber = scanner.nextInt();

					// 입력받은 서비스 번호에 맞는 모델로 조립
					// 부품 교체 메소드 호출
					replacement.setChangePart(bikeSerialNumber, "Brake", serviceNumber);

//                    case 2 -> "프레임";
//                    case 3 -> "기어레버";
//                    case 4 -> "핸들";
//                    case 5 -> "페달";
//                    case 6 -> "안장";
//					default -> "바퀴";
				}
				; // switch

			} else {
				System.out.println("정품이 아닙니다.");
				System.out.println("A/S를 받으실 수 없습니다.");
			}
			break;
		} // switch

		scanner.close();
	} // main
} // end class
