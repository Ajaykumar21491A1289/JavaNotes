//Display nos which contains digit 9
public class Digit9 {

	public static void main(String[] args) {
		int n=1,m,r;
		while (n <= 100)
		{
			m = n;
			while (m != 0)
			{
				r = m % 10;
				if (r == 9)
				{
					System.out.println(n);
					break;
				}
				m = m/10;
			}
			n++;
		}

	}

}
