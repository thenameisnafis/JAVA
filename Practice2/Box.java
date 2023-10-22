import java.lang.*;
public class Box
{
	private double lenght, height, width;
	
	public Box()
	{
		System.out.println("Default cons called!");
		this.lenght = 0.0;
		height = 0.0;
		width = 0.0;
	}
	public Box(double a, double b, double c)
	{
		System.out.println("Para cons called!");
		this.lenght = a;
		this.height = b;
		width = c;
	}
	public void setLenght(double x)
	{
		this.lenght = x;
	}
	public void setHeight(double y)
	{
		this.height = y;
	}
	public void setWidth(double z)
	{
		this.width = z;
	}
	public double getLenght()
	{
		return this.lenght;
	}
	public double getHeight()
	{
		return this.height;
	}
	public double getWidth()
	{
		return this.width;
	}
	public void Show()
	{
		System.out.println("Lenght: "+this.lenght);
		System.out.println("Height: "+this.height);
		System.out.println("Width: "+this.width);

	}
	public static void main(String[] args)
	{
		Box obj1 = new Box();
		//System.out.println(obj1.lenght);
		obj1.setLenght(1.2);
		obj1.setHeight(2.3);
		obj1.setWidth(3.4);
		System.out.println("Length: "+obj1.getLenght());
		obj1.Show();
	}
}