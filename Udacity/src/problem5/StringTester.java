package problem5;

//
//Complete the code below to print each letter in the string name followed by a space.
//
//
// 7/4/13

public class StringTester
{
	public static void main(String[] args)
	{
	    String name = "Udacity";
	    
	    for (int i = 0; i < name.length(); i++)
	    {
	        System.out.print(name.substring(i, i + 1) + " ");
	    }
	}
}
