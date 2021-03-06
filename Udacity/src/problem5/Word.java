package problem5;


//Translate the following pseudocode for randomly permuting the characters in
//a string into a method in the given Java class.

//Read a word.
//Repeat word.length() times
// Pick a random position i in the word, but not the last position.
// Pick a random position j > i in the word. (this is tricky)
// Swap the letters at positions j and i.
//Print the word.

//To swap the letters, construct substrings as follows:

// (image of swapping,PNG)

//Create and return the string:
// first + word.substring(j, j + 1) + middle
//       + word.substring(i, i + 1) + last
// Udacity
// 0123456

//For the draft, pick the random i and j as described above. then return last. Only do this one time

//I recommend that you implement and test the swapping before implementing
//the loop. If something is wrong in the swap, it will be much more difficult
//to find it if you have executed the swap many times. That is an example of
//step-wise refinement. Code a little, test, code a little more.

import java.util.Random;
/**

*/
public class Word
{
	 private Random generator = new Random();
	
	 public Word()  //leave the constructor alone
	 {
	      generator = new Random();
	      final long SEED = 42;
	      generator.setSeed(SEED);
	 }
	 /**
	  * Gets a version of this word with the letters scrambled
	  * @param word the string to scramble
	  * @return the scrambled string
	  */
	 public String scramble(String word)
	 {
	      //TODO scramble the letters following the pseudocode
		String random = word;
		int i = 0;
		int j = 0;
		int tmp = 0;
		
		for (int a = 0; a < word.length(); a++) 
		{	
		
			//String last = word.substring(word.length() - 1, word.length());
			i = generator.nextInt(random.length() - 1);
			int diff = random.length() - 1 - i;
			int jAdd = generator.nextInt(diff);
			j = i + jAdd + 1;
			
			if (j > 5)
			{
				continue;
			}	
			
			i = tmp;
			i = j;
			j = tmp;
			
			String first = word.substring(0, 1);
			String middle = word.substring(word.length() / 2);
			String last = word.substring(word.length() - 1, word.length());
			random = first + word.substring(j, j + 1) + middle + word.substring(i, i + 1) + last;
		}
		
		return random;
	 }
	
	 public static void main(String[] args) 
	 {
		 Word aWord = new Word();
		 System.out.println(aWord.scramble("Udacity"));
		 System.out.println(aWord.scramble("Udacity"));
		 System.out.println(aWord.scramble("Udacity"));
		 System.out.println(aWord.scramble("Udacity"));
		 System.out.println(aWord.scramble("Udacity"));
		 System.out.println(aWord.scramble("Udacity"));
		 
	 }
}

