package studio0;

public class MileageReport {
	
	public static void main(String[] args) {
		int car1miles = 250;
		int car2miles = 100;
		int car3miles = 900;
		
		double totalMiles = car1miles + car2miles + car3miles;//change to double
		double milesPerGallon = 24.5;
		double totalGallons = totalMiles / milesPerGallon; //change multiplication to division
		double pricePerGallon = 3.05;
		double totalPrice = totalGallons * pricePerGallon;
		
		System.out.println("Total price spent on gas was $" + totalPrice);
	}
}
