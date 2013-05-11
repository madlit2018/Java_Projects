/*************************************************************************
 *  A type of olives called Ligurian, or another subclass of Olive
 *  
 *************************************************************************/

package olivepress.olives;

public class Ligurian extends Olive {

	// Construction
	public Ligurian() {
		super(1);
		this.name = "Ligurian";
		this.flavor = "Sweet";
		this.color = "Green";
	}

	// Subclass object
		public String getOrigin() {
			return "Italy";
		}
}
