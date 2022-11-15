package quest.bicycle;


public class Pedal 
	extends PartOfBicycle {


	// field
	private final String TYPE;


	// Constructor
	public Pedal(String MODEL_NAME, String COMPANY, int PRICE, String TYPE, int HP) {
		super(PartName.PEDAL, MODEL_NAME, COMPANY, PRICE, HP);

		this.TYPE = TYPE;

		System.out.println("-------------------------------------------------Pedal::Constructor(MODEL_NAME, COMPANY, PRICE, TYPE, HP) invoked");
	} // constructor


	//method 
	@Override
	public void printInfo() {
//		System.out.println("-------------------------------------------------Pedal::printInfo() invoked");

		System.out.println(this.getMODEL_NAME() + "\t\t" + this.getCOMPANY() + "\t" +  this.getPRICE() + "\t\t" + this.TYPE);
	} // printInfo

} // end class
