/*************************************************************************
 *  A type of olives called Kalamata, or the subclass of Olive
 *  
 *************************************************************************/

package olivepress.olives;

public class Kalamata extends Olive {

	// Construction
	public Kalamata() {
		super(2);
		this.name = "Kalamata";
		this.flavor = "Grassy";
		this.color = "Brown";
	}
   
	@Override
	public int crush() {
		System.out.println("Overridden crush from subclass");
		return super.crush();
	}
	
	// Subclass object
	public String getOrigin() {
		return "Greece";
	}
}
