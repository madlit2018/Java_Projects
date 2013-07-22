
/**
 * Complete the method to find sum of all the positive even numbers less than or equal to the given number
 * use a loop
 */
public class Sum
{
   /**
    * Gets the sum of all the even numbers less than or equal to the given number
    * @param n the given number, the ceiling
    * @return the sum of all the even numbers less that the ceiling
    */
   public static int sum(int n)
   {
	   int count = 0;
	   int num = 0;
       while (count <= n) {
           num = num + count;
           count = count + 2;
//           System.out.println(num);
       }
       return num;
   }

	public static void main(String[] args) {
		System.out.println(sum(10));
		System.out.println("Expect: 30");
		System.out.println(sum(12));
		System.out.println("Expect: 42");
	}
}