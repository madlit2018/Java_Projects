package lesson7_2;

//
//Complete the method to fill an int array with random integers between 0 and 100 (exclusive)
//
//HINT: generate the random number using generator.nextInt(100)
//
// Yuttanant Suwansiri 07/15/13

import java.util.Random;
public class ArrayProcessor
{
	 private Random generator;
	
	 //do not change the constructor
	 public ArrayProcessor()
	 {
	     generator = new Random();
	     generator.setSeed(1234); // do not change the seed
	 }
	
	 /**
	  * Fills the array with random integers between 0 and 100 (exclusive)
	  * @param values, the int[] that you need to fill with random integers
	  */
	 public void fill(int[] values)
	 {
	     // TODO: Write code to fill the array, values, with random numbers between 0 and 100(exclusive)
		 for (int i = 0; i < values.length; i++) 
		 {
			values[i] = generator.nextInt(100);
		 }
	 }
	 
	 public static void main(String[] args)
	 {
		 int[] values = new int[100];
		 ArrayProcessor array = new ArrayProcessor();
		 array.fill(values);
		 for (int value : values) 
		 {
			 System.out.print(value + " ");
		 }
	 }
}
