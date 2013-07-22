package circularfield;

//BlueJ Project: lesson4/fields

public class Plot
{
 private int width;
 private int length;

 /**
     Constructs a plot of a given size.
     @param width the widtah of the plot
     @param length the length of the plot
 */
 public Plot(int width, int length)
 {
     this.width = width;
     this.length = length;
 }

 /**
  * Calculates the number of circular fields that can fit on this plot.
  */
 public int getNumberOfFields(int radius)
 {
     // TODO: Using the formulas that we developed, compute
     // the total number of rows, then
     // the number of even and odd rows,
     // the number of columns in each even and odd row,
     // and finally the total number of fields
     int row = (int)((length - radius * 2) / (radius * Math.sqrt(3)) + 1);    
     int oddRowColumn = width / (radius * 2);
     int evenRowColumn = (width - radius) / (radius * 2);
     int oddRow = (row + 1) / 2;
     int evenRow = row / 2;
     
//     System.out.println(row);
//     System.out.println(oddRowColumn);
//     System.out.println(evenRowColumn);
//     System.out.println(oddRow);
//     System.out.println(evenRow);
     
     return oddRowColumn * oddRow + evenRowColumn * evenRow;
 }
}
