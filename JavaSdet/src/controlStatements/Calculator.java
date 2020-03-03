package controlStatements;
import java.util.Scanner;



public class Calculator {
	int num1,num2,res,choice;
	Scanner sc = new Scanner(System.in);
	
	public void enter() {
		System.out.println("enter the num1");
		num1= sc.nextInt();
		System.out.println("enter the num2");
		num2=sc.nextInt();
		System.out.println("enter the choice");
		choice=sc.nextInt();
	}
	
	public void display() {
		switch(choice) {
		case 1:
			res=num1+num2;
			System.out.println(res);
			break;
			
		case 2:
			res=num1-num2;
			System.out.println(res);
			break;
			
			default:
				System.out.println("wrong choice");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj= new Calculator();
		obj.enter();
		obj.display();

	}

}
