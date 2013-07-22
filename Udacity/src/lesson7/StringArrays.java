package lesson7;

//
//Complete the method in this class to find the average length of the words in an
//array list of strings and return it. The average length of words is sometimes used
//as a simple measure of reading difficulty.
//
//Note that you want to keep the fractional part of the average
//
//Hint: If you do not know where to start, look at the ArrayList Algorithms to find an appropriate one.

import java.util.ArrayList;

import com.sun.tools.javac.code.Attribute.Array;
public class StringArrays
{
	public double averageCountPerWord(ArrayList<String> words)
	{
	    double average = 0;
	    double count = 0.0; //defined as double so we do double division
	    double total = 0.0;
	
	    // TODO: Find the total number of characters in all the words
	    for (String word : words)
	    {
	    	total = total + word.length();
	    	count++;
	    }
	    System.out.println(count);
	    System.out.println(total);
	
	    // TODO: Calculate the average
		if (total > 0) //supply the condition
	    {
	       //your code here
	    	average = total / count;
	    }
	
	    return average;
	 }
	
	public static void main(String[] args)
	{
		StringArrays word = new StringArrays();
		ArrayList<String> wordList = new ArrayList<String>();
		
		wordList.add("arm how are you");
		wordList.add("you are cool");
		System.out.println(word.averageCountPerWord(wordList));
		
	}
}
