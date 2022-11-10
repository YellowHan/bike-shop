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
	
	int HP; 				//자전거의 내구도
	
//==============================================
//	생성자
//==============================================

	public Pedal() {
		System.out.println("Pedal::default constructor invoked");
	} // Pedal default constructor
	
	public Pedal(String modelName, String type, int price, double weight, int HP) {
		this(modelName, type, 0,  price,  weight, HP);
		
		System.out.println("Pedal::Pedal(String, String, int, double, int) invoked");
	} // Pedal Pedal(String, String, int, double, int) constructor

	public Pedal(String modelName, String type, int serialNum, int price, double weight, int HP) {
		System.out.println("Pedal::Pedal(String, String, int, int, double, int) invoked");
		
		this.modelName = modelName;
		this.type = type;
        this.serialNum = serialNum;
        this.price = price;
        this.weight = weight;
        
        this.isBroken = false;
        
        this.HP = HP;
        
	} // Pedal Pedal(String, String, int, int, double, int) constructor
	
//================================================
//	메소드
//================================================
	
	 void ride() { 
			// 호출시 고장 여부를 판단
			// 고장이면 메서드 종료
			// 아니라면 HP -1
			
			System.out.println("Pedal::run() invoke");
		
			this.isBroken();
			
			if(this.isBroken) {
				return;
			} else {
			this.HP--;
			} // if-else
		} // ride()
		
		void isBroken() {
			// 호출시 HP가 0이면 isBorke 값을 true로 변경
			
			System.out.println("Pedal::isBroken() invoked");
			
			if( this.HP == 0) {
				this.isBroken = true;
				System.out.println("PEDAL가 고장났습니다.");
			} // if 내구도가 0이면 고장
		} // isBroken
	
	
} //end class