/*************************************************************************
 *  Compilation:  javac OverloadingMethod.java
 *  Execution:    java OverloadingMethod
 *  
 *  An example of Overloading methods
 *  Method 1 can be overridden with method 2 (inputs are integer)
 *  Method 3 takes strings and converts them to Integer
 *  *Note: It uses getInput method to take user's input 1 and 2
 *
 *  Written by Yuttanant Suwansiri 
 *
 *************************************************************************/

public class OverloadingMethod {

	// Main program
	public static void main(String[] args) {
		
		int input1 = 20;
		int input2 = 5;
		// uncomment input3 to use method 2 
		//int input3 = 3;
		String string1 = "50";
		String string2 = "100";
		
		int result1 = addInputs(input1, input2);
		int result2 = addStrings(string1, string2);
		
		System.out.println("The result1 is: " + result1);
		System.out.println("The result2 is: " + result2);
	}
	
	// Method 1
	private static int addInputs(int s1, int s2) {
		return s1 + s2;
	}
	
	// Method 2
	private static int addInputs(int s1, int s2, int s3) {
		return s1 + s2 + s3;
	}

	// Method 3
	private static int addStrings(String string1, String string2) {
		int inputInt1 = Integer.parseInt(string1);
		int inputInt2 = Integer.parseInt(string2);
		return inputInt1 + inputInt2;
	}	
	
}
