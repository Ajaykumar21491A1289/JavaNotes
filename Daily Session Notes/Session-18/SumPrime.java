//Sum of prime numbers 
public class SumPrime {

	public static void main(String[] args) {
		int sum = 0;
	    for(int n=2;n<=100;n++)
	    {
	    	if (Prime.prime(n))
	    		sum = sum + n;
	    }
	    System.out.println("Sum of primes = "+sum);
	}

}
