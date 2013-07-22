package problem5;

//hw05_11
//
//Complete this method to read integer scores from the user and find the average
//Stop asking for input when the user enters a negative number.
//
//Keep a running total and keep track of the number of entries
//then find and return the average
//
//Be sure not to divide by 0. Return 0 if no scores are entered
//
// 7/4/13

import java.util.Scanner;
public class MathUtil3
{
	 public double averageScore()
	 {
	     //TODO Find and return the average of the numbers entered.  
	    Scanner in = new Scanner(System.in);	
	 	int num = 0;
	 	int count = 0;
	 	double sum = 0;
	 	while (num > -1) 
	 	{
	 		System.out.print("Enter a score. -1 to quit: "); //use this for the prompt
	     	num = in.nextInt();
	     	sum = sum + num;
	     	count++;
	 	} 
//	 	System.out.println(sum);
//	 	System.out.println(count);
	 	return (sum + 1) / (count - 1);
	 }
 
	 public static void main(String[] args) 
	 {
	 	MathUtil3 input = new MathUtil3();
	 	System.out.println(input.averageScore());
	 }
}
