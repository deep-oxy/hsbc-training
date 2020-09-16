
public class StaticAccess {
	
	//Create a static variable and test all possible ways of accessing it from the same class and different class
	
	static int v=10;
	
	public void access()
	{
		//Using the ordinary methods try to access static variables and test what happens.
		System.out.println("Im in ascess");
		System.out.println(StaticAccess.v);
	}
	public static void main(String[] args) {
		
		StaticAccess a=new StaticAccess();
		System.out.println(a.v);
		System.out.println(StaticAccess.v);
		a.access();
	}

}
