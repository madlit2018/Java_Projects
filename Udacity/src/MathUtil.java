
/**
 * Complete the method to find the largest power of 2 less than the given number
 * Use a loop 6/27/13
 */

public class MathUtil {

	public static int sum(int n)
    {
		double count = 0;
	    int num = 0;
        while (num < n) {
        	num = (int) Math.pow(2.0, count);
            count++;
            //System.out.println(num);
        }
        return num / 2;
    }
	
	public static void main(String[] args) {
		System.out.println(sum(100));

	}

}
