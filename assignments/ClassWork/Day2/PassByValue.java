
public class PassByValue {
	
	int x=20;
	
	public void display()
	{
		x=10;
		System.out.println("The value="+x);
	}

	public static void main(String[] args) {
		
		PassByValue p=new PassByValue();
		p.display();
		System.out.println(p.x);
		
	}

}
