
public class ConstructorOverloading {
	
	/*Create a Student class.
    1) create a default constructor
    2) over load the constructor
    3) Delete the default constructor keeping the overloaded constructor and test the behavior*/
	
	String name;
	int regno;
	
	/*public ConstructorOverloading(String name)
	{
		this.name=name;
	}*/
	
	public ConstructorOverloading(String name, int regno)
	{
		this.name=name;
		this.regno=regno;
	}
	
	

	public static void main(String[] args) {
		ConstructorOverloading o=new ConstructorOverloading("Piyush");
		System.out.println(o.name+" "+o.regno);

	}

}
