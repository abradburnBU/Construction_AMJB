
/*
 * This class creates and sets the variables for the Residential class
 * This class is also the parent of the Apartment and SingleFamilyHome classes and passes on the inherited variables
 * @author Austin Bradburn
 */

public class Residential extends Building{

	protected int numBedrooms; //This int holds the number of bedrooms for residences
	protected int numBathrooms; //This int holds the number of bathrooms for the residences
	protected boolean laundryRoom; //This boolean holds whether or not the Residence has a laundryroom
	
	public Residential() {
		
		numBedrooms=0;
		numBathrooms=0;
		laundryRoom=false;
		
	}//ends empty constructor - initializes the variables in the class
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		this.numBedrooms=numBedrooms;
		this.numBathrooms=numBathrooms;
		this.laundryRoom=laundryRoom;
		this.projectName=projectName;
		this.completeAddress=completeAddress;
		this.totalSquareFeet=totalSquareFeet;
		this.occupancyGroup=occupancyGroup;
		this.subgroup=subgroup;
		
	}//ends Preferred Constructor - Updates the variables in the class
	
	public void draw() {
		
		System.out.println("Drawing Code for Residential");
		
	}//ends draw
	
	/*
	 * Prints the Statement based on what class is being run
	 */
	
	public String displayData() {
		
		StringBuilder sb= new StringBuilder(super.displayData());
		sb.append("Number of Bedrooms: "+getNumBedrooms()+"\n");
		sb.append("Number of Bathrooms: "+getNumBathrooms()+"\n");
		sb.append("Laundry Room: "+isLaundryRoom()+"\n");
		
		return sb.toString();
		
	}//ends displayData
	
	/*
	 * Creates a collection that displays what is contained within each of the Strings
	 */
	
	/** GETTERS SETTERS AND toString **/
	
	protected int getNumBedrooms() {
		return numBedrooms;
	}

	protected void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	protected int getNumBathrooms() {
		return numBathrooms;
	}

	protected void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	protected boolean isLaundryRoom() {
		return laundryRoom;
	}

	protected void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}

	/*
	 * All of the getters and setters that are used for the various variables within the class
	 */
	
	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + "]";
	}

}//ends Residential
