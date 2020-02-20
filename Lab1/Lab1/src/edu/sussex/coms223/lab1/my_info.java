package edu.sussex.coms223.lab1;

public class my_info {
    public static void main(String[] args) {
    	
    System.out.println("Welcome to the MEGA INFO STOAGE PROGRAM");
    
    String name = "Charles, Ender of Worlds"; //Basic Data initialization
    int age = 9001;
    
    String hob[];								//Array initialization
    hob = new String[3];
    hob[0] = "gaming";
    hob[1] = "drawing";
    hob[2] = "taking over the universe";
    
    //println section
    System.out.println("Hello, my name is " + name);
    System.out.println("I am clearly " + age + " earth years into my existance in this universe");
    System.out.println("My hobbies include " + hob[0] + ", " + hob[1] + " and, " + hob[2]);
    }
}
