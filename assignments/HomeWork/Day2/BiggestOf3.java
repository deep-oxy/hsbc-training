
public class BiggestOf3 {

	//Write a program to find the biggest among three numbers.
	
	public static void main(String[] args) {
		int a=5, b=55, c=41;
		int biggest=((a>b)?a:b)>c?((a>b)?a:b):c;
		System.out.println("Biggest of 3 is: "+biggest);
	}
}
