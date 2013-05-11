/*************************************************************************
 *  Class that collects the amount of oil from crushing in a bottle
 *  
 *************************************************************************/

package olivepress.press;
import java.util.Collection;

import olivepress.olives.Olive;

public class OlivePress {
	
	private int totalOil = 0;
	
	public int getTotalOil() {
		return totalOil;
	}

	// Call this press.getTotalOil() again will multiply the output to 2
	private void setTotalOil(int totalOil) {
		this.totalOil += totalOil;
	}

	public OlivePress() {
		// System.out.println("OlivePress Constructor");
	}
	
	// use the number of times needed to crush olives from Main class Array
	// use the crush method from Olive class
	// Polymorphism up casting ArrayList class
	public void getOil(Collection<Olive> olives) {
		
		int oil = 0;
		
		for (Olive olive : olives) {
			oil += olive.crush();
		}
	setTotalOil(oil);
	}
}
