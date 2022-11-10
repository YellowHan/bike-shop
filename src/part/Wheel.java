
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
	
	int HP; 				//자전거의 내구도
	
//==============================================
//	생성자
//==============================================

	public Wheel() {
		System.out.println("Wheel::default constructor invoked");
	} // Wheel default constructor
	
	public Wheel(String company, String modelName, int price, double weight, double size, int HP) {
		 this(company, modelName, null, 0, price, weight, 0.0, 0.0, size, HP);
		
		System.out.println("Wheel::Wheel( String, String, int, double, double, int) construct invoked");
	} // Wheel(String , String , String , int , double , double, int ) constructor
	
	
	public Wheel(String company, String modelName, String type, int serialNum, int price, double weight, double minPressure, double maxPressure, double size, int HP) {
		System.out.println("Wheel::Wheel( String , String , String , int , int , double , double , double , double , int ) construct invoked");
		
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
		
		this.HP = HP;
	} // Wheel(String , String , String , int , int , double , double , double , double, int) constructor
	
	
//================================================
//	메소드
//================================================
	
	 void ride() { 
			// 호출시 고장 여부를 판단
			// 고장이면 메서드 종료
			// 아니라면 HP -1
			
			System.out.println("Wheel::run() invoke");
		
			this.isBroken();
			
			if(this.isBroken) {
				return;
			} else {
			this.HP--;
			} // if-else
		} // ride()
		
		void isBroken() {
			// 호출시 HP가 0이면 isBorke 값을 true로 변경
			
			System.out.println("Wheel::isBroken() invoked");
			
			if( this.HP == 0) {
				this.isBroken = true;
				System.out.println("WHEEL가 고장났습니다.");
			} // if 내구도가 0이면 고장
		} // isBroken
	
} // end class

