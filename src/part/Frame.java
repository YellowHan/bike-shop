package part;

public class Frame {

//================================================
//	필드
//================================================

    String 	company;        //브랜드
    String 	modelName;      //모델명
    String 	color;          //색상
    String 	texture;        //재질 ex) 강철, 알루미늄, 카본, 티타늄 등
    int		serialNum;		//시리얼넘버
    int		price;          //가격
    double 	weight;         //무게 
    double 	height;         //높이
    double	width;          //길이

    boolean isBroken;       //고장났는지 멀쩡한지
    
	int HP; 				//자전거의 내구도

//==============================================
//	생성자
//==============================================

    public Frame() {
        System.out.println("Frame::default constructor() invoked.");
    } // Frame default constructor

    public Frame(String company, String modelName, String color, String texture, int serialNuml, int price, double weight, double height, double width, int HP) {
        this.company = company;
        this.modelName = modelName;
        this.color = color;
        this.texture = texture;
        this.serialNum = serialNuml;
        this.price = price;
        this.weight = weight;
        this.height = height;
        this.width = width;
        
        this.isBroken = false;
        
        this.HP = HP;
        
        System.out.println("Frame::Constructor(String, String, String, String, int, int, double, double, double, int) invoked.");
    } // Frame constructor(String, String, String, String, int, int, double, double, double, int)

//==============================================
//	메소드
//==============================================
    
    void ride() {
		// 호출시 고장 여부를 판단
		// 고장이면 메서드 종료
		// 아니라면 정상작동
		// 랜덤으로 고장나기때문에 고장이 없으면 따로 실행문X
		
		System.out.println("Frame::ride() invoked");
		
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
		
		System.out.println("Frame::isBroken() invoked");
		
		if(this.price > 10000) {
    		this.HP = (int)(Math.random()* (this.price / 100) );
    		//내구도는 가격의 / 100에 비례한다. 
    	} else {
    		this.HP = (int)(Math.random()* 100 );
		} // if-else
		
		if( this.HP == 44) {
			this.isBroken = true;
			System.out.println("사고가 났습니다.");
			System.out.println("FRAME가 고장났습니다.");
		} // if 랜덤으로 44라는 숫자가 나오면 고장
		
	} // isBroken
    
    

} //end class
