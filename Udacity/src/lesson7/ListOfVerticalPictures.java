package lesson7;

//
//Complete the given class to display the picture object vertically
//(rather than horizontally).
//You can find the pictures required in the bluej project
//
// Yuttanant 07/10/13

import helpers.Picture;

import java.util.ArrayList;

public class ListOfVerticalPictures
{
public static void main(String[] args)
{
   ArrayList<Picture> gallery = new ArrayList<Picture>();
   gallery.add(new Picture("degas1.jpg"));
   gallery.add(new Picture("gaugin1.jpg"));
   gallery.add(new Picture("monet1.jpg"));
   gallery.add(new Picture("monet2.jpg"));
   gallery.add(new Picture("renoir1.jpg"));

   // your code goes here
   // TODO Write the code to display the pictures vertically
   int bottomMost = 0;
   for (Picture pic : gallery)
   {
       pic.translate(0, bottomMost + 10);
       bottomMost = pic.getMaxY();
       pic.draw();
   }
}
}
