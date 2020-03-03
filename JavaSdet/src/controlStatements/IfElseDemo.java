package controlStatements;
import java.util.Scanner;

public class IfElseDemo {
	int num1,num2,num3;
	Scanner sc=new Scanner(System.in);
	
	public void Enter() {
		System.out.println("enter num1");
		num1 = sc.nextInt();
		System.out.println("enter num2");
		num2= sc.nextInt();
		System.out.println("enter num3");
		num3= sc.nextInt();
	}
	
	public void display() {
		if(num1>num2) {
			System.out.println("num1 is greater");
		}
		else if(num2>num3){
			System.out.println("num2 is greater");
		}
		else {
			System.out.println("num3 is greater");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfElseDemo obj = new IfElseDemo();
		obj.Enter();
		obj.display();

	}

}
