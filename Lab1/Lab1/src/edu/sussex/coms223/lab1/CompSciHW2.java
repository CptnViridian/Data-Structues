package edu.sussex.coms223.lab1;

//Required for input
import java.util.Scanner;

public class CompSciHW2 {
	
	//Calculates area
	static double RoomDimension(double len, double wid)
	{
		return len*wid;
	}
	
	//Calculates total cost
	static double RoomCarpet(double price, double area)
	{
		return price*area;
	}

	public static void main(String[] args) {
		
		//initate le scan
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Welcome to the Westfield Carpet Company official Carpet Calculator");
		
			//Accept user input 
			System.out.println("Please enter the price per square foot of the desired carpet: ");
			double price = scan.nextDouble();
		
			System.out.println("Now enter the first dimension of the carpet: ");
			double length = scan.nextDouble();
		
			System.out.println("And the second dimension of the carpet: ");
			double width = scan.nextDouble();
		
		//Calculate and produce output
		System.out.println("The area you have selected is: " + CompSciHW2.RoomDimension(length, width));
		System.out.println("The price of that size of carpet is: " + CompSciHW2.RoomCarpet(price, CompSciHW2.RoomDimension(length, width)));
	
		
	}
	
	
	
}
