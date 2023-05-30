import java.util.*;
public class circle
{
   final double PI = 3.14;
   double area,circumference,radius;
   
   public void setRadius()
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Radius : ");
	   radius = sc.nextInt();
   }
   
   public void getArea()
   {
	   area = PI * radius * radius;
	   circumference = 2 * PI * radius;
	   System.out.println("Area of the Circle : "+area);
	   System.out.println("Circumference of the Circle : "+circumference);
   }
   
   public static void main (String args[])
   {
	   circle c1=new circle();
	   c1.setRadius();
	   c1.getArea();
   }
}