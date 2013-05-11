/****************************************************************************
 *  Execution:  java unionfind.QuickFind < tinyUF.txt
 *  Dependency: StdIn.java 
 *
 *  Quick-find algorithm.
 *  The software is used to find how many connected components
 *  It assigns an Array called id sized n-1 from the first 
 *  number of the file. Ex. 10 assigns id[0] - id[9] 
 *  Connected id[p] to id[q], Ex. 4 3 connects id[4] to id[3]
 *  
 *  By Yuttanant Suwansiri
 *  
 *  Implemented from Princeton University Algorithms Lecture
 *
 ****************************************************************************/

package unionfind;
import unionfind.helpers.*;

public class QuickFind {
	private int id[];
	public int count;
	
	// Constructor
	// Assign id array sized N-1
		public QuickFind(int n) {
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
			return id[p] == id[q];
		}	
		
		// Connect p and q 
		public void union(int p, int q) {
			int pid = id[p];
			System.out.println(p + ", " + q + " means " + "connect id" + p + " to id" + q);
			for (int i = 0; i < id.length; i++) {
				if (id[i] == pid) id[i] = id[q];
				System.out.println("id" + i + " is: " + id[i]);
				//System.out.println("pid is: " + pid);
			}
			count--;
			    System.out.println("count: " + count);
		}
	
	    // Main program
	    public static void main(String[] args) {

		// The first reading from file is 
		// the array size N-1
		// Use StdIn.readInt to scan the file
		int n = StdIn.readInt();
		// Initialize the array
		QuickFind qf = new QuickFind(n);
		
		// Scan the file
		// Assign the numbers to p and q
		while(!StdIn.isEmpty()) {
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			// if id[p] == id[q], then continue
			// if not, then connect p to q using union instance
			if (qf.connected(p, q)) continue;
			qf.union(p, q);
		}
		// Find total connected components
		System.out.println("There are: " + qf.count + " connected components");
	}
	
}
