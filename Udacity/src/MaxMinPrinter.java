//Write a class called MinMaxPrinter. Using a Scanner, ask the user to enter
//a series of integers and find the maximum and the minimum value.
//Use a loop.

//Do not let bad input (a non-integer) terminate your program with an error.
//When the user enters any non-integer, print the maximum and minimun values
//on separate line and quit.

//If the numbers entered are 5 10 3 8 1, 2 9, the output will be

//11
//2

//HINT: remember hasNextInt()
//HINT: initialize max to Integer.MIN_INTEGER rather than to 0 and min to Integer.MAX_INTEGER before the loop.

//For the draft, ask the user to input a series of integers, printing each one. Terminate when the user enters any non-integer. Do not let your code throw an exception (terminate with an error)

//The dialog for the draft would be:

//Enter an integer: 5
//  5
//  Enter an integer: 10
//  10
//  Enter an integer: 3
//  3
//  Enter an integer: 8
//  8
//  Enter an integer: 1
//  1
//  Enter an integer: 2
//  2
//  Enter an integer: 9
//  9
//  Enter an integer: x

import java.util.Scanner;
public class MaxMinPrinter
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       int num = 0;

       while (true) {
    	   System.out.print("Enter an integer: ");
           //your code here
           // validate the input
           if (in.hasNextInt()) {
        	   num = in.nextInt();
           } else {
//        	   System.out.println("-1");
//        	   in.nextLine();
        	   System.out.println(max);
        	   System.out.println(min);
        	   break;
           }
           
           // check for max and min
           if (num > max) max = num;
           if (num < min) min = num;
//           
//           System.out.println(num);
       }
   }
}
