import java.lang.*;

public class JavaClass
{
	boolean b1;
	boolean b2 = true;
	int i1 = 7;
	int i2;
	
	public JavaClass()
	{
		System.out.println("Default cons calling!");
		this.b1 = false;
		b2 = false;
		i1 = 5;
	}	
	public JavaClass(int a, int b)
	{
		System.out.println("Two para cons calling!");
		this.i1 = a;
		i2 = b;
	}
	public JavaClass(int x, int y, boolean c1)
	{
		System.out.println("Three para cons calling!");
		i1 = x;
		i2 = y;
		b1 = c1;
	}
	public void Show()
	{
		System.out.println("Showing!");
		System.out.println("Value of b1: "+this.b1);
		System.out.println("Value of b2: "+b2);
		System.out.println("Value of i1: "+this.i1);
		System.out.println("Value of i2: "+this.i2);

	}
	
	
	public static void main(String[] args)
	{
		JavaClass obj1; //creating an object of JavaClass
		obj1 = new JavaClass(); //initiazing the object
		System.out.println(obj1);
		
		JavaClass obj2 = new JavaClass();
		System.out.println("Default value of b1: "+obj2.b1);
		obj2.b1 = true;
		System.out.println("New value of b1: "+obj2.b1);
		System.out.println("Vlue of b2: "+obj2.b2);
		System.out.println(obj2.i1);
		
		obj2.Show();
		
		JavaClass obj3 = new JavaClass(2,10);
		obj3.Show();
		
		JavaClass obj4 = new JavaClass(6,7, true);
		obj4.Show();
	}
}
