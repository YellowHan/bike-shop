package part;

public class Brake {

//================================================
//	필드
//================================================

	String 	modelName;		//모델명
	String 	type;			//종류 ex)	캘리퍼 브레이크, 림 브레이크, 디스크 브레이크
	int 	serialNum;		//시리얼넘버
	int 	price;			//가격
	double	weight;			//무게
	
	boolean isBroken;		//고장났는지 멀쩡한지 	
	
//================================================
//	생성자 
//================================================

	public Brake(){
		System.out.println("Brake::default constructor invoked");
	} // Brake default constructor
	
	public Brake(String modelName, String type, int price, double weight) {
		this(modelName, type, 0, price, weight);
		
		System.out.println("Brake::Brake(String, String, int, double) invoked");
	} // Brake (String, String, int, double) constructor
		
	public Brake(String modelName, String type, int serialNum, int price, double weight){
		
		System.out.println("Brake::Brake(String, String, int, int, double) invoked");
		this.modelName 	= modelName;
		this.type 		= type;			
		this.serialNum 	= serialNum;	
		this.price 		= price;		
		this.weight 	= weight;	
		
		this.isBroken = false;			
	} // Brake Brake(String, String, int, int, double) constructor
	
} //end class
