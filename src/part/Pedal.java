package part;


public class Pedal {

//================================================
//	필드
//================================================
	
	String 	modelName;		//모델명
	String	type;			//종류	ex) 평 페달, 토클립 페달, 클릿 페달 등
	int 	serialNum;		//시리얼넘버
	int 	price;			//가격
	double	weight;			//무게

	boolean	isBroken;		//고장났는지 멀쩡한지 
	
//==============================================
//	생성자
//==============================================

	public Pedal() {
		System.out.println("Pedal::default constructor invoked");
	} // Pedal default constructor
	
	public Pedal(String modelName, String type, int price, double weight) {
		this(modelName, type, 0,  price,  weight);
		
		System.out.println("Pedal::Pedal(String, String, int, double) invoked");
	} // Pedal Pedal(String, String, int, double) constructor

	public Pedal(String modelName, String type, int serialNum, int price, double weight) {
		System.out.println("Pedal::Pedal(String, String, int, int, double) invoked");
		
		this.modelName = modelName;
		this.type = type;
        this.serialNum = serialNum;
        this.price = price;
        this.weight = weight;
        
        this.isBroken = false;
        
	} // Pedal Pedal(String, String, int, int, double) constructor
	
} //end class