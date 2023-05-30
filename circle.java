import java.util.*;
public class circle
{
    float radius,area,circumference;
	final float PI = (float) Math.PI;
	
	public void setRadius()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius : ");
		radius = sc.nextFloat();
	}
	
	public void getRadius()
	{
		System.out.println("Radius of the circle : "+radius);
	}
	
	public void getArea()
	{
		area = PI * radius * radius;
		System.out.println("Area of the circle : "+area);
	}
	
	public void getCircumference()
	{
		circumference = 2 * PI * radius;
		System.out.println("Circumference of the circle : "+circumference);
	}
   
   public static void main (String args[])
   {
	   circle c1=new circle();
	   c1.setRadius();
	   c1.getRadius();
	   c1.getCircumference();
	   c1.getArea();
   }
}