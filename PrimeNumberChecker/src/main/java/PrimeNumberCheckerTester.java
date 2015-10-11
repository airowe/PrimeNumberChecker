
public class PrimeNumberCheckerTester 
{
	public static void main(String[] args) 
	{
		int primeNumbers = 10;
		int foundPrimeNumbers = 0;
		for(int i = 2;foundPrimeNumbers < primeNumbers;i++)
		{
			if(isPrime(i))
			{
				foundPrimeNumbers++;
				System.out.println("Prime Num: " + i);				
			}
		}		
	}
	
	private static boolean isPrime(int number)
	{
		for(int i = 2; i <= Math.sqrt(number); i++) 
		{
	        if(number % i == 0)
	            return false;
	    }
	    return true;
	}

}
