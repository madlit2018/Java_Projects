/**
 * Complete the code in this method 
 * Define last and assign the last digit of the number to it
 * Find the first digit 6/24/13
 */
public class CopyOfDigits
{
    /**
     * Gets the last digit of a number
     * @param number the number whose last digit we want
     * @return the first digit of the parameter
     */
    
    public int lastDigit(int number)
    {
        //your code goes here.
    	int num = number / 10;
    	num = num * 10;
    	int last = number - num;
        return last;
    }
    
    public static void main(String[] args)
    {
    	CopyOfDigits digit1 = new CopyOfDigits();
    	CopyOfDigits digit2 = new CopyOfDigits();
    	System.out.println(digit1.lastDigit(10231));
    	System.out.println(digit2.lastDigit(345));
    }
}