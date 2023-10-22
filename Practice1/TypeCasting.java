import java.lang.*; //package, * means everyclas under lang

public class TypeCasting
{
	public static void main(String[] args)
	{
		byte b1 = 25;
		System.out.println("Value of b1: "+b1);
		int i1;
		i1 = b1; //implicit casting
		System.out.println("Value of i1: "+i1);
		
		int i2 = 50;
		System.out.println("Value of i2: "+i2);
		long l1;
		l1 = i2; //implicit casting
		System.out.println("Value of l1: "+l1);
		
		double d1 = 2.55;
		System.out.println("Value of d1: "+d1);
		float f1;
		f1 = (float)d1; //explicit casting
		System.out.println("Value of f1: "+f1);
		
		float f2 = 3.09f;
		System.out.println("Value of f2: "+f2);
		byte b2;
		b2 = (byte)f2; //explicit casting
		System.out.println("Value of b2: "+b2);
		
		String s1 = "123";
		int i3;
		i3 = Integer.parseInt(s1); //using wrapper class to covert from non-primitive to primitive
		System.out.println("Value of i3: "+i3);
		
		double d2 = Double.parseDouble(s1); //wrapper class
		System.out.println("Value of d2: "+d2); 




		
		
		
	}
}
