
package part;

public class Wheel {

//==============================================
//	필드
//==============================================

	String 	company; 		//브랜드 
	String 	modelName;		//모델명
	String	type;			//종류  ex) 클린처, 튜브리스, 튜블러 ...
	int 	serialNum;		//시리얼넘버
	int 	price;			//가격
	double	weight;			//무게
	double	minPressure;	//공기압 최소
	double	maxPressure;	//공기압 최대
	double	size;			//크기	단위 : cm

	boolean isBroken;		//고장났는지 멀쩡한지 
	double	pressure;		//공기압
	
//==============================================
//	생성자
//==============================================

	public Wheel() {
		System.out.println("Wheel::default constructor invoked");
	} // Wheel default constructor
	
	public Wheel(String company, String modelName, int price, double weight, double size) {
		 this(company, modelName, null, 0, price, weight, 0.0, 0.0, size);
		
		System.out.println("Wheel::Wheel( String, String, int, double, double ) construct invoked");
	} // Wheel(String , String , String , int , double , double) constructor
	
	
	public Wheel(String company, String modelName, String type, int serialNum, int price, double weight, double minPressure, double maxPressure, double size) {
		System.out.println("Wheel::Wheel( String , String , String , int , int , double , double , double , double ) construct invoked");
		
		this.company = company;
		this.modelName = modelName;
		this.type = type;
		this.serialNum = serialNum;
		this.price = price;
		this.weight = weight;
		this.minPressure = minPressure;
		this.maxPressure = maxPressure;
		this.size = size;
		
		this.isBroken = false;
		this.pressure = 0;
	} // Wheel(String , String , String , int , int , double , double , double , double) constructor
	
} // end class

