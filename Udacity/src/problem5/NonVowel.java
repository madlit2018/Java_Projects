package problem5;
// 7/4/13

public class NonVowel
{

	/**
     * Gets the number of non-vowels in the parameter
     * @param word the string to count the non-vowels in
     * @return the number of non-vowels in the word
     */
    public int nonVowelCount(String word)
    {
        //TODO Write the code to return the number of non-vowels
    	int count = 0;
    	for (int i = 0; i < word.length(); i++) 
    	{
    		String letter = word.substring(i, i + 1);
    		//System.out.println(letter);
			if (!"aeoiuAEIOU".contains(letter))
			{
				count++;
			}
		}
    	return count;
    }
    
    public static void main(String[] args)
    {
    	NonVowel nonVowel = new NonVowel();
    	System.out.println(nonVowel.nonVowelCount("howareyou"));
    }
}
