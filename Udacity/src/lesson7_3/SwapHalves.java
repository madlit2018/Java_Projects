package lesson7_3;

//BlueJ project: lesson7/swapHalves

/**

Reminder: Here is how you swap two elements

int saved = elements[i];
elements[i] = elements[j];
elements[j] = saved;

Yuttanant Suwansiri 7/19/13
*/


import java.util.Arrays;

public class SwapHalves
{
	 public static void main(String[] args)
	 {
	     int[] elements = { 1, 4, 9, 7, 3, 2, 5, 11, 0, 9 };
	
	     // TODO: Swap the first and second half
	     for (int i = 0; i < elements.length / 2; i++) 
	     {
			int saved = elements[i];
			elements[i] = elements[elements.length / 2 + i];
			elements[elements.length / 2 + i] = saved;
	     }
	     // Print all elements
	     System.out.println(Arrays.toString(elements));
	 }
}