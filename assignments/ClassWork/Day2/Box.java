
public class Box {
	
	private int l;
	private int b;
	private int h;
	private String c="color not set";
	private String w="weight not set";
	
	public Box(int l, int b, int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	
	public Box(int l, int b, int h, String c)
	{
		/*this.l=l;
		this.b=b;
		this.h=h;*/
		this(l,b,h);
		this.c=c;
		
	}
	
	public Box(int l)
	{
		this(l,l,l);
	}
	
	public Box(int l, int b, int h, String c, String w)
	{
		/*this.l=l;
		this.b=b;
		this.h=h;*/
		this(l,b,h,c);
		this.w=w;
		
	}
	
	public double vol()
	{
		return l*b*h;
	}
	
	public String col()
	{
		return this.c;
	}
	
	public String wei()
	{
		return this.w;
	}

}
