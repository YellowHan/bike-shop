package part;


public class GearLever {

//================================================
//	필드
//================================================

	String 	modelName;		//모델명
	String	texture; 		//재질 ex) 강철, 알루미늄, 카본, 티타늄 등
	int 	serialNum;		//시리얼넘버
	int 	price;			//가격
	int 	minGear;		//기어 최소값 
	int 	maxGear;		//기어 최대값
	double	weight;			//무게

	boolean	isBroken;		//고장났는지 멀쩡한지 
	int 	gear;			//현재 기어 상태 ex)1 ~ 21

//================================================
//	생성자
//================================================

	
	public GearLever( ) {
		System.out.println("GearLever::default constructor invoked");
	} // Gearlever default constructor

	public GearLever(String modelName, int price, double weight ) {
		this(modelName ,null, 0, price, 0, 0, weight);
		
		System.out.println("GearLever::constructor(Stirng, int, double) invoked");
	} // Gearlever constructor(Stirng, int, double) constructor

	public GearLever (String modelName, String texture, int serialNum, int price, int minGear, int maxGear, double weight) {
		System.out.println("GearLever::constructor(String, String, int, int, int, int, double) invoked");

		this.modelName = modelName;
		this.texture = texture;
		this.serialNum = serialNum;
		this.price = price;
		this.minGear = minGear;
		this.maxGear = maxGear;
		this.weight = weight;

		this.isBroken = false;
		this.gear = 0;
	} // Gearlever constructor(String, String, int, int, int, int, double) constructor

} //end class
