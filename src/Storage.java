package quest.bicycle;


public class Storage { // 싱글톤

	// field
	private static final Storage STORAGE;
	
	private static int money;					// 매출

	// 창고
	static private PartOfBicycle	[/*partNum*/]		[/*partIdx*/] parts = new PartOfBicycle	[ PartName.size() ] [] ;;	
	// 부품 2차원 배열 생성			ㄴ 대분류(부품종류)	ㄴ 소분류(부품)							ㄴ 부품의 종류수	ㄴ 부품의 배열을 main에서 넣을 예정
	// 다형성 1 : 부모 타입의 참조변수에는 모든 자식 객체를 담을 수 있음.
	// 부품(부모) 배열에 각 부품(자식)배열을 넣을 예정

	
	// static initializer--------------------------------------------------------------------------------------------------
	static {	
		System.out.println("-------------------------------------------------Storge::static initializer invoked");

		STORAGE = new Storage();
		Storage.money = 0;
	} // static initializer

	
	// constructor---------------------------------------------------------------------------------------------------------
	private Storage() {						
		System.out.println("-------------------------------------------------Storge::default construct invoked");
	} // Default constructor
	
	
	// method---------------------------------------------------------------------------------------------------------------
	public static Storage getStorgeInstance() {
		System.out.println("-------------------------------------------------Storge::getStorgeInstance invoked");
		
		return STORAGE;
	} // getStorgeInstance
	
	public static int getMoney() {
		System.out.println("-------------------------------------------------Storge::getMoney() invoked");
		
		return money;
	} // getMoney

	// 받은 돈을 매출에 추가
	public static void takeMoney(int money) {
		System.out.println("-------------------------------------------------Storge::takeMoney() invoked");

		Storage.money = +money;
	} // takeMoney
	
	// 부품종류의 인덱스를 인자로 넣으면 인덱스에 있는 부품의 배열을 반환
	public static PartOfBicycle[] getPartArr(int partNum) {
		System.out.println("-------------------------------------------------Storge::getParts() invoked");
		
		return parts[partNum];
	} // getPartArr(partNum)


	// 부품종류 인덱스와 부품의 인덱스를 인자로 전달하면 그에 맞는 부품을 창고에서 반환.
	public static PartOfBicycle getPartOfBicycle(int partNum, int partIdx ) {
		System.out.println("-------------------------------------------------Storge::getPartOfBicycle(partNum, partIdx) invoked");
		
		return parts[partNum][partIdx];
	} // getPartOfBicycle
	
	// 부품종류의 인덱스와 부품의 배열을 인자로 넣으면 창고에 저장
	public static void setPartArr(int partNum, PartOfBicycle[] partArr) {
		System.out.println("-------------------------------------------------Storge::setPartArr(partNum, partArr) invoked");

		Storage.parts[partNum] = partArr;
	} // setPartArr
	//---------------------------------------------------------------------------------------------------------겟셋메서드
	
	// 부품의 종류,넘버링을 보여주는 메서드. 향상된 for문으로 enum타입 순회하며 출력
	public static void showPartOfBicycle() {
		System.out.println("-------------------------------------------------Storge::showPartName() invoked");

		
		for( PartName name : PartName.values()) {
			System.out.println(name.ordinal() + "번 : " + name.name());
		} // for
		
	} // showPartName
	
	// 부품종류의 인덱스를 인자로 넣으면 창고에 저장된 부품의 배열을 보여주는 메서드.
	// 향상된 for문으로 배열을 순회하며 출력
	public static void showPartInfo(int partNum) {
		System.out.println("-------------------------------------------------Storge::showPartArr(partNum) invoked");
		System.out.println("modelName \tcompany \tprice \tcolor \ttype");
		System.out.println("========================================================================");
		
		
		for ( PartOfBicycle part : parts[partNum]) {
			part.printInfo();
		} // for
		
	} //showPartArr
	
} // end class
