package quest.bicycle;


public class Frame 
	extends PartOfBicycle {


	// field
	private final String COLOR; 

	
	// Constructor
	public Frame(String MODEL_NAME, String COMPANY, int PRICE, String COLOR, int HP) {
		super(PartName.FRAME, MODEL_NAME, COMPANY, PRICE, HP);
		
		this.COLOR = COLOR;
		
		System.out.println("-------------------------------------------------Frame::Constructor(MODEL_NAME, COMPANY, PRICE, COLOR, HP) invoked");
	} // constructor
	
	
	//method 
	public String getColor() {
//		System.out.println("Frame::getColor() invoked");

		return COLOR;
	} // getColor
	
	@Override
	public void printInfo() {
//		System.out.println("-------------------------------------------------COLOR::printInfo() invoked");
		
		System.out.println(this.getMODEL_NAME() + "\t\t" + this.getCOMPANY() + "\t" + this.getPRICE() + "\t" + this.COLOR);
	} // print

	
} // end class

