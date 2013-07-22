package lesson7;

//
//Complete the class TripPlan which describes the cities that are visited by a tour conducted by Java Now Tours.
//Keep an arraylist of cities (just the string name). Have methods to add a city, remove a city,
//to return the names of the cities in a String, and to reverse the order of the elements in the array list.
//
//Notice that the reverse method is void.

//
//For the draft, provide the instance variable and finish the constructor.
//For the toString method simply return the string "TripPlan["
//

import java.util.ArrayList;

/**
* A TripPlan represents a trip and holds a collection of city names.
*/
public class TripPlan
{
	  // TODO: add instance variable here
	  ArrayList<String> cityList; 
	  /**
	   * Constructs an empty trip.
	   */
	  public TripPlan()
	  {
	      // TODO: Initialize the instance variable
		  cityList = new ArrayList<String>();
	  }
	
	  /**
	   * Add a city to the list.
	   * @param cityName the city to add
	   */
	  public void addCity(String cityName)
	  {
	      // TODO: Write code to add a city to the array list instance variable
		  cityList.add(cityName);
	  }
	
	  /**
	   * Returns a string describing the object.
	   * @return a string in the format "TripPlan[cityName1,cityName2,...]"
	   */
	  public String toString()
	  {	
		  String cityStr = "";
		  for (int i = 0; i < cityList.size(); i++) 
		  {
			  if (i < cityList.size() - 1)
			  {
				  cityStr = cityStr + cityList.get(i)+ ",";
			  }
			  else
			  {
				  cityStr = cityStr + cityList.get(i);
			  } 
		  }
	      return "TripPlan" + "[" + cityStr + "]";
	  }
	
	  /**
	   * Removes a city form the this trip
	   * @param cityName city to remove
	   */
	  public void removeCity(String cityName)
	  {
	      // TODO: Write code to remove a city to the array list instance variable
		  int index = 0;
		  for (String city : cityList)
		  {
			  if (city.equals(cityName))
			  {
				  cityList.remove(index);
			  }
			  index++;
		  }  
	  }
	
	  /**
	   * Reverses the elements in the itinerary.
	   */
	  public void reverse()
	  {
		  int index = 0;
		  for (int i = 0; i < cityList.size(); i++) 
		  {
			  cityList.add(index, cityList.remove(cityList.size() - 1));
			  index++;
		  }
	  }
	  
	  public static void main(String[] args)
	  {
		  TripPlan plan1 = new TripPlan();
		  //System.out.println(plan1.toString());
		  plan1.addCity("San Jose");
		  plan1.addCity("Silicon Valley");
		  plan1.addCity("Denver");
		  plan1.addCity("Austin");
		  
		  System.out.println(plan1.toString());
		  plan1.reverse();
		  System.out.println(plan1.toString());
	  }
}