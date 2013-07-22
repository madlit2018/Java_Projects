package problem5;

//
//This modifies the previous problem. Start with that solution as your base
//Complete the code to write nested loops that make the a pattern of brackets: a
//rows x colomuns figure of []
//For example if rows = 2 and columns = 5, the figure will look like this
//[][][][][]
//[][][][][]
//
//
// 7/4/13

public class Drawings
{

	 public void blockPrinter(int rows, int columns)
	 {
	     //TODO Write code to print the pattern above.
		 for (int i = 0; i < rows; i++) 
		 {
			for (int j = 0; j < columns; j++) {
				System.out.print("[]");
			} 
			System.out.println();
		 }
	 }
	 public static void main(String[] args) 
	 {
		 Drawings draw = new Drawings();
		 draw.blockPrinter(2, 5);
	 }
	 
}