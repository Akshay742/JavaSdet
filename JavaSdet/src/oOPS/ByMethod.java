package oOPS;
import java.util.Scanner;

public class ByMethod {
	int empid;
	String name;
	float salary;
	Scanner sc= new Scanner(System.in);
	
	public void EnterDetails() {
		System.out.println("enter the empid");
		empid= sc.nextInt();
		
		System.out.println("enter name");
		
		name= sc.nextLine();
		name= sc.next();
		
		System.out.println("enter salary");
		salary= sc.nextFloat();
	}
	
	public void display() {
		System.out.println(+empid);
		System.out.println(name);
		System.out.println(+salary);
	}

	public static void main(String[] args) {
		ByMethod obj = new ByMethod();
		obj.EnterDetails();
		obj.display();
		

		
		// TODO Auto-generated method stub

	}

}
