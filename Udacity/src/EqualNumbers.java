// Compare the same number 6/25/13
public class EqualNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double original = 2;
		double root = Math.sqrt(original);
		double rootSquared = root * root;
		final double EPSILON = 10E-12;
		//System.out.println(rootSquared);
		if (Math.abs(rootSquared - original) < EPSILON) {
			System.out.println("They are the same");
		} else {
			System.out.println("They are not the same");
		}
	}

}
