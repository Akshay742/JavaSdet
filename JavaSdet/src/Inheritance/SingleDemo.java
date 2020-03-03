package Inheritance;
import java.util.Scanner;

public class SingleDemo {
	int rollno;
	String name;
	Scanner sc= new Scanner(System.in);
public void enter() {
	System.out.println("enter the rollno");
	rollno= sc.nextInt();
	System.out.println("enter name");
	name=sc.next();
}
public void display() {
	System.out.println("rollno :"+" "+rollno);
	System.out.println("name :"+" "+name);
}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleDemo S1= new SingleDemo();
		S1.enter();
		S1.display();
	}

}
