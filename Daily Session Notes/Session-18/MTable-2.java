//Multiplication tables from 1 to 10
public class MTable {
	public static void main(String[] args) {
		int n,i,p;
		for(n=1;n<=10;n++)
		{
			for(i=1;i<=10;i++)
			{
				p = n * i;
				System.out.println(n+"*"+i+"="+p);
			}
		}

	}

}
