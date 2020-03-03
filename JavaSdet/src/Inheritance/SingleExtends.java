package Inheritance;
import java.util.Scanner;

public class SingleExtends extends SingleDemo{
	int english,hindi;
	public void acc() {
		enter();
		display();

	
	
		System.out.println("enter english marks");
		english= sc.nextInt();
		System.out.println("enter hindi marks");
		hindi=sc.nextInt();
	
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleExtends oo= new SingleExtends();
		oo.acc();
		
			

	}

}
