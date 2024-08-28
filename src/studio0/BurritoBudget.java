package studio0;

public class BurritoBudget {

		public static void main(String args[]) {
		int burritosEatenWeek1 = 7;
		int burritosEatenWeek2 = 4;
		int burritosEatenWeek3 = 19; //don't judge me
		int burritosEatenWeek4 = 1;
		
		double totalBurritos = burritosEatenWeek1 + burritosEatenWeek2 + burritosEatenWeek3 + burritosEatenWeek4; //set to double instead of int
		System.out.println(totalBurritos);
		double averageWeeklyBurritos = totalBurritos / 4; //set to double instead of int (can't devide int by double)
		System.out.println(averageWeeklyBurritos);

		
		
		double burritoPrice = 7.50;
		double averageWeeklyPrice = averageWeeklyBurritos * burritoPrice;
		
		System.out.println("You have spent an average of $" + averageWeeklyPrice + " per week on burritos.");
	
	}
}
