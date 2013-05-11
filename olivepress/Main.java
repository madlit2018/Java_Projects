/*************************************************************************
 *  Compilation:  javac Calculator.java
 *  Execution:    java Calculator
 *  Include: need calculator.helper to do all the math calculation
 *  
 *  This project is crush 2 types of Olives, one is called Kalamata, and the 
 *  other one is called Ligurian. Kalamata output 2 milliliters of oil and Lagurian 
 *  outputs 1 milliliter of oil. The program calculates the total amount of oil from 
 *  crushing olives. 
 *   
 *  The skills used in this project, for examples are calling instances, overriding class constructions, 
 *  organizing in packages, inheritance superclass and subclasses, casting subclass object.
 *  
 *  Written by Yuttanant Suwansiri 01/12/2013
 *
 *************************************************************************/

package olivepress;
import java.util.ArrayList;
import olivepress.olives.*;
import olivepress.press.OlivePress;

public class Main {

	public static void main(String[] args) {
	
		// Declaring an array of olive basket and Olive instance
		ArrayList<Olive> oliveBottle = new ArrayList<Olive>();
		// Set the amount of oil per olive. Ex. Olive(4) outputs 4 milliliters of oil.
		
		Olive olive;
		
		// Crunching 4 olives to the bottle
		// Crunch a Kalamata type, outputs 2 milliliters
		olive = new Kalamata();
		oliveBottle.add(olive);
		System.out.println(olive.name + " " + olive.flavor + " " + olive.color);
		
		// Crunch a Ligurian type, outputs 1 milliliters
		olive = new Ligurian();
		oliveBottle.add(olive);
		System.out.println(olive.name + " " + olive.flavor + " " + olive.color);
		
		// Crunch a Kalamata type, outputs 2 milliliters
		olive = new Kalamata();
		oliveBottle.add(olive);
		System.out.println(olive.name + " " + olive.flavor + " " + olive.color);
		
		// Override Olive() to outputs 4 milliliters of oil instead of 3
		olive = new Olive(4);
		oliveBottle.add(olive);
		System.out.println(olive.name + " " + olive.flavor + " " + olive.color);

		
		// Declaring OlivePress instance
		// Press the oil from crushed olives
        OlivePress press = new OlivePress();
        press.getOil(oliveBottle);
        System.out.println("1st set of 4 olives: You have " + press.getTotalOil() + " milliliters");
        
        // Doing the same set of olive again 
        press.getOil(oliveBottle);
        System.out.println("2nd set of 8 olives: You have " + press.getTotalOil() + " milliliters");
	
        // Casting downward subclass object
        Kalamata olive1 = (Kalamata)oliveBottle.get(0);
        System.out.println("Kalamata is from " + olive1.getOrigin());
        
        Ligurian olive2 = (Ligurian)oliveBottle.get(1);
        System.out.println("Ligurian is from " + olive2.getOrigin());
        
	}
}
