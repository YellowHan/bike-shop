package storage;

import part.Part;

import java.util.Arrays;

public class PartDataList { // 부품 데이터 클래스

    public PartDataList() {
        System.out.println("PartDataList::Default Constructor invoked.");
    } // Default Constructor


    // 모든 부품의 배열
    String[][] part = new String[7][]; // 부품 모음

    // 개별 부품의 배열
    String[] brakes; // 브레이크 모음
    String[] frames; // 프레임 모음
    String[] gearLevers; // 기어레버 모음
    String[] handles; // 핸들 모음
    String[] pedals; // 페달 모음
    String[] seats; // 안장 모음
    String[] wheels; // 바퀴 모음


    // 각 배열에 데이터 저장
    {
        brakes = new String[]{
                // TODO: 브레이크 데이터 5개 입력
                "model: 일천리, type: 림,     price: 34500",
                "model: 이천리, type: 디스크  price: 66200",
                "model: 삼천리, type: 캘리퍼, price: 24600",
                "model: 사천리, type: 대나무  price: 98700",
                "model: 오천리, type: 기본형  price: 78300"
        };

        frames = new String[]{
                // TODO: 프레임 데이터 5개 입력
                "model: 일천리, type: 림,     price: 34500",
                "model: 이천리, type: 디스크  price: 66200",
                "model: 삼천리, type: 캘리퍼, price: 24600",
                "model: 사천리, type: 대나무  price: 98700",
                "model: 오천리, type: 기본형  price: 78300"
        };

        gearLevers = new String[]{
                // TODO: 기어레버 데이터 5개 입력
                "model: 일천리, type: 림,     price: 34500",
                "model: 이천리, type: 디스크  price: 66200",
                "model: 삼천리, type: 캘리퍼, price: 24600",
                "model: 사천리, type: 대나무  price: 98700",
                "model: 오천리, type: 기본형  price: 78300"
        };

        handles = new String[]{
                // TODO: 핸들 데이터 5개 입력
                "model: 일천리, type: 림,     price: 34500",
                "model: 이천리, type: 디스크  price: 66200",
                "model: 삼천리, type: 캘리퍼, price: 24600",
                "model: 사천리, type: 대나무  price: 98700",
                "model: 오천리, type: 기본형  price: 78300"
        };

        pedals = new String[]{
                // TODO: 페달 데이터 5개 입력
                "model: 일천리, type: 림,     price: 34500",
                "model: 이천리, type: 디스크  price: 66200",
                "model: 삼천리, type: 캘리퍼, price: 24600",
                "model: 사천리, type: 대나무  price: 98700",
                "model: 오천리, type: 기본형  price: 78300"
        };

        seats = new String[]{
                // TODO: 안장 데이터 5개 입력
                "model: 일천리, type: 림,     price: 34500",
                "model: 이천리, type: 디스크  price: 66200",
                "model: 삼천리, type: 캘리퍼, price: 24600",
                "model: 사천리, type: 대나무  price: 98700",
                "model: 오천리, type: 기본형  price: 78300"
        };

        wheels = new String[]{
                // TODO: 바퀴 데이터 5개 입력
                "model: 일천리, type: 림,     price: 34500",
                "model: 이천리, type: 디스크  price: 66200",
                "model: 삼천리, type: 캘리퍼, price: 24600",
                "model: 사천리, type: 대나무  price: 98700",
                "model: 오천리, type: 기본형  price: 78300"
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
        System.out.println("PartDataList::getBrake(int) invoked.");

        return brakes[index - 1];
    } // getBrake(int)

    public String getFrame(int index) {
        System.out.println("PartDataList::getFrame(int) invoked.");

        return frames[index - 1];
    } // getFrame(int)

    public String getGearLever(int index) {
        System.out.println("PartDataList::getGearLever(int) invoked.");

        return gearLevers[index - 1];
    } // getGearLever(int)

    public String getHandle(int index) {
        System.out.println("PartDataList::getHandle(int) invoked.");

        return handles[index - 1];
    } // getHandle(int)

    public String getPedal(int index) {
        System.out.println("PartDataList::getPedal(int) invoked.");

        return pedals[index - 1];
    } // getPedal

    public String getSeat(int index) {
        System.out.println("PartDataList::getSeat(int) invoked.");

        return seats[index - 1];
    } // getSeat(int)

    public String getWheel(int index) {
        System.out.println("PartDataList::getWheel(int) invoked.");

        return wheels[index - 1];
    } // getWheel


    // 각 부품 데이터 전체 출력
    public void printBrakes() {
        System.out.println("PartDataList::printBrakes() invoked.");

        for (String element : brakes) {
            System.out.println(element);
        } // enhanced for
    } // getBrakes

    public void printFrames() {
        System.out.println("PartDataList::printFrames() invoked.");

        for (String element : frames) {
            System.out.println(element);
        } // enhanced for
    } // getFrames

    public void printGearLevers() {
        System.out.println("PartDataList::printGearLevers() invoked.");

        for (String element : gearLevers) {
            System.out.println(element);
        } // enhanced for
    } // gearLevers

    public void printHandles() {
        System.out.println("PartDataList::printHandles() invoked.");

        for (String element : handles) {
            System.out.println(element);
        } // enhanced for
    } // getHandles

    public void printPedals() {
        System.out.println("PartDataList::printPedals() invoked.");

        for (String element : pedals) {
            System.out.println(element);
        } // enhanced for
    } // getPedals

    public void printSeats() {
        System.out.println("PartDataList::printSeats() invoked.");

        for (String element : seats) {
            System.out.println(element);
        } // enhanced for
    } // getSeats

    public void printWheels() {
        System.out.println("PartDataList::printWheels() invoked.");

        for (String element : wheels) {
            System.out.println(element);
        } // enhanced for
    } // Wheels

} // end class
