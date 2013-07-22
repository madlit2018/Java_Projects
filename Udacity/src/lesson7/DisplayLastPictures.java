package lesson7;

//
//Complete the given class to display the last picture in the array list
//
//The required pictures are in the BlueJ project
//
// Yuttanant 07/10/13

import helpers.Picture;

import java.util.ArrayList;

public class DisplayLastPictures
{
	public static void main(String[] args)
	{
	   ArrayList<Picture> gallery = new ArrayList<Picture>();
	   gallery.add(new Picture("degas1.jpg"));
	   gallery.add(new Picture("gaugin1.jpg"));
	   gallery.add(new Picture("monet1.jpg"));
	   gallery.add(new Picture("monet2.jpg"));
	   gallery.add(new Picture("renoir1.jpg"));
	
	   // TODO display the last picture in the array list
	   // your code goes here
	   gallery.get(gallery.size()-1).draw();
	}
}
