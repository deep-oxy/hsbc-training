
public class Emp {
	
	int empId;
	String name;
	public Emp(int empId, String name)
	{
		this.empId=empId;
		this.name=name;
	}
	
	public String getEmpInfo()
	{
		return empId+" "+name;
	}
}
