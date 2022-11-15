package quest.bicycle;


public class Brake
	extends PartOfBicycle {


	// field
	private final String TYPE;

	// Constructor
	public Brake(String MODEL_NAME, String COMPANY, int PRICE, String TYPE, int HP) {
		super(PartName.BRAKE, MODEL_NAME, COMPANY, PRICE, HP);
		
		this.TYPE = TYPE;
		
		System.out.println("-------------------------------------------------Brake::Constructor(MODEL_NAME, COMPANY, PRICE, TYPE, HP) invoked");
	} // constructor
	
	
	//method 
	@Override
	public void printInfo() {
//		System.out.println("-------------------------------------------------Brake::printInfo() invoked");
		
		System.out.println(this.getMODEL_NAME() + "\t\t" + this.getCOMPANY() + "\t" +  this.getPRICE() + "\t\t" + this.TYPE);
	} // printInfo
	
} // end class

