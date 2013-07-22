package problem5;

//Complete the given code to compute the sum of all odd digits of a integer.
//The integer may be positive or negative. (For example, if the input is 32677,
//the sum would be 3 + 7 + 7 = 17.)

//HINT: Use a method of the Math class to get the absolute value of the parameter

//For the draft, print out the digits all on one line, separated by a space.
//Print a zero as the last number and return 0. If the input is 32677, the output will be

//3 2 6 7 7 0
// 7/3/13

public class MathUtil
{
 /**
  * Gets the sum of all the odd digits in the parameter
  * @param n the number to use
  * @return the sum of the odd digits.
  */
	
	public int sumOfOdd(int n)
	{
		//TODO calculate and return the sum of the odd digits
    	long temp = Math.abs(n);
    	int out = 0;
    	
    	while (temp > 0)
    	{
    		int last = (int) (temp % 10);
    		temp = temp / 10;
    		if (last % 2 == 1) out = out + last;	
    	}
    	//System.out.print(out + " ");
	    return out;
	}
	 
	public static void main(String[] args) 
	{
		MathUtil odd = new MathUtil();
		System.out.println(odd.sumOfOdd(3243));
		System.out.println(odd.sumOfOdd(-3431));
	}
}
