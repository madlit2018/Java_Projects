package book;

import book.helper.Book;

//Mad Hatter search
public class MadHatterSearch
{
 public static void main(String[] args)
 {
     Book alice = new Book("aliceInWonderland.txt");

     System.out.println(alice.firstOccurrenceOfMadHatter());
     System.out.println("Expected: -1");

     Book code = new Book("BookTester.java");
     System.out.println(code.firstOccurrenceOfMadHatter());
     System.out.println("Expected: 3");
 }
}