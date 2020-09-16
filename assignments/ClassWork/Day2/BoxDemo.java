
public class BoxDemo {
	public static void main(String args[])
	{
		Box b1=new Box(10,20,30);
		System.out.println(b1.vol());
		System.out.println(b1.col());
		
		Box b2=new Box(10,20,30,"red");
		System.out.println(b2.vol());
		System.out.println(b2.col());
		
		Box b3=new Box(10,20,30,"red","heavy");
		System.out.println(b3.vol());
		System.out.println(b3.col());
		System.out.println(b3.wei());
		
		Box b4=new Box(10);
		System.out.println(b4.vol());
	}
}
