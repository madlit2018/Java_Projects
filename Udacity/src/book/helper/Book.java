package book.helper;

//BlueJ Project: lesson4/book3
//Video: Working with the Book Text

import java.util.Scanner;
import java.io.File;

public class Book
{
 private String bookText;

 public Book(String fileName)
 {
     readBook(fileName);
 }

 /**
    Gets the first sentence of this book.
    @return the first sentence (including the period) of this book.
 */
 public String getFirstSentence()
 {
     // TODO: Return the first sentence
	 return  bookText.substring(0, bookText.indexOf(".") + 1);
 }

 /**
  * Calculates the number of characters (as in letters and
  * symbols, not people) in the book.
  * @return the number of letters and symbols in the book.
  */
 public int getNumCharacters()
 {
     return bookText.length();
 }

 /**
 Counts how many times "Alice" occurs in this book.
 @return the number of occurrences
*/
public int occurrencesOfAlice()
{
 // TODO: Find the number of times the word "Alice" occurs in this book
 int bookLength = bookText.length();
 int noAliceLength = bookText.replace("Alice", "").length();
 return (bookLength - noAliceLength) / 5;
}

/**
Counts how many times a given word occurs in this book.
@param word a word of length >= 1
@return the number of occurrences
*/
public int occurrencesOf(String word)
{
// TODO: Complete this method
 int bookLength = bookText.length();
 int noAliceLength = bookText.replace(word, "").length();
 return (bookLength - noAliceLength) / 5;
}

 /**
    Finds where the string "Mad Hatter" occurs for the first time in the book.
    @return the location of the first occurrence of the string
 */
 public int firstOccurrenceOfMadHatter()
 {
     return bookText.indexOf("Mad Hatter");
 }

 /**
  * A method to help read the book out of the file.
  * You don't have to read this unless you want to.
  * the "try" and "catch" are java's way of dealing with
  * runtime errors or "exceptions".
  */
 public void readBook(String fileName)
 {
     bookText = "";
     try
     {
         Scanner file = new Scanner(new File(fileName));
         while (file.hasNextLine())
         {
             String line = file.nextLine();
             bookText += line + "\n";
         }
         file.close();
     }
     catch (Exception e)
     {
         System.out.println(e);
     }
 }
}
