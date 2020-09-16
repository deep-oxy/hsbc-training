
public class Factorial {
	
	//Write a program to find the factorial of a given number using (for,while )loops
	
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
