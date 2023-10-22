import java.lang.*;
public class StaticBlock
{
	public static int x; //class variable
	public StaticBlock()
	{
		System.out.println("Default cons called!");
	}
	static //static block
	{
		System.out.println("Static block1 called!");
		x = 50;
	}
	static //static block
	{
		System.out.println("Static block2 called!");
	}
	public static void main(String[] args)
	{
		StaticBlock obj1 = new StaticBlock();
		StaticBlock obj2 = new StaticBlock();
		System.out.println(StaticBlock.x);
	}

}