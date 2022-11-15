package quest.bicycle;


public abstract class PartOfBicycle{
	// 부품 객체들의 부모클래스를 추상 클래스로 만듦
	
	//field
	private final PartName 		PART_NAME;        		//부품이름	enum 타입의 상수 활용
	private final int 			PART_NUMBER;      		//부품코드	enum 타입에서 int 값으로 정의
	private final String		MODEL_NAME;				//모델이름	
	private final String 		COMPANY;        		//브랜드
	private final int			PRICE;          		//가격
	
	private int HP;										//내구도
	
	private boolean isBorken;							//고장여부
	

	//Constructor
	public PartOfBicycle(PartName PART_NAME, String MODEL_NAME, String COMPANY, int PRICE, int HP) {
		System.out.println("-------------------------------------------------PartOfBicycle::Constructor(PART_NUMBER, COMPANY, PRICE)");
		
		this.PART_NAME = PART_NAME;
		this.PART_NUMBER = this.PART_NAME.ordinal();	//enum.ordinal() enum상수가 적힌 순서 반환 
		this.MODEL_NAME = MODEL_NAME;
		this.COMPANY = COMPANY;
		this.PRICE = PRICE;
		this.HP = HP;
		
		if( this.HP <= 0) {								//HP가 0이하면 고장난 부품
			this.isBorken = true;
		} else {
			this.isBorken = false;
		} // if-else
		
		
	} // Constructor(PART_NAME, MODEL_NAME, COMPANY, PRICE)

	// method()
	public String getPART_NAME() {
//		System.out.println("-------------------------------------------------PartOfBicycle::getPART_NUMBER() invoked");

		return ""+PART_NAME;
	} // getPART_NAME

	public int getPART_NUMBER() {
//		System.out.println("-------------------------------------------------PartOfBicycle::getPART_NUMBER() invoked");

		return this.PART_NUMBER;
	} // getPART_NUMBER
	
	public String getMODEL_NAME() {
//		System.out.println("-------------------------------------------------PartOfBicycle::getMODEL_NAME() invoked");

		return MODEL_NAME;
	} // getMODEL_NAME

	public String getCOMPANY() {
//		System.out.println("-------------------------------------------------PartOfBicycle::getCOMPANY() invoked");

		return COMPANY;
	} // getCOMPANY

	public int getPRICE() {
//		System.out.println("-------------------------------------------------PartOfBicycle::getPRICE() invoked");

		return PRICE;
	} //getPRICE
	
	public int getHP() {
//		System.out.println("-------------------------------------------------PartOfBicycle::getHP() invoked");
		
		return HP;
	} // getHP

	public void setHP(int hP) {
//		System.out.println("-------------------------------------------------PartOfBicycle::setHP(hP) invoked");

		HP = hP;
	} // setHP

	// 고장여부 전
	public boolean isBorken() {
//		System.out.println("-------------------------------------------------PartOfBicycle::isBorken() invoked");
		
		return isBorken;
	} //isBorken
	
	
	public abstract void printInfo();
	// 추상 메서드 모든 자식 클래스에서 재정의 필요 >> @Override
	
} // end class
