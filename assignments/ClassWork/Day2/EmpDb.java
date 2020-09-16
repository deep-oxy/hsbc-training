
public class EmpDb {
	
	Emp[] empList=new Emp[10];
	
	public EmpDb()
	{
		empList[0]= new Emp(123, "Piyush");
		empList[2]= new Emp(183, "Piyush1");
	}
	
	public void search(int id)
	{
		
	}
	
	public String add(Emp e)
	{
		for(int i=0;i<empList.length;i++)
		{
			if (empList[i]==null)
			{
				empList[i]=e;
				return "Successfully filled";
			}
		}
		return "location already filled";
	}
	
	public void displayall()
	{
		
	}

	public static void main(String[] args) {
		
		EmpDb d=new EmpDb();
		Emp e=new Emp(125, "Podcast");
		System.out.println(d.add(e));
		
	}

}
