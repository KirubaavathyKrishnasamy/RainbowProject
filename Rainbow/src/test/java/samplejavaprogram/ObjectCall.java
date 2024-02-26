package samplejavaprogram;

public class ObjectCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Here we are calling methods of Static sample (m1 and m2) using creating object but we can able to get only one method (m2) as m1 is declared as static
		// so to call static methods we use constructors. 

		StaticNonStaticSample sta = new StaticNonStaticSample();
		sta.m2();
	}

}
