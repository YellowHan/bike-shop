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
	
//================================================
//	생성자	
//================================================
	
	public Handle() {
		System.out.println("Handel::default constructor invoked");
	} // Handle default constructor
	
	public Handle(String modelName, String type, int price, double weight) {
		this(modelName, type, 0,  price,  weight);
		
		System.out.println("Handel::Handel(String, String, int, double) invoked");
	} // Pedal Handel(String, String, int, double) constructor

	public Handle(String modelName, String type, int serialNum, int price, double weight) {
		System.out.println("Handel::Handel(String, String, int, int, double) invoked");
		
		this.modelName = modelName;
		this.type = type;
        this.serialNum = serialNum;
        this.price = price;
        this.weight = weight;
        
        this.isBroken = false;
        
	} // Pedal Handel(String, String, int, int, double) constructor
	
} // end class
