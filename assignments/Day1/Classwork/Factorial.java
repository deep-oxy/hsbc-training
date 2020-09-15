
public class Factorial {
	
	//program to display the factorial of 6
	
	public static void main(String Args[])
	{
		int n=6;
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial of "+n+" = "+f);
	}
}
