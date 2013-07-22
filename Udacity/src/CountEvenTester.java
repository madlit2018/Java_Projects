//hw04_20
/**
 * Complete the class. Using a Scanner, ask the user to enter a series of integers
 * and count the number of even numbers
 * Use a loop. Do not let bad input (a non-integer) terminate your program with an error.
 * When the user enters any non-integer, print the number of even integers entered and quit.
 * Hint: remember hasNextInt()
 * Hint: use the % operator to determine if a number is even
 * 6/27/13
 */
import java.util.Scanner;
public class CountEvenTester
{
   public static void main(String[] args)
   {
	   Scanner in = new Scanner(System.in);
       int num = 0;
       int count = 0;

       while (true) {
    	   System.out.print("Enter an integer: ");
           // validate the input
           if (in.hasNextInt()) {
        	   num = in.nextInt();
           } else {
        	   System.out.println(count);
        	   break;
           }
           
           if (num % 2 == 0) {
        	   count++;
           }
           
           //System.out.println(count);
       }
   }
}