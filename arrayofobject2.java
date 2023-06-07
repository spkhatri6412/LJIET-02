package assigment;

import java.util.Scanner;

class employee
{
	int empId;
	int salary;
	String empName;
	
	public void setData()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the employee id : ");
		this.empId = sc.nextInt();
		System.out.println("Enter the salary  : ");
		this.salary = sc.nextInt();
		System.out.println("Enter the employee name : ");
		this.empName = sc.next();
		System.out.println();
	}
	
	public void getData()
	{
		System.out.println("Employee Id : "+empId);
		System.out.println("Salary : "+salary);
		System.out.println("Employee Name : "+empName);
	}
}

public class arrayofobject2 {
	
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no. of emplyees : ");
		n = sc.nextInt();
		employee e1[] = new employee[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("\nEnter Data of employee "+i);
			e1[i]=new employee();
			e1[i].setData();	
		}
		
		System.out.println("Total number of emloyees are : "+n+"\n");
		
		System.out.println("--- Details of the employees ---");
		System.out.println();
		for(int i=0;i<n;i++)
		{
			System.out.println("Details of employee "+i);
			e1[i].getData();
			System.out.println();
		}
		
	}

}
