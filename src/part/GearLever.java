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

	int HP; 				//자전거의 내구도

//================================================
//	생성자
//================================================

	
	public GearLever( ) {
		System.out.println("GearLever::default constructor invoked");
	} // Gearlever default constructor

	public GearLever(String modelName, int price, double weight, int HP ) {
		this(modelName ,null, 0, price, 0, 0, weight, HP);
		
		System.out.println("GearLever::constructor(Stirng, int, double, int) invoked");
	} // Gearlever constructor(Stirng, int, double, int) constructor

	public GearLever (String modelName, String texture, int serialNum, int price, int minGear, int maxGear, double weight, int HP) {
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
		
		this.HP = HP;
	} // Gearlever constructor(String, String, int, int, int, int, double, int) constructor

//================================================
//	메소드
//================================================
	
	void ride() {
		// 호출시 고장 여부를 판단
		// 고장이면 메서드 종료
		// 아니라면 정상작동
		// 랜덤으로 고장나기때문에 고장이 없으면 따로 실행문X
		
		System.out.println("GearLever::ride() invoked");
		
		this.isBroken();
		
		if(this.isBroken) {
			return;
		} else {
		;; //PASS 
		} // if-else
	} // ride()
	
	void isBroken() {
		// 호출시 고장여부를 판단
		// 0 ~ (가격/100)까지의 랜덤한 숫자중 44거 나오면 고장
		// 그 외에는 정상작동
		// 가격이 10000원이상이 아닐경우 1/100의 확률
		
		System.out.println("GearLever::isBroken() invoked");
		
		if(this.price > 10000) {
    		this.HP = (int)(Math.random()* (this.price / 100) );
    		//내구도는 가격의 / 100에 비례한다. 
    	} else {
    		this.HP = (int)(Math.random()* 100 );
		} // if-else
		
		if( this.HP == 44) {
			this.isBroken = true;
			System.out.println("GEARLEVER가 고장났습니다.");
		} // if 랜덤으로 44라는 숫자가 나오면 고장
		
	} // isBroken
	
} //end class
