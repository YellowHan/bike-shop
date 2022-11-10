package storage;

public class CustomerData { // 고객 자전거 정보 클래스 - 목적 : A/S에 사용

    // TODO: 고객 자전거 정보를 저장할 때, 시리얼넘버와 자전거 정보를 따로 저장해서
    //       시리얼넘버 조회시 해당 인덱스의 값으로 자전거 정보도 조회할 수 있게 하는게 어떤지?
    //
    //       예) serialNumber[3]번의 값과 일치하면 그 고객의 정보는 customersData[3]번에 있다.

    // TODO: 시리얼넘버 정보 배열, 고객 자전거 정보 배열은 static? nonstatic?

//================================================
//	필드
//================================================

    private static final long[] serialNumbers; // 시리얼넘버 정보
    private static final String[][] customersData; // 고객들의 자전거 정보
    private static int count; // 각 배열에 값이 저장된 후 인덱스를 증가 시켜줄 카운터 필드

    static {
        serialNumbers = new long[30];
        customersData = new String[30][];
    } // static initializer

//================================================
//	생성자
//================================================

    public CustomerData() {
        System.out.println("CustomerData::Default Constructor invoked.");
    } // Default Constructor

//================================================
//	메소드
//================================================

    // 시리얼 넘버와 고객 자전거의 정보 저장
    public void setCustomerData(long serialNumber, String[] customerData) {
        System.out.println("BikeInfoStorage::setSerialNumber() invoked.)");

        // 정적 멤버 사용 : 클래스.필드
        CustomerData.serialNumbers[count] = serialNumber;
        CustomerData.customersData[count] = customerData;

        count++;
    } // setSerialNumber

    public void printCustomerData(long serialNumber) {
        System.out.println("BikeInfoStorage::printCustomerData() invoked.)");


    } // printCustomerData


    // SerialNumber가 존재하는지 여부 조회(있으면 true, 없으면 false)
    public boolean isSerialNumber(long serialNumber) {
        System.out.println("BikeInfoStorage::isSerialNumber() invoked.)");

        // serialNumbers 배열에 일치하는 값이 있는지 확인
        for(long number : serialNumbers) {
            if(number == serialNumber) { // 입력받은 시리얼넘버가 배열 안에 있다면
                return true; // true 반환
            } // if
        } // enhanced for

        return false; // 배열 안에 없다면 false 반환
    } // isSerialNumber

} // end class
