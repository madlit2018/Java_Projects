import java.util.Random;


public class TestCode {

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
		int[] primes = {2, 3, 5, 7, 11};
		for (int i = 0; i < 2; i++) 
		{
			primes[4 - i] = primes[i];
		}
		
		for (int value : primes)
		{
			System.out.println(value);
		}
		
	}

}
