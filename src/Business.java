
/*
 * This class is the parent class of Mall and passes on the inherited variables from Building
 * This class also sets new variables unique to Buildings of the Business type
 * @author Austin Bradburn
 */

public class Business extends Building {
	
	protected int numRentableUnits; //This int holds the Number of Rentable Units available in the Business
	
	public Business() {
		
		numRentableUnits=0;
		
	}//ends empty Constructor - intializes the variable in the class
	
	public Business (String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		this.numRentableUnits=numRentableUnits;
		this.projectName=projectName;
		this.completeAddress=completeAddress;
		this.totalSquareFeet=totalSquareFeet;
		this.occupancyGroup=occupancyGroup;
		this.subgroup=subgroup;
		
	}//ends preferred constructor - updates the variables in the class
	
	public void draw() {
		
		System.out.println("Drawing code for Business");
		
	}//ends draw
	
	/*
	 * Prints the Statement based on what class is being run
	 */
	
	public String displayData() {
		
		StringBuilder sb=new StringBuilder(super.displayData());
		sb.append("Number of Rentable Units: "+getNumRentableUnits()+"\n");
		
		return sb.toString();
		
	}//ends displayData
	
	/*
	 * Creates a collection that displays what is contained within each of the Strings
	 */
	
	/** GETTERS SETTERS AND toString **/

	protected int getNumRentableUnits() {
		return numRentableUnits;
	}

	protected void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	
	/*
	 * All of the getters and setters that are used for the various variables within the class
	 */
	
	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + "]";
	}
	
	
	
}//ends Business Class
