package quest.bicycle;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Bicycle {

	//1. 필드--------------------------------------------------------------------------------------------------
	private String modelName;		
	private String company;			
	private int price;
	private String color;

	Frame frame;
	Wheel wheel;
	Handle handle;
	Seat seat;
	Pedal pedal;
	Brake brake;
	GearLever gearLever;
	
	PartOfBicycle[] myBicycleParts;
	



	//2. 생성자--------------------------------------------------------------------------------------------------
	public Bicycle() { // 공갈 자전거 생성
		System.out.println("-------------------------------------------------Bicycle::default constructor invoked");
	} // default constructor

	
	//3. 메소드--------------------------------------------------------------------------------------------------
	public void setModelName(String modelName) {
		System.out.println("-------------------------------------------------Bicycle::setModelName() invoked");

		this.modelName = modelName;
	} //setModelName

	public void setCompany() {
		System.out.println("-------------------------------------------------Bicycle::setCompany() invoked");

		if(this.frame.getCOMPANY() == this.wheel.getCOMPANY()) {
			this.company = this.frame.getCOMPANY();
		}
		else {
			this.company = "KH자전거커스텀회사";
		}
	} // setCompany

	public int setPrice() { 
		System.out.println("-------------------------------------------------Bicycle:setPrice() invoked");

		return this.price = this.frame.getPRICE() + this.brake.getPRICE() + this.wheel.getPRICE() + this.handle.getPRICE() + this.seat.getPRICE() + this.pedal.getPRICE() + this.gearLever.getPRICE();
	} // setPrice
	
	public int getPrice() {
		System.out.println("-------------------------------------------------Bicycle::getPrice() invoked");

		return this.price;
	} // getPrice

	public void setColor() {
		System.out.println("-------------------------------------------------Bicycle::setColor() invoked");

		this.color = this.frame.getColor();
	} // setColor
	//-----------------------------------------------------------------------------------------------겟터셋터들
	
	// partNum을 인자로 전달하면 각각에 대응되는 부품이 이미 있는지 비어있는지 확인한다.
	public boolean isEmpty (int partNum) {
		
		myBicycleParts = new PartOfBicycle[] { this.frame, this.wheel, this.handle, this.seat, this.pedal, this.brake, this.gearLever };
		// null인지 확인을 위한 배열생성

		if( this.myBicycleParts[partNum] == null) {
			return true;
		} else {
			return false;
		} // if-else
		
	} // isEmpty
	
	{/*
	// partNum을 인자로 넣으면 각각에 대응되는 부품이 이미 있는지 비어있는지 확인한다.
	public boolean isEmpty(int partNum) {
		
		boolean isE = false;

		switch(partNum) {		

		default -> 	{
						if(this.frame == null) {
							isE = true;
						} else {
							;;
						} // if-else
					} // defualt case
		case 1 ->	{
						if(this.wheel == null) {
							isE = true;
						} else {
							;;
						} // if-else
					} // case 1
		case 2 ->	{
						if(this.handle == null) {
							isE = true;
						} else {
							;;
						} // if-else
					} // case 2
		case 3 ->	{
						if(this.seat == null) {
							isE = true;
						} else {
							;;
						} // if-else
					} // case 3
		case 4 ->	{
						if(this.pedal == null) {
							isE = true;
						} else {
							;;
						} // if-else
					} // case 4
		case 5 ->	{
						if(this.brake == null) {
							isE = true;
						} else {
							;;
						} // if-else
					} // case 5
		case 6 ->	{
						if(this.gearLever == null) {
							isE = true;
						} else {
							;;
						} // if-else
					} // case 6
			
		} // switch
		
		

		return isE;

	} // isEmpty(partNum)
	*/}

	// 부품종류의 인덱스 값, 부품의 인덱스 값을 인자로 전달하면 창고에서 인덱스에에 맞는 부품을 갖고와서 자전거에 추가한다.
	public void setPart(int partNum, int partIdx) { 
		System.out.println("-------------------------------------------------Bicycle::setPart() invoked");

		Storage storage = Storage.getStorgeInstance();									// 창고 인스턴스 소환

		PartOfBicycle inputPart =  storage.getPartOfBicycle(partNum, partIdx);			// 부품을 창고에서 갖고와서 inputPart 저장
		
		this.addPart(inputPart);														// addPart 를 호출
																						// inputPart 를 addPart 의 인자로 전달 

		System.out.println("***** " + inputPart.getPART_NAME() + "을(를) " + inputPart.getMODEL_NAME() + "로 정상 조립 완료 *****\n");
																						// 조립 완료 메세지 출력
	} // setPart
	
	// 부품을 인자로 받으면 그 부품을 자전거의 부품으로 교체한다.
	// addPart를 오버로딩해서 사용
	// addPart의 인자를 부품클래스를 넣으면 각 부품클래스로 형변환하고
	// 그에 맞는 addPart 메서드를 호출
	public void addPart(PartOfBicycle part) { 
		if ( part instanceof Frame f ) {
			this.addPart(f);
		} else if ( part instanceof Wheel w ) {
			this.addPart(w);
		} else if ( part instanceof Handle h ) {
			this.addPart(h);
		} else if ( part instanceof Seat s ) {
			this.addPart(s);
		} else if ( part instanceof Pedal p ) {
			this.addPart(p);
		} else if ( part instanceof Brake b ) {
			this.addPart(b);
		} else if ( part instanceof GearLever g ) {
			this.addPart(g);
		} else {
			System.out.println("자전거 부품이 아닙니다.");
		} // if- else if .......

	} // addPart(part)
	
	/*	
	// 부품을 인자로 받으면 그 자전거의 부품으로 교체한다.
	public void addPart(PartOfBicycle part) { 
		switch(part.getPART_NUMBER()) {
		default ->	this.addPart((Frame)part);
		case 1 ->	this.addPart((Wheel)part);
		case 2 ->	this.addPart((Handle)part);
		case 3 ->	this.addPart((Seat)part);
		case 4 ->	this.addPart((Pedal)part);
		case 5 ->	this.addPart((Brake)part);
		case 6 ->	this.addPart((GearLever)part);
		}
	} // addPart(part)
	*/
	
	// 각각 부품을 인자로 받는 오버로딩 된 addPart 메서드
	private void addPart(Frame frame) {
		this.frame = frame;
	} // addPart(frame)

	private void addPart(Wheel wheel) {
		this.wheel = wheel;
	} // addPart(wheel)

	private void addPart(Handle handle) {
		this.handle = handle;
	} // addPart(handle)

	private void addPart(Seat seat) {
		this.seat = seat;
	} // addPart(seat)

	private void addPart(Pedal pedal) {
		this.pedal = pedal;
	} // addPart(pedal)

	private void addPart(Brake brake) {
		this.brake = brake;
	} // addPart(brake)

	private void addPart(GearLever gearLever) {
		this.gearLever = gearLever;
	} // addPart(gearLever)
	//======================================================================================addPart Overloading

	// 자전거의 모든 부품이 셋팅 되었는지 확인
	public boolean isAllPart() {	
		System.out.println("-------------------------------------------------Bicycle::isAllPart() invoked");

		myBicycleParts = new PartOfBicycle[] { this.frame, this.wheel, this.handle, this.seat, this.pedal, this.brake, this.gearLever };

		for( PartOfBicycle part : myBicycleParts ) {
			if ( part == null ) {
				System.out.println("조립이 완성되지 않았습니다.");

				return false;
			}  // if : 부품 중 하나라도 null을 갖고 있으면 fales 를 반환하며 메서드 종료
		} // for

		return true;
	} // isAllPartisAllPart
	
	// 부품 셋팅이 완료된 자전거의 네이밍 및 정보 반환
	public void setBicycle() {	
		System.out.println("-------------------------------------------------Bicycle::setBicycle() invoked");

		boolean isSuccess = this.isAllPart();									// 모든 부품의 조립이 완료되는지 확인
		
		if(isSuccess) {															// 모든 부품이 조립이 완료되면 자전거 네이밍, 정보최신화

			System.out.println("***** 모든 부품 선택 완료되었습니다! *****");

			this.nameingBicycle();												// 자전거 네이밍
			this.setCompany();													// 자전거 회사 세팅
			this.setColor();													// 자전거 색상 세팅
			this.setPrice();													// 자전거 가격 세팅
			myBicycleParts = new PartOfBicycle[] { this.frame, this.wheel, this.handle, this.seat, this.pedal, this.brake, this.gearLever };
																				// 자전거의 부품 배열 세팅
			
		} else {
			System.out.println("자전거 조립이 완료되지 않았습니다.");
		} // if-else : 자전거의 조립이 완료되었는지 판단

	}// setBicycle
	
	// 자전거의 이름을 정해주는 메소
	public void nameingBicycle() {
		System.out.println("-------------------------------------------------Bicycle::nameingBicycle() invoked");
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("나의 자전거 이름은?? >> ");
		
		String myBicycleName = sc.nextLine();

		this.setModelName(myBicycleName);
	} // nameingBicycle
	

	// 자전거의 최종 정보 확인
	public void printInfo() {	
		System.out.println("-------------------------------------------------Bicycle::print() invoked");

		DecimalFormat decFormat = new DecimalFormat("###,###"); // 문자열 포맷 - 3자리마다 콤마찍으려고 넣음.
		System.out.println("========================================================================");
		System.out.println("\t 최종 확인 : 선택하신 부품 목록을 출력합니다.");
		System.out.println("========================================================================");
		System.out.println("modelNamel \tcompany \tprice \tcolor \ttype");
		System.out.println("========================================================================");

		this.frame.printInfo();
		this.wheel.printInfo();
		this.handle.printInfo();
		this.seat.printInfo();
		this.pedal.printInfo();
		this.brake.printInfo();
		this.gearLever.printInfo();


		System.out.println("========================================================================");
		System.out.println("나의 자전거 이름 : " + this.modelName + "\n자전거 조립 회사 : " + this.company + "\n결제할 총 가격   : " + decFormat.format(this.price) +" 원" + "\n자전거의 색상    : " + this.color);
	}//print Bike

}//end class
