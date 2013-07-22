package problem5;

//
//Complete the method to return the product of
//all the numbers 1 to the parameter n (inclusive)
//
// 7/4/13

public class MathUtil2
{
	public int product(int n)
	{
	     // TODO: Complete the function to return
	     // the product of 1, ..., N-1, N
		int prodSum = 1;
		for (int i = 1; i <= n; i++) {
			prodSum = i * prodSum;
		}
		return prodSum;
	}
	
	public static void main(String[] args)
	{
		MathUtil2 aProduct = new MathUtil2();
		System.out.println(aProduct.product(4));
	}
}