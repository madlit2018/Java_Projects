/****************************************************************************
 *  Execution:  java unionfind.QuickUnion < tinyUF.txt
 *  Dependency: StdIn.java 
 *
 *  Quick-union algorithm.
 *  The software is used to find how many connected components
 *  It assigns an Array called id sized n-1 from the first 
 *  number of the file. Ex. 10 assigns id[0] - id[9] 
 *  Connect p and q, set id[p] to the root of id[q]
 *  Ex. 9 4, root of 4 is 8 -> id[9] = 8
 *  * This is faster than QuickFind because it only finds the 
 *  root of p. *QuickUnion finds all the 10 elements each time 
 *  it runs. The worst case could be slower when the tree gets too long. 
 *  
 *  By Yuttanant Suwansiri
 *  
 *  * Implemented from Princeton University Algorithms Lecture
 *
 ****************************************************************************/
package unionfind;

import unionfind.helpers.StdIn;

public class QuickUnion {
	private int id[];
	public int count;
	
	// Constructor
	// Assign id array sized N-1
		public QuickUnion(int n) {
	        id = new int[n];
	        count = n;
	        System.out.println("Assign an Array called id");
	        for (int i = 0; i < n; i++) {
	            id[i] = i;
	        System.out.println("id" + i + " is " + id[i] + " ");
	        }
		}
		
		// Check to see if p and q is connected
		public boolean connected(int p, int q) {
			return root(p) == root(q);
		}	
		
		// Connect p and q, set id[p] to the root of id[q]
		public void union(int p, int q) {
			int i = root(p);
		    int j = root(q);
		    id[i] = j;
		    count--;
		    System.out.println(p + ", " + q);
		    System.out.println("Root of id" + p + " is " + id[i]);
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
		QuickUnion qu = new QuickUnion(n);
		
		// Scan the file
		// Assign the numbers to p and q
		while(!StdIn.isEmpty()) {
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			// if id[p] == id[q], then continue
			// if not, then connect p to q using union instance
			if (qu.connected(p, q)) continue;
			qu.union(p, q);
		}
		// Find total connected components
		System.out.println("There are: " + qu.count + " connected components");
	}
}
