//Anonymous Inner class
class PopCorn
{
	void taste()
	{
		System.out.println("Salty...");
	}
}
public class InnerDemo4 {

	public static void main(String[] args) {
		PopCorn p = new PopCorn(){
			void taste()
			{
				super.taste();
				System.out.println("Sweety...");
			}
		};
		p.taste();

	}

}
