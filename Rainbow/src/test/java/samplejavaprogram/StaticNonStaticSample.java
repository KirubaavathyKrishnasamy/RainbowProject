package samplejavaprogram;

public class StaticNonStaticSample {
	
	static int b= 5;
	
	public static void m1()
		{
		
		//System.out.println(a); /// Static method will accept only static values so throwing error
		System.out.println(b);
	}
	
public void m2()
{
	int a = 6;
	System.out.println(a); /// Non Static method will accept Both static and non static values 
	System.out.println(b);
}
}

