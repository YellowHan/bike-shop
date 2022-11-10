package part;

import java.util.Arrays;

public class PartDataList { // 부품 데이터 클래스

    public PartDataList() {
        System.out.println("PartDataList::Default Constructor invoked.");
    } // Default Constructor


    // 모든 부품의 배열
    Object[] part = new Part[7]; // 부품 모음

    // 개별 부품의 배열
    String[] brakes; // 브레이크 모음
    String[] frames = new String[5]; // 프레임 모음
    String[] gearLevers = new String[5]; // 기어레버 모음
    String[] handles = new String[5]; // 핸들 모음
    String[] pedals = new String[5]; // 페달 모음
    String[] seats = new String[5]; // 안장 모음
    String[] wheels = new String[5]; // 바퀴 모음


    // 각 배열에 데이터 저장
    {
        brakes = new String[]{
                "model: 일천리, type: 림,     price: 34500",
                "model: 이천리, type: 디스크  price: 66200",
                "model: 삼천리, type: 캘리퍼, price: 24600",
                "model: 사천리, type: 대나무  price: 98700",
                "model: 오천리, type: 기본형  price: 78300"
        };

        frames = new String[]{

        };

        gearLevers = new String[]{

        };

        handles = new String[]{

        };

        pedals = new String[]{

        };

        seats = new String[]{

        };

        wheels = new String[]{

        };

        // 부품 모음 배열에 각 부품 배열 저장
        part[0] = brakes;
        part[1] = frames;
        part[2] = gearLevers;
        part[3] = handles;
        part[4] = pedals;
        part[5] = seats;
        part[6] = wheels;
    } // User-Defined Block



    // TODO: index가 0부터 시작하는데 고객에게 보여지는 순서는 1부터라서 return 배열명[index-1]하는 건 어떨까 싶어요.
    // TODO: 그러면 1번을 선택했을 때, 1 - 1 = 0번째 인덱스의 값을 반환합니다.
    // index를 매개변수로 받아 해당 위치의 모델 출력
    public String getBrake(int index) {
        return brakes[index];
    } // getBrake(int)

    public String getFrame(int index) {
        return frames[index].toString();
    } // getFrame(int)

    public String getGearLever(int index) {
        return gearLevers[index];
    } // getGearLever(int)

    public String getHandle(int index) {
        return handles[index];
    } // getHandle(int)

    public String getPedal(int index) {
        return pedals[index];
    } // getPedal

    public String getSeat(int index) {
        return seats[index];
    } // getSeat(int)

    public String getWheel(int index) {
        return wheels[index];
    } // getWheel


    // 각 부품 데이터 전체 출력
    public String getBrakes() {
        System.out.println("PartDataList::getBrakes() invoked.");
        return Arrays.toString(brakes);
    } // getBrakes

    public String getFrames() {
        System.out.println("PartDataList::getFrames() invoked.");
        return Arrays.toString(frames);
    } // getFrames

    public String getGearLevers() {
        System.out.println("PartDataList::gearLevers() invoked.");
        return Arrays.toString(gearLevers);
    } // gearLevers

    public String getHandles() {
        System.out.println("PartDataList::getHandles() invoked.");
        return Arrays.toString(handles);
    } // getHandles

    public String getPedals() {
        System.out.println("PartDataList::getPedals() invoked.");
        return Arrays.toString(pedals);
    } // getPedals

    public String getSeats() {
        System.out.println("PartDataList::getSeats() invoked.");
        return Arrays.toString(seats);
    } // getSeats

    public String Wheels() {
        System.out.println("PartDataList::Wheels() invoked.");
        return Arrays.toString(wheels);
    } // Wheels

} // end class
