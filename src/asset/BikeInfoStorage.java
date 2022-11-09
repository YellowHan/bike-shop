package asset;

import java.util.HashMap;

public class BikeInfoStorage { // 자전거 정보 저장 클래스

     HashMap<Integer, String> serialNumbers = new HashMap<>();

    public BikeInfoStorage() {
        System.out.println("BikeInfoStorage::Default Constructor invoked.");
    } // Default Constructor

    // Serial Number를 Key로 하는 자전거 정보 저장
    public void setSerialNumber(int serialNumber, String model, String type, int price) {
        System.out.println("BikeInfoStorage::setSerialNumber() invoked.)");

        // 자전거의 모든 정보를 문자열로 저장한다.
        // 그러면 Key(시리얼넘버)만으로 고객의 자전거 정보(미리 정해진 양식)를 출력해 줄 수 있다.
        String bikeInfo = "model : " + model + ", type : " + type + ", price : " + price;

        // Key : serialNumber, Value : bikeInfo 형태로 저장
        serialNumbers.put(serialNumber, bikeInfo);
    } // setSerialNumber

    // SerialNumber가 존재하는지 여부 조회(있으면 true, 없으면 false)
    public boolean isSerialNumber(int serialNumber) {
        System.out.println("BikeInfoStorage::isSerialNumber() invoked.)");
        return serialNumbers.containsKey(serialNumber);
    } // isSerialNumber

    // Key(SerialNumber)가 가지고 있는 Value(값)을 출력한다.
    public String getInfo(int serialNumber) {
        System.out.println("BikeInfoStorage::getInfo() invoked.)");
        return serialNumbers.get(serialNumber);
    } // getInfo

    // 전체 출력
//    public void getSerialNumbers() {
//        System.out.println(serialNumbers);
//    } // getSerialNumbers

} // end class
