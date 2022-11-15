package quest.bicycle;


public class Wheel 
	extends PartOfBicycle {


	// field
	private final String TYPE;


	// Constructor
	public Wheel(String MODEL_NAME, String COMPANY, int PRICE, String TYPE, int HP) {
		super(PartName.WHEEL, MODEL_NAME, COMPANY, PRICE, HP);

		this.TYPE = TYPE;

		System.out.println("-------------------------------------------------Wheel::Constructor(MODEL_NAME, COMPANY, PRICE, TYPE, HP) invoked");
	} // constructor


	//method 
	@Override
	public void printInfo() {
//		System.out.println("-------------------------------------------------Wheel::printInfo() invoked");

		System.out.println(this.getMODEL_NAME() + "\t\t" + this.getCOMPANY() + "\t" +  this.getPRICE() + "\t\t" + this.TYPE);
	} // printInfo

} // end class

