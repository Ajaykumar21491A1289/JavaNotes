import java.util.*;
public class StackDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack st = new Stack();
		int ele,ch;
		while(true)
		{
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			System.out.println("Enter Choice ");
			ch = in.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter element");
			       ele = in.nextInt();
			       st.push(ele);break;
			case 2:if (st.empty())
					  System.out.println("Stack underflow");
			       else
			       {
			    	   ele = (Integer)st.pop();
			    	   System.out.println(ele+" is poped");
			       }
			       break;
			case 3:if (st.empty())
					  System.out.println("Stack is empty");
			       else
			       {
			    	   ele = (Integer)st.peek();
			    	   System.out.println(ele+" is peeked");
			       }
			       break;
			case 4:System.out.println(st);break;
			case 5:System.exit(1);
				
				
			}
		}
		

	}

}
