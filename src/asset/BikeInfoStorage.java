package asset;

import java.util.HashMap;

public class BikeInfoStorage { // 자전거 정보 저장 클래스

     HashMap<Number, String> serialNumbers = new HashMap<>();
     
     // 임시로 값을 통합해 줄 배열이 있으면 좋을까?
     String[] tempInfo;

    public BikeInfoStorage() {
        System.out.println("BikeInfoStorage::Default Constructor invoked.");
    } // Default Constructor

    // Serial Number를 Key로 하는 자전거 정보 저장
//    public void setSerialNumber(int serialNumber, String brake, String frame, String gearLever, String handle, String pedal, String seat, String wheel) {
    public void setSerialNumber(long serialNumber, String model, String type, int price) {
    System.out.println("BikeInfoStorage::setSerialNumber() invoked.)");

        // 자전거의 모든 정보를 문자열로 저장한다.
        // 그러면 Key(시리얼넘버)만으로 고객의 자전거 정보(미리 정해진 양식)를 출력해 줄 수 있다.
        
        /*
         * 자전거 정보를 문자열로 저장하면 부품 교체 처리를 어떻게 할지?!
         * 1. 부품 교체가 있을 경우 해당 부품명부터 replace를 이용해서 처리
         * 2. 제작 또는 교체가 있을 때마다 해당 부품 측에서 완성된 문자열을 주면
         *    그 정보들을 하나의 문자열로 합쳐서 출력
         */
        String bikeInfo = """
        		Brake | model : 이모델, type : 저타입, price : 39900
        		Frame | model : 프라모델, type : 저세상타입, price : 4444
        		GearLever | model : 기어모델, type : 타타입, price : 56789
        		Handle | model : 손모델, type : 팔다리타입, price : 323444
        		""";

        // Key : serialNumber, Value : bikeInfo 형태로 저장
        serialNumbers.put(serialNumber, bikeInfo);
    } // setSerialNumber

    // SerialNumber가 존재하는지 여부 조회(있으면 true, 없으면 false)
    public boolean isSerialNumber(long bikeSerialNumber) {
        System.out.println("BikeInfoStorage::isSerialNumber() invoked.)");
        return serialNumbers.containsKey(bikeSerialNumber);
    } // isSerialNumber

    // Key(SerialNumber)가 가지고 있는 Value(값)을 출력한다.
    public String getInfo(long serialNumber) {
        System.out.println("BikeInfoStorage::getInfo() invoked.)");
        return serialNumbers.get(serialNumber);
    } // getInfo

    // 전체 출력
    public void getSerialNumbers() {
    	System.out.println("BikeInfoStorage::getSerialNumbers() invoked.)");
        System.out.println(serialNumbers);
    } // getSerialNumbers

} // end class
