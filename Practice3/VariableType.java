import java.lang.*;
public class VariableType
{
	int y = 20; //instance variable
	public static int z = 30; //class variable
	public static void main(String[] args)
	{
		int x = 10; //local variable
		System.out.println("Local variable: "+x);
		
		VariableType obj1 = new VariableType();
		System.out.println("Instance variable: "+obj1.y);
		
		System.out.println("Class variable: "+obj1.z);
	}
}