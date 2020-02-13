
/*
 * This class creates and sets the variables for the Apartment class and runs methods related to the Apartment class
 * @author Austin Bradburn
 */

public class Apartment extends Residential {

	private int numRentableUnits; //This int holds the number of rentable units in the Apartment class
	private double avgUnitSize; //This double holds the average Unit Size of the Apartments
	private boolean parkingAvailable; //This boolean determines whether or not the Apartment has parking available
	
	public Apartment() {
		
		numRentableUnits=0;
		avgUnitSize=0.0;
		parkingAvailable=false;
		
	}//ends empty constructor - initializes the variables in the class
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		
		this.numRentableUnits=numRentableUnits;
		this.avgUnitSize=avgUnitSize;
		this.parkingAvailable=parkingAvailable;
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
		
		System.out.println("Drawing Code for Apartment");
		
	}//ends draw
	
	/*
	 * Prints the Statement based on what class is being run
	 */
	
	public String displayData() {
		
		StringBuilder sb= new StringBuilder(super.displayData());
		sb.append("Number of Rentable Units: "+getNumRentableUnits()+"\n");
		sb.append("Avergae Unit Size: "+getAvgUnitSize()+"\n");
		sb.append("Parking Available: "+isParkingAvailable()+"\n");
		
		return sb.toString();
		
	}//ends displayData
	
	/*
	 * Creates a collection that displays what is contained within each of the Strings
	 */
	
	protected int getNumRentableUnits() {
		return numRentableUnits;
	}

	protected void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	protected double getAvgUnitSize() {
		return avgUnitSize;
	}

	protected void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	protected boolean isParkingAvailable() {
		return parkingAvailable;
	}

	protected void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
	
	/*
	 * All of the getters and setters that are used for the various variables within the class
	 */
	
	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}
	
	
	
	
}//ends Apartment
