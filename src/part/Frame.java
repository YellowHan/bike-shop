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

//==============================================
//	생성자
//==============================================

    public Frame() {
        System.out.println("Frame::default constructor() invoked.");
    } // Frame default constructor

    public Frame(String company, String modelName, String color, String texture, int serialNuml, int price, double weight, double height, double width) {
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
        
        System.out.println("Frame::Constructor(String, String, String, String, int, int, double, double, double) invoked.");
    } // Frame default constructor

//==============================================
//	메소드
//==============================================

} //end class
