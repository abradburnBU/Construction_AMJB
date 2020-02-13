
/*
 * This class represents a superclass (Building) that contains all of the specific information
 * for all of the subsequent types of buildings.
 * @author Austin Bradburn
 */

public class Building {
	
	protected String projectName; //This String holds the name of the project
	protected String completeAddress; //This String holds the complete address of the building
	protected double totalSquareFeet; //This double holds the total square footage of the building
	protected String occupancyGroup; //This String holds the occupancy group of the individual building
	protected String subgroup; //This String contains the subgroup from the given table
	
	public Building() {
		
		projectName="";
		completeAddress="";
		totalSquareFeet=0.0;
		occupancyGroup="";
		subgroup="";
		
	}//ends empty constructor - initializes the variables in the class
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		this.projectName=projectName;
		this.completeAddress=completeAddress;
		this.totalSquareFeet=totalSquareFeet;
		this.occupancyGroup=occupancyGroup;
		this.subgroup=subgroup;
		
	}//ends preferred constructor - updates the variables in the class
	

	public void draw() {
		
		System.out.println("Drawing Code for Building");
	
	}//ends draw
	
	/*
	 * Prints the Statement based on what class is being run
	 */
	
	public String displayData() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Project Name: "+getProjectName() +"\n" );
		sb.append("Complete Address: "+getCompleteAddress() +"\n");
		sb.append("Total Square Feet: "+getTotalSquareFeet() +"\n");
		sb.append("Occupancy Group: "+getOccupancyGroup() +"\n");
		sb.append("Occupancy Subgroup: "+getSubgroup() +"\n");
		
		return sb.toString();
		
	}//ends displayData
	
	/*
	 * Creates a collection that displays what is contained within each of the Strings
	 */

	/** GETTERS, SETTERS, AND toString **/
	
	protected String getProjectName() {
		return projectName;
	}

	protected void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	protected String getCompleteAddress() {
		return completeAddress;
	}

	protected void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	protected double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	protected void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	protected String getOccupancyGroup() {
		return occupancyGroup;
	}

	protected void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	protected String getSubgroup() {
		return subgroup;
	}

	protected void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}

	/*
	 * All of the getters and setters that are used for the various variables within the class
	 */
	
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}	
	
}//ends Building class


