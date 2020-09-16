
public class Hello {
	
	/*Create the following methods
     hello(int i), hello(byte i) hello(short i), hello(long i)
    when you call hello(5) which method is called & why.*/

	
	public void hello(int i)
	{
		System.out.println("int i = "+i);
	}
	
	public void hello(byte i)
	{
		System.out.println("byte i = "+i);
	}
	
	public void hello(short i)
	{
		System.out.println("short i = "+i);
	}
	
	public void hello(long i)
	{
		System.out.println("long i = "+i);
	}

	public static void main(String[] args) {
		Hello h=new Hello();
		h.hello(5);

	}

}
