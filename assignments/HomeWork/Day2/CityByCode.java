
public class CityByCode {
	/*write a method getCityByCode which accepts a number and returns a string based on the following condition.
	Number value :1  return “DELHI”
	Number value : 2  return “NOIDA”
	Number value : 3  return “GUARGAON”
	Number value : 4  return “BANGLORE”
	Any other number return “INVALIDCODE”*/

	public String getCityByCode(int n)
	{
		
		switch (n)
		{
		case 1:
			return "DELHI";
			
		case 2:
			return "NOIDA";
			
		case 3:
			return "GUARGAON";
		
		case 4:
			return "BANGLORE";
			
		default:
			return "INVALIDCODE";
		}
		
		
	}

	public static void main(String[] args) {
		CityByCode o=new CityByCode();
		System.out.println(o.getCityByCode(55));

	}

}
