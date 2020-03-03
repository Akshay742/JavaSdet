package controlStatements;
import java.util.Scanner;

public class Swapping {
	int num1,num2
	//num3
	;
	Scanner sc = new Scanner(System.in);
	
	public void enter() {
		System.out.println("enter the num1");
		num1= sc.nextInt();
		System.out.println("enter the num2");
		num2= sc.nextInt();
	}
	public void display() {
		//num3=num1;
		//num1=num2;
		//num2=num3;
		num1= num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("num1"+" "+num1);
		System.out.println("num2"+" "+num2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swapping obj= new Swapping();
		obj.enter();
		obj.display();

	}

}
