
/*
 * This class creates and sets the variables for the Mall class and runs the methods related to the Mall class
 * @author Austin Bradburn
 */

public class Mall extends Business{

	private int numRentedUnits; //This int holds the number of Rented Units in the Mall class
	private double medianUnitSize; //This double holds the median size of Units in the Mall
	private int numParkingSpaces; //This int holds the Number of Parking Spaces at the Mall
	
	public Mall() {
		
		numRentedUnits=0;
		medianUnitSize=0.0;
		numParkingSpaces=0;
		
	}//Closes empty constructor - initializes the variables in the class
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
		
		this.numRentedUnits=numRentedUnits;
		this.medianUnitSize=medianUnitSize;
		this.numParkingSpaces=numParkingSpaces;
		this.projectName=projectName;
		this.completeAddress=completeAddress;
		this.totalSquareFeet=totalSquareFeet;
		this.occupancyGroup=occupancyGroup;
		this.subgroup=subgroup;
		this.numRentableUnits=numRentableUnits;
		
	}//Closes preferred constuctor - Updates the variables in the class
	
	public void draw() {
		
		System.out.println("Drawing Code for Mall");
		
	}//Closes draw
	
	/*
	 * Prints the Statement based on what class is being run
	 */
	
	public String displayData() {
		
		StringBuilder sb=new StringBuilder(super.displayData());
		sb.append("Number of Rented Units: "+getNumRentedUnits()+"\n");
		sb.append("Median Unit Size: "+getMedianUnitSize()+"\n");
		sb.append("Number of Parking Spaces: "+getNumParkingSpaces()+"\n");
		
		return sb.toString();
		
	}//Closes displayData
	
	/*
	 * Creates a collection that displays what is contained within each of the Strings
	 */
	
	/** GETTERS SETTERS AND toString **/

	protected int getNumRentedUnits() {
		return numRentedUnits;
	}

	protected void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	protected double getMedianUnitSize() {
		return medianUnitSize;
	}

	protected void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	protected int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	protected void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	
	/*
	 * All of the getters and setters that are used for the various variables within the class
	 */
	
	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + "]";
	}
	
}//Closes Mall
