
public class Duck {
	static
	{
		System.out.println("This is frm static block");
	}
	
	 static int duckCount=0;
	
	public Duck()
	{
		duckCount++;
	}
	
	public static String getDuckBreed()
	{
		return "Donald Duck";
	}

}
