package part;

public class Seat {
//================================================
//  필드 
//================================================
	
	String modelName;		//모델명
	String 	texture; 		//재질 	ex) 가죽, 카본, 경량 티타늄 등
	int 	serialNum;		//시리얼넘버
	int 	price;			//가격
	double	weight;			//무게

	boolean isBroken;		//고장났는지 멀쩡한지 
	
//================================================
//	생성자 
//================================================	

	public Seat() {
		System.out.println("Seat::default Constructor invoked.");
		
	} // Seat default constructor

	public Seat(String modelName, String texture, int price, double weight ) {		
		this(modelName, texture, 0, price, weight);
		
		System.out.println("Seat::Seat(String, String, int, double) invoked."); 
	} // Seat Seat(String, String, int, double) constructor
	
	public Seat(String modelName, String texture, int serialNum, int price, double weight) {
		System.out.println("Seat::Seat(String, String, int, int, double) invoked."); 
		
		this.modelName = modelName;				//모델명
		this.texture = texture;					//재질
		this.serialNum = serialNum;				//제조일
		this.price = price;						//가격
		this.weight = weight;					//무게
		
		this.isBroken = false;
	} // Seat Seat(String, String, int, int, double) constructor

} //end class
