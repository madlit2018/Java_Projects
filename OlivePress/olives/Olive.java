/*************************************************************************
 *  Class that defines crushing olive method
 *  
 *************************************************************************/

package olivepress.olives;

public class Olive {
 
	public String name = "Kalamata"; // Type of Olive
	public String flavor = "Grassy"; // Olive flavor
	public String color = "Black";
	private int oil = 3; // No other methods from other classes can access this
	 
	public int getOil() {
		return oil;
	}

	private void setOil(int oil) {
		this.oil = oil;
	}

	// Constructor
	 public Olive() {
	 // System.out.println("Constructor of " + this.name);
	 }
	 
	 // Overridden Constructor 
	 public Olive(int oil) {
		setOil(oil);
	}

	// Crushing olive method returning oil every time you crush 
	 public int crush() {
		 System.out.println("Ouch!! Crush from superclass");
		 return oil;
	 }

}
