/*
 * This class exists in order to test the methods that are created and used in the other classes.
 * 
 * @author Austin Bradburn
 * @version 1.0
 * Inheritance project
 * Spring 2020
 */

public class Application {
	
	public static void main(String[] args){

//=========================================================================================		
		/** BUILDING TEST CODE **/
		
		String projectName= "Gaines House";
		String completeAddress= "123 Main Street | Louisville, Kentucky 40201";
		double totalSquareFeet= 2450;
		String occupancyGroup= "Residential";
		String subgroup="B";
		
		/*
		 * Sets the variables that are used for the Building and subsequent classes
		 */
		
		Building test1 = new Building();
		Building test2 = new Building(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		
		/*
		 * Creates the empty-argument and preferred constructors from the Building class
		 */
		
		test2.draw();
		test2.displayData();
		
		test2.setProjectName(projectName);
		test2.getProjectName();
		
		test2.setCompleteAddress(completeAddress);
		test2.getCompleteAddress();
		
		test2.setTotalSquareFeet(totalSquareFeet);
		test2.getTotalSquareFeet();
		
		test2.setOccupancyGroup(occupancyGroup);
		test2.getOccupancyGroup();
		
		test2.setSubgroup(subgroup);
		test2.getSubgroup();
		
		test2.toString();
		
		/*
		 * Calls all of the individual methods within the Building class
		 */
			
		System.out.println(test2.displayData());
		
		/*
		 * Prints out the board of information for the Building class
		 */
		
//===========================================================================================
		/** BUSINESS TEST CODE **/
		
		int numRentableUnits=16;
		
		/*
		 * Sets the new variable for the Business class
		 */
		
		Business test3 = new Business();
		Business test4 = new Business(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		
		/*
		 * Creates the empty-argument and preferred constructors for the Business class
		 */
		
		test4.draw();
		test4.displayData();
		
		test4.setNumRentableUnits(numRentableUnits);
		test4.getNumRentableUnits();
		
		test4.toString();
		
		/*
		 * Calls the individual methods within the Business class
		 */
		
		System.out.println(test4.displayData());
		
		/*
		 * Prints out the board of information for the Business class
		 */
		
//==============================================================================================
		/** MALL TEST CODE **/
		
		int numRentedUnits=5;
		double medianUnitSize=1027.8;
		int numParkingSpaces=408;
		
		/*
		 * Sets the new variables for the Mall class
		 */
		
		Mall test5 = new Mall();
		Mall test6 = new Mall(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits);
		
		/*
		 * Creates the empty-argument and preferred constuctors from Mall
		 */
		
		test6.draw();
		test6.displayData();
		
		test6.setNumRentedUnits(numRentedUnits);
		test6.getNumRentedUnits();
		
		test6.setMedianUnitSize(medianUnitSize);
		test6.getMedianUnitSize();
		
		test6.setNumParkingSpaces(numParkingSpaces);
		test6.getNumParkingSpaces();
		
		test6.toString();
		
		/*
		 * Calls the individual methods from within the Mall class
		 */
		
		System.out.println(test6.displayData());
		
		/*
		 * Prints out the board of information from the Mall class
		 */
		
//================================================================================================
		/** RESIDENTIAL TEST CODE **/
		
		subgroup="R1"; //Resets the subgroup variable to be applicable to the Residential family of classes
		int numBedrooms=3;
		int numBathrooms=2;
		boolean laundryRoom=true;
		
		/*
		 * Sets the new variables for the Residential class
		 */
		
		Residential test7 = new Residential();
		Residential test8 = new Residential(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		
		/*
		 * Creates the empty-argument and preferred constructors
		 */
		
		test8.draw();
		test8.displayData();
		
		test8.setNumBedrooms(numBedrooms);
		test8.getNumBedrooms();
		
		test8.setNumBathrooms(numBathrooms);
		test8.getNumBathrooms();
		
		test8.setLaundryRoom(laundryRoom);
		test8.isLaundryRoom();
		
		test8.toString();
		
		/*
		 * Calls the individual methods from within the Residential class
		 */
		
		System.out.println(test8.displayData());
		
		/*
		 * Prints out the board of information for the Residential class
		 */
		
//=================================================================================================
		/** APARTMENT TEST CODE **/
		
		numRentableUnits=11; //Sets the numRentableUnits to be a value for the Apartment class
		double avgUnitSize=245.6;
		boolean parkingAvailable=true;
		
		/*
		 * Sets the new variables for the Apartment class
		 */
		
		Apartment test9 = new Apartment();
		Apartment test10 = new Apartment(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		
		/*
		 * Creates the empty-argument and preferred constructors
		 */
		
		test10.draw();
		test10.displayData();
		
		test10.setNumRentableUnits(numRentableUnits);
		test10.getNumRentableUnits();
		
		test10.setAvgUnitSize(avgUnitSize);
		test10.getAvgUnitSize();
		
		test10.setParkingAvailable(parkingAvailable);
		test10.isParkingAvailable();
		
		test10.toString();
		
		/*
		 * Calls the individual methods from the Apartment class
		 */
		
		System.out.println(test10.displayData());
		
		/*
		 * Prints the board of information for the Apartment class
		 */
		
//=================================================================================================
		/** SINGLEFAMILYHOME TEST CODE **/
		
		boolean garage=true;
		
		/*
		 * Sets the new variable for the SingleFamilyHome
		 */
		
		SingleFamilyHome test11 = new SingleFamilyHome();
		SingleFamilyHome test12 = new SingleFamilyHome(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		
		/*
		 * Creates the empty-argument and preferred constructors
		 */
		
		test12.draw();
		test12.displayData();
		
		test12.setGarage(garage);
		test12.isGarage();
		
		test12.toString();
		
		/*
		 * Calls all of the methods from the SingleFamilyHome class
		 */
		
		System.out.println(test12.displayData());
		
		/*
		 * Prints the board of information for the SingleFamilyHomeClass
		 */
		
	}//ends main method

}//ends Application


