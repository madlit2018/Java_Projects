package problem5;

//Create a class Word. Word has a constructor that takes a string argument
//and one method getSubstrings which returns a String containing
//all substrings of word, sorted by length.
//
//For example, if the user provides the input "rum", the method returns a
//string that will print like this

//r
//u
//m
//ru
//um
//rum
//123

//You can concatenate the substrings in a String, separating them with a newline
//("\n"). Then return the string

//For the draft provide the constructor, the instance method ,
//and a stub for the getSubstring method that returns null.
// 7/3/13

public class Word2
{

  //TODO write the constructor and define the instance variable

  /**
   * Gets all the substrings of this Word.
   * @return all substrings of this Word separated by newline
   */
	private String word;
    
    public Word2(String word)
	{
		this.word = word;
	}

    public String getSubstrings()
    {
    	int count2 = 0;
    	int length = word.length();
    	
       //TODO complete the stub to return null
    	for (int i = 1; i <= length; i++) {
			while (i+count2 <= length) 
			{
				System.out.println(word.substring(count2, i+count2));
				count2++;
			}
			//System.out.println();
			count2 = 0;
		}
        return "";
    }
    
    public static void main(String[] args) 
    {
    	Word2 aWord = new Word2("Udacity");
    	System.out.println(aWord.getSubstrings());
    }
}


