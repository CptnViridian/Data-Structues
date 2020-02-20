package edu.sussex.coms223.lab1;

import java.util.Scanner;

public class mainstufff {
	
	//Putting this here because yee is way easier to type like 3 times
	static final double yee=Math.PI;
	
	//regtancle area thang
	static double area(double length, double width)
	{
		return length*width;
	}
	
	//circle area thong
	static double area(double radius)
	{
		return yee*radius*radius;
	}
	
	//cylendario areario
	static double area(double radius, float height)
	{
		return yee*radius*radius*height;
	}

	
	//It took me ages to realize I didn't need to make a seperate class file for this, go figure!
    public static void main(String[] args) {

    	//Welcome yins to el progrem
    	System.out.println("Welcome to the ultimate math area thing machine...");
    	System.out.println("I don't know why you cant use a calculator, but whatever.");
    	
    	//Opening the scanny thing
    	Scanner scanboi=new Scanner(System.in);
    	
    	//Asking for user input via animwe voice
    	System.out.println("Pwese enter the wadius of yowo cwircle bewow: ");
    	double circleRad=scanboi.nextDouble();
    	
    	//More asking sans the anime voice, que generic german voice
    	System.out.println("Enter ze Lengths for ze rectancle: ");
    	double rectangLen=scanboi.nextDouble();
    	
    	System.out.println("Und ze vidth as vell: ");
    	double rectangWid=scanboi.nextDouble();
    	
    	//Another question mr.bod
    	System.out.println("The radius of the cylender, Mr. Bond? : ");
    	double cylenRad=scanboi.nextDouble();

    	System.out.println("And the height: ");
    	double cylenHig=scanboi.nextDouble();
    	
    	//And this part...
    	System.out.println("Owkay Mwister, the circwe's awea is: " + mainstufff.area(circleRad));
    	System.out.println("Und ze areah of ze rectangle iz: " + mainstufff.area(rectangLen, rectangWid));
    	System.out.println("Very well Mr. Bond, the area of this cylender is: " + mainstufff.area(cylenRad, cylenHig));
    	
    	
    	
    	
    }

}
