import java.lang.*;

public class Example
{
	double lenght, height, width; //by default, they are public
	public Example()
	{
		System.out.println("Default cons called!");
		this.lenght = 0.0;
		this.height = 0.0;
		width = 0.0;
	}
	public Example(double lenght, double height, double width)
	{
		System.out.println("Para cons called!");
		this.lenght = lenght;
		this.height = height;
		this.width = width;
	}
	public void Show()
	{
		System.out.println("Lenght: "+this.lenght);
		System.out.println("Height: "+height);
		System.out.println("Width: "+width);
	}
	public double VolumeCalculate()
	{
		double v = lenght*this.height*width;
		return v;
	}
	public static void main(String[] args)
	{
		Example obj1 = new Example();
		obj1.Show();
		double value1 = obj1.VolumeCalculate();
		System.out.println("Volume1: "+value1);
	
		Example obj2 = new Example(2.2,3.3,4.4);
		obj2.Show();
		double value2 = obj2.VolumeCalculate();
		System.out.println("Volume2: "+value2);
		//System.out.println("Hello!");
	}
}
