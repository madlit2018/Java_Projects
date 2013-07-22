package problem5;

//
// TODO Write code to get a number in the range of 1 to 10
// HINT: You need to use a do while loop.
// HINT: You will need to import the Scanner class and create a Scanner object to use to get input from the user
// 7/4/13

import java.util.Scanner;

public class InputWithDo
{
    /*
     * Gets a number betwwen 1 and 10 (inclusive) from the user
     * @return user input between 1 and 10 (inclusive)
     */
    public int getValidInput()
    {
        //TODO Write code to get a number in the range of 1 to 10
        // System.out.print("Enter an integer >=1 and <=10: "); //use this for the prompt
    	Scanner in = new Scanner(System.in);	
    	int num = 0;
    	do 
    	{
    		System.out.print("Enter an integer >=1 and <=10: ");
        	num = in.nextInt();
    	} while (num < 1 || num > 10);
    		
    	return 0;
    }
    
    public static void main(String[] args) 
    {
    	InputWithDo input = new InputWithDo();
    	System.out.println(input.getValidInput());
    }
}