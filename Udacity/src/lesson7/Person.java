package lesson7;

import java.util.ArrayList;

//This is part of the Person class from lesson 3.
//A String is not the right way to store the friends of a Person
//We need to refactor this code.
//Change the friends variable to store an ArrayList<String>
//that contains the names of the friends.
//Re-implement the addFriend and getFriends methods.
// Yuttanant 07/07/13

public class Person
{
	 private String name;
	 ArrayList<Person> friends;
	 private static final String SEPARATOR = ", ";
	
	 public Person(String name)
	 {
	     this.name = name;
	     friends = new ArrayList<Person>();
	 }
	 
	 /**
	     * When a person talks to some one, if that person is already
	     * a friend, they move to the front of the list. Otherwise nothing
	     * changes.
	     * @param the person to potentially move to the front of the friends list.
	     */
	    public void talkTo(Person person)
	    {
	        // YOUR CODE HERE
	        // Move person to the front of the list if they
	        // are already in it.
	        // Make sure that they won't appear twice in the list.
	        // Don't change the friends list if the person is not already in it.
	    	friends.remove(find(person));
	    	friends.add(0, person);
	    }
	
	 /**
	  * Adds the given friend to this Person's friends list.
	  * @param friend the friend to add.
	  */
	 public void addFriend(Person friend)
	 {
	     friends.add(friend);
	 }
	 
	 /**
	     * Removes unrequited friendships. All Persons who do not have this
	     * Person as a friend, are removed from this Person's friend list.
	     */
	    public void removeMeanFriends()
	    {
	        // YOUR CODE HERE
	        // Remove all the friends who don't have you as a friend.
	        // You may want to use the find method.
	    	int i = 0;
	    	while (i < friends.size())
	    	{
	    		//System.out.println(friends.get(i).name);
	    		//System.out.println(find(friends.get(i)));
	    		//System.out.println(friends.get(i).find(this));
	    		//System.out.println(find(jamesha));
	    		
	    		if (friends.get(i).find(this) == -1)
	    		{
	    			friends.remove(i);
	    		}
	    		else
	    		{
	    			i++;
	    		}
	    	}
	    }
	 
	 /**
	  * Removes nonFriend from the list of friends.
	  * @param nonFriend the friend to remove
	  */
	    public void unfriend(Person nonFriend)
	    {
	        // YOUR CODE HERE
	        // Implement the unfriend method.
	        // you can use the find(Person friend) method to get
	        // the index of a friend (Code below).
	    	friends.remove(find(nonFriend));
	    }
   	
	    /**
	     * Finds friend in the friends list
	     * @param a person to search for
	     * @return -1 if the person is not found. The index of the person otherwise.
	     */
	    private int find(Person friend)
	    {
	        for (int i = 0; i < friends.size(); i++)
	        {
	            if (friends.get(i).equals(friend))
	            {
	                return i;
	            }
	        }
	        // If the person is not found by the end of the friends list
	        return -1;
	    }
	    
	    
	 /**
	  * Gets a list of all of this Person's friends.
	  * @return the names of the friends separated by a comma and a space.
	  *     e.g. "Sara, Cheng-Han, Cay"
	  */
	 public String getFriends()
	 {
		 return getFriends(", ");
	 }
	 
	 /**
     * Returns the names of the friends with separator between them.
     * @param separator string to put between names.
     * @return the names of the friends.
     */
    public String getFriends(String separator)
    {
        // TODO:
        // Create a string with all the names separated by separator.
        // make sure that there is not an extra trailing separator.
        // If my friends are Cay and Cheng-Han, and the separator is #
        // It should print
        // Cay#Cheng-Han
        // not
        // Cay#Cheng-Han#
    	String returnName = "";
    	for (int i = 0; i < friends.size(); i++)
    	{
    		if (i > 0)
    		{
    			returnName = returnName + separator + friends.get(i).name;
    		}
    		else 
    		{
    			returnName = friends.get(i).name;
    		}
			
			//System.out.println(returnName);
		}
    	return returnName;
    }
	
	 /**
	  * Gets a friend at a given index.
	  * @param friendIndex the index at which to find the friend (starting at 0)
	  * @return the name of the friend at friendIndex, or "" if the friend is not present
	  */
	 public String getFriend(int friendIndex)
	 {
	     return friends.get(friendIndex).name;
	 }
	 
	 /**
	     * Gets the number of friends this Person has.
	     * @return the number of friends.
	     */
	    public int getNumFriends()
	    {
	        // YOUR CODE HERE
	        // How would you do this without adding more than one line?
	        // Think about ArrayList methods we talked about that might help you.
	        return friends.size();
	    }    
	 
	 public static void main(String[] args)
	    {
	        Person maria = new Person("Maria");
	        Person jamesha = new Person("Jamesha");
	        Person tj = new Person("TJ");
	        Person arm = new Person("Arm");
	        
	        maria.addFriend(jamesha);
	        maria.addFriend(tj);
	        maria.addFriend(arm);
	        maria.unfriend(tj);
	        
	        //maria.unfriend(jamesha);

	        System.out.println(maria.getFriends());
	        System.out.println(maria.getFriends(";"));
	        System.out.println(maria.getFriend(1));
	        System.out.println(maria.getNumFriends());
	        
	        maria.talkTo(arm);
	        System.out.println(maria.getFriends());
	        
	        arm.addFriend(maria);
	        maria.removeMeanFriends();
	        System.out.println(maria.getFriends());
	    }
}
