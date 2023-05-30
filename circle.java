import java.util.*;
public class circle {

	double radius,area,circumference;
	final double PI = 3.14;
	
	public void setRadius()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius : ");
		radius = sc.nextDouble();
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c1=new circle();
		c1.setRadius();
		c1.getArea();
		c1.getCircumference();
	}

}
