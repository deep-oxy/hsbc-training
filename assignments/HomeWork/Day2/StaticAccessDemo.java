
public class StaticAccessDemo {
	
	public void accesss()
	{
		//Using the ordinary methods try to access static variables and test what happens.
		System.out.println("Im in ascesss");
		System.out.println(StaticAccess.v);
	}

	public static void main(String[] args) {
		StaticAccess b=new StaticAccess();
		System.out.println(b.v);
		System.out.println(StaticAccess.v);
		StaticAccessDemo c=new StaticAccessDemo();
		c.accesss();
	}
}
