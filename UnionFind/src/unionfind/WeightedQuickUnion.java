/****************************************************************************
 *  Execution:  java unionfind.QuickUnion < tinyUF.txt
 *  Dependency: StdIn.java 
 *
 *  WeightedQuickUnion algorithm.
 *  The software is used to find how many connected components
 *  It assigns an Array called id sized n-1 from the first 
 *  number of the file. Ex. 10 assigns id[0] - id[9] 
 *  The difference between QuickUnion and WeightedQuickUnion is
 *  WeightedQuickUnion joins a smaller tree to larger tree
 *  * This is fastest method to join or union objects. The tree
 *  is guaranteed to be the shortest it can be; therefore the shortest 
 *  time to find the roots. 
 *  
 *  By Yuttanant Suwansiri
 *  
 *  * Implemented from Princeton University Algorithms Lecture
 *
 ****************************************************************************/
package unionfind;

import unionfind.helpers.StdIn;

public class WeightedQuickUnion {
	private int id[];
	private int size[]; // Number of subtrees objects
	public int count;
	
	// Constructor
	// Assign id and size arrays sized N-1
		public WeightedQuickUnion(int n) {
	        id = new int[n];
	        size = new int[n];
	        count = n;
	        System.out.println("Assign an Array called id");
	        for (int i = 0; i < n; i++) {
	            id[i] = i;
	            size[i] = 1;
	        System.out.println("id" + i + " is " + id[i] + " " + "size " + size[i]);
	        }
		}
		
		// Check to see if p and q is connected
		public boolean connected(int p, int q) {
			return root(p) == root(q);
		}	
		
		// Connect p and q, set id[p] to the root of id[q]
		// Weight to see which tree has more objects
		// Add smaller tree to the larger tree
		public void union(int p, int q) {
			int i = root(p);
		    int j = root(q);
		    System.out.println(p + ", " + q);
		    if (size[i] < size[j]) {
		    	id[i] = j;
		    	size[j] += size[i];
		    	System.out.println("The root is " + j + " size " + size[j]);
		    } else {
		    	id [j] = i;
		    	size[i] += size[j];
		    	System.out.println("The root is " + i + " size " + size[i]);
		    }
		    count--;
		    System.out.println("Count " + count);
		}
		
		// Finding the parent root
		private int root(int r) {
			while (r != id[r]) r = id[r];
			return r;
		}
	
	    // Main program
	    public static void main(String[] args) {

		// The first reading from file is 
		// the array size N-1
		// Use StdIn.readInt to scan the file
		int n = StdIn.readInt();
		// Initialize the array
		WeightedQuickUnion wq = new WeightedQuickUnion(n);
		
		// Scan the file
		// Assign the numbers to p and q
		while(!StdIn.isEmpty()) {
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			// if id[p] == id[q], then continue
			// if not, then connect p to q using union instance
			if (wq.connected(p, q)) continue;
			wq.union(p, q);
		}
		// Find total connected components
		System.out.println("There are: " + wq.count + " connected components");
	}
}


