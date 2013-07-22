package lesson7;

//BlueJ project: lesson7/gallery1
// 7/7/13

import helpers.Picture;

import java.util.ArrayList;

public class ListOfPictures
{
 public static void main(String[] args)
 {
     ArrayList<Picture> gallery = new ArrayList<Picture>();
     gallery.add(new Picture("degas1.jpg"));
     gallery.add(new Picture("gaugin1.jpg"));
     gallery.add(new Picture("monet1.jpg"));
     gallery.add(new Picture("monet2.jpg"));
     gallery.add(new Picture("renoir1.jpg"));

     // TODO: Rotate the gallery so that the last picture
     // becomes the first one, the first the second, and so on.
     Picture tmp = gallery.remove(4);
     gallery.add(0, tmp);
     
     int rightmost = 0;
     int sum = 0;
     Picture tallest = gallery.get(0);
     int count = 0;
     for (Picture pic : gallery)
     {
    	 pic.translate(rightmost + 10, 0);
         pic.draw();
         rightmost = pic.getMaxX();
         // Find the sum
         sum = sum + pic.getWidth();
         
         // Find the tallest picture
         if (pic.getHeight() > tallest.getHeight())
         {
        	 tallest = pic;
         }    
         
         // Portrait pictures
         if (pic.getHeight() > pic.getWidth())
         {
        	 count++;
         }
     }    
          
     // Sum of widths
     System.out.println("Sum of widths: " + sum);
     
     // Tallest picture
     System.out.println("Tallest height: " 
             + tallest.getHeight());
          tallest.draw();
          
     System.out.println("Pictures with portrait orientation: " + count);
 }
}
