
public class Adder {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		int s=0;
		if (args.length>=3)
		{
			for(int i=1;i<args.length;i++)
			{
				s=s+Integer.parseInt(args[i]);
			}
			System.out.println("Sum = "+s);
		}
		else
		{
			System.out.println("Please enter atleast 2 numbers to add");
		}
	}

}
