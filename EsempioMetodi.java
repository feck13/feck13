
public class EsempioMetodi {
	
	public static double potenza(double x, int n)
	{
		double m = x;
		for (int i = 1; i<n; i++)
			m *= x;
		return m;
	}
	
	public static void main(String[] args)
	{
		double d = potenza(3,2);
		System.out.println(d);
		System.out.println(potenza(3.14,2));
	}
};