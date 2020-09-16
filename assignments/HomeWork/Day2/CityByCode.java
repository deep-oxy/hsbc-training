
public class CityByCode {
	/*write a method getCityByCode which accepts a number and returns a string based on the following condition.
	Number value :1  return “DELHI”
	Number value : 2  return “NOIDA”
	Number value : 3  return “GUARGAON”
	Number value : 4  return “BANGLORE”
	Any other number return “INVALIDCODE”*/

	public String getCityByCode(int n)
	{
		if(n==1)
		{
			return "DELHI";
		}
		if(n==2)
		{
			return "NOIDA";
		}
		if(n==3)
		{
			return "GUARGAON";
		}
		if(n==4)
		{
			return "BANGLORE";
		}
		return "INVALIDCODE";
	}

	public static void main(String[] args) {
		CityByCode o=new CityByCode();
		System.out.println(o.getCityByCode(2));

	}

}
