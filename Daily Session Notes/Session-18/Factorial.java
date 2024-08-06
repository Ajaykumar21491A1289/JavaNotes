
public class Factorial {
	public static void main(String[] args) {
		int n,i,f,sum=0;
		System.out.println("-----------------------");
		System.out.println("  Number     Factorial ");
		System.out.println("-----------------------");
		for(n=1;n<=5;n++)
		{
			f=1;
			for(i=n;i>=1;i--)
			  f = f * i;
			sum = sum + f;
			System.out.println("   "+n+"          "+f);
		}
		System.out.println("----------------------");
		System.out.println("   Sum  =     "+sum);
		System.out.println("-----------------------");
	}

}
