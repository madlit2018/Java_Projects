/**
 * Complete the code in this method 
 * Define last and assign the last digit of the number to it
 * Find the last digit 6/24/13
 */
public class Digits
{
    /**
     * Gets the last digit of a number
     * @param number the number whose last digit we want
     * @return the first digit of the parameter
     */
    
    public int lastDigit(int number)
    {
        //your code goes here.
        double length = String.valueOf(number).length() - 1;
        int last = number / ((int) Math.pow(10, length));
        return last;
    }
    
    public static void main(String[] args)
    {
    	Digits digit1 = new Digits();
    	Digits digit2 = new Digits();
    	System.out.println(digit1.lastDigit(10231));
    	System.out.println(digit2.lastDigit(345));
    }
}