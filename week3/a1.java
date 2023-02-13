import java.util.*;
class Area
{
	double length,width;
	Area(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public double area(){
		return length*width;
	}
}
class a1
{
	public static void main(String[] args)
	{
		Area a=new Area(34.5,2);
		System.out.println("Area is "+a.area());
	}
}