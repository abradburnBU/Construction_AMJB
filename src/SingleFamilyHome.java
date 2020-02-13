
/*
 * This class creates and sets the variables from the SingleFamilyHome class and runs methods related to the class
 * @author Austin Bradburn
 */

public class SingleFamilyHome extends Residential{
	
	private boolean garage; //Boolean that holds whether or not the home has a garage
	
	public SingleFamilyHome() {
		
		garage=false;
		
	}//ends empty constructor - initializes the variable in the class
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		
		this.garage=garage;
		this.projectName=projectName;
		this.completeAddress=completeAddress;
		this.totalSquareFeet=totalSquareFeet;
		this.occupancyGroup=occupancyGroup;
		this.subgroup=subgroup;
		this.numBedrooms=numBedrooms;
		this.numBathrooms=numBathrooms;
		this.laundryRoom=laundryRoom;
		
	}//ends preferred constructor - Updates the variables in the class
	
	public void draw() {
		
		System.out.println("Drawing Code for Single Family Home");
		
	}//ends draw
	
	/*
	 * Prints the Statement based on what class is being run
	 */
	
	public String displayData() {
		
		StringBuilder sb=new StringBuilder(super.displayData());
		sb.append("Garage: "+isGarage()+"\n");
		
		return sb.toString();
		
	}//ends displayData
	
	/*
	 * Creates a collection that displays what is contained within each of the Strings
	 */
	
	/** GETTERS SETTERS AND toString **/
	
	protected boolean isGarage() {
		return garage;
	}

	protected void setGarage(boolean garage) {
		this.garage = garage;
	}

	/*
	 * All of the getters and setters that are used for the various variables within the class
	 */
	
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + "]";
	}
	
}//ends SingleFamilyHome
