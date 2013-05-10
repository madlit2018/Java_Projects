/*************************************************************************
 *  Helper Class for Calculator Class
 *  Calculator.java calls getInput method to parse an input from user
 *
 *  Written by Yuttanant Suwansiri 12/19/2012
 *
 *************************************************************************/
package calculator.helpers;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputHelper {
    
	// Method
	public static String getInput(String prompt) {
		BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.print(prompt);
		System.out.flush();
		
		try {
			return stdin.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}
}
