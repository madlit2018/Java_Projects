// Bluej project: lesson6/credit_card
// Video: Credit Card Checksum 

// TODO: Implement the isValid method.
// validate credit card number 6/25/13

public class CreditCard
{
    private long cardNumber;

    public CreditCard(long cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    /**
     * Calculates whether this CreditCard has a valid number.
     * @return true if the number is valid, false if it's not.
     */
    public boolean isValid()
    {
        /* Pseudocode for isValid:
         * sum = 0
         * count = 0
         * for each digit starting from the right
         *     count ++
         *     if count is odd
         *         sum = sum + digit
         *     else if (digit < 5)
         *         sum = sum + 2 * digit
         *     else
         *         sum = sum + 2 * digit - 9
         * if the last digit of the sum is zero
         *     The card number is valid
         */
        long n = cardNumber;
        int sum = 0;
        int count = 0;

        // TODO this is the code from the last question. you can use it
        // as a starting point, but you will need to change most of it.
        while (n > 0)
        {
            int digit = (int)(n % 10); // 
            count++;
            if (count % 2 == 1) 
            {
                sum = sum + digit;
            }
            else if (digit < 5)
            {
                sum = sum + 2 * digit;
            }
            else 
            {
                sum = sum + 2 * digit - 9;
            }    
            n = n/10;           
        }
        
        System.out.println(sum);
        return sum % 10 == 0;
    }
    
    public static void main(String[] args)
    {
    	CreditCard card1 = new CreditCard(4417123456789113L);   	
    	System.out.println("The card is valid: " + card1.isValid());
    	CreditCard card2 = new CreditCard(4417123465789113L);   	
    	System.out.println("The card is valid: " + card2.isValid());
    }
}
