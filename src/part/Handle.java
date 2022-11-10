package part;


public class Handle {

//================================================
//	필드
//================================================
	
	String 	modelName;		//모델명
	String	type;			//종류	ex)	플랫바, 라이저바, 드롭바, 에어로바 등
	int 	serialNum;		//시리얼넘버
	int 	price;			//가격
	double	weight;			//무게

	boolean isBroken;		// 고장났는지 멀쩡한지
	
	int HP; 				//자전거의 내구도
	
//================================================
//	생성자	
//================================================
	
	public Handle() {
		System.out.println("Handel::default constructor invoked");
	} // Handle default constructor
	
	public Handle(String modelName, String type, int price, double weight, int HP) {
		this(modelName, type, 0,  price,  weight, HP);
		
		System.out.println("Handel::Handel(String, String, int, double, int) invoked");
	} // Pedal Handel(String, String, int, double, int) constructor

	public Handle(String modelName, String type, int serialNum, int price, double weight, int HP) {
		System.out.println("Handel::Handel(String, String, int, int, double, int) invoked");
	
		this.modelName = modelName;
		this.type = type;
        this.serialNum = serialNum;
        this.price = price;
        this.weight = weight;
        
        this.isBroken = false;
        
        this.HP = HP;
        
	} // Pedal Handel(String, String, int, int, double, int) constructor
	
//================================================
//	메소드
//================================================
	
	void ride() {
		// 호출시 고장 여부를 판단
		// 고장이면 메서드 종료
		// 아니라면 정상작동
		// 랜덤으로 고장나기때문에 고장이 없으면 따로 실행문X
		
		System.out.println("Handle::ride() invoked");
		
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
		
		System.out.println("Handle::isBroken() invoked");
		
		if(this.price > 10000) {
    		this.HP = (int)(Math.random()* (this.price / 100) );
    		//내구도는 가격의 / 100에 비례한다. 
    	} else {
    		this.HP = (int)(Math.random()* 100 );
		} // if-else
		
		if( this.HP == 44) {
			this.isBroken = true;
			System.out.println("HANDLE가 고장났습니다.");
		} // if 랜덤으로 44라는 숫자가 나오면 고장
		
	} // isBroken
	
} // end class
