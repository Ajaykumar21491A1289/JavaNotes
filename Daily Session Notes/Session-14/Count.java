
public class Count {

	public static void main(String[] args) {
		String s = "Java is OO Programming Language";
		int vowels=0,consonants=0,words=1;
		for(int i=0;i<s.length();i++)
		{
			switch(s.charAt(i))
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':vowels++;break;
			case ' ':words++;break;
			default:consonants++;
			}
		}
		System.out.println("No of Vowels = "+vowels);
		System.out.println("No ofConsonants = "+consonants);
		System.out.println("No of Words = "+words);

	}

}
