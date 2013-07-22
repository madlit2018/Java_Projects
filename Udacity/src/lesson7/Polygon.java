package lesson7;

//Create a Polygon class. A polygon is a closed shape with lines joining the corner points.
//You will keep the points in an array list. Use object of java.awt.Point for the point.

//Polygon will have as an instance variable an ArrayList of Points to hold the points
//The constructor takes no parameters but initializes the instance variable
//
//The add method adds a Point to the polygon
//
//The perimeter method returns the perimeter of the polygon
//
//The draw method draws the polygon by connecting consecutive points and then
//connecting the last point to the first.
//
//No methods headers or javadoc is provided this time. You get to try your hand at writing a class almost from scratch
//
//For the draft, finish the constructor.
//Have the perimeter method return 0 and have the draw method draw a
//line from point 0, 0 to point 30, 40
//
// Yuttanant 07/09/13

import helpers.Line;

import java.util.ArrayList;
import java.awt.Point;
import java.awt.geom.Point2D;

public class Polygon
{
	ArrayList<Point> pointList;
  // TODO: provide the required constructor, instance variable, and methods
	public Polygon()
	{
		pointList = new ArrayList<Point>();
	}
	
	public void add(Point point)
	{
		pointList.add(point);
	}
	
	public double perimeter()
	{
		double peri = 0;
		for (int i = 0; i < pointList.size(); i++)
		{
			if (i < pointList.size() - 1)
			{
				peri = peri + pointList.get(i).distance(pointList.get(i + 1));
			}
			else
			{
				peri = peri + pointList.get(i).distance(pointList.get(0));
			}
		}
		return peri;
	}
	
	public void draw()
	{
		for (int i = 0; i < pointList.size(); i++) 
		{
			if (i < pointList.size() - 1)
			{
				Line aLine = new Line(pointList.get(i).getX(), pointList.get(i).getY(),
						pointList.get(i + 1).getX(), pointList.get(i + 1).getY());	
				aLine.draw();
			} 
			else 
			{
				Line aLine = new Line(pointList.get(i).getX(), pointList.get(i).getY(),
						pointList.get(0).getX(), pointList.get(0).getY());	
				aLine.draw();
			}
		}		
	}
	
	public static void main(String[] args)
	{
		Polygon shape = new Polygon();
		shape.add(new Point(0, 0));
		shape.add(new Point(0, 40));
		shape.add(new Point(40, 0));
		
		System.out.println(shape.perimeter());
		shape.draw();
		
	}
}
